package work.wander.example.data.roomdemo

import kotlinx.coroutines.flow.Flow
import work.wander.example.data.roomdemo.entity.DemoEntity

interface RoomDemoDataRepository {

    fun getAll(): Flow<List<DemoEntity>>

    suspend fun insertData(data: String)

    suspend fun updateData(id: Int, data: String)

    suspend fun deleteData(entity: DemoEntity)
}