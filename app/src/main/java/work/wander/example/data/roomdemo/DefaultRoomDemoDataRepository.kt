package work.wander.example.data.roomdemo

import kotlinx.coroutines.flow.Flow
import work.wander.example.data.roomdemo.entity.DemoEntity
import work.wander.example.framework.time.clock.AppClock
import javax.inject.Inject

class DefaultRoomDemoDataRepository @Inject constructor(
    private val demoRoomDatabase: DemoRoomDatabase,
    private val appClock: AppClock,
) : RoomDemoDataRepository {
    override fun getAll(): Flow<List<DemoEntity>> {
        return demoRoomDatabase.demoEntityDao().getAll()
    }

    override suspend fun insertData(data: String) {
        return demoRoomDatabase.demoEntityDao().insertEntity(
            DemoEntity(data = data)
        )
    }

    override suspend fun updateData(id: Int, data: String) {
        return demoRoomDatabase.demoEntityDao().updateEntity(
            DemoEntity(id = id, data = data, lastModifiedEpochMillis = appClock.currentTimeMillis())
        )
    }

    override suspend fun deleteData(entity: DemoEntity) {
        demoRoomDatabase.demoEntityDao().deleteEntity(entity)
    }
}