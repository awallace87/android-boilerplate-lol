package work.wander.example.data.roomdemo

import androidx.room.Database
import androidx.room.RoomDatabase
import work.wander.example.data.roomdemo.entity.DemoEntity

@Database(entities = [DemoEntity::class], version = 2, exportSchema = false)
abstract class DemoRoomDatabase : RoomDatabase() {
    abstract fun demoEntityDao(): DemoEntityDao
}