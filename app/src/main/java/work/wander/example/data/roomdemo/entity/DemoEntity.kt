package work.wander.example.data.roomdemo.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "examples")
data class DemoEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val data: String,
    val lastModifiedEpochMillis: Long = System.currentTimeMillis(),
) {
}
