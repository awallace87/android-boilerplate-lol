package work.wander.example.data.settings

import kotlinx.coroutines.flow.Flow
import work.wander.example.proto.settings.ApplicationSettings

interface ApplicationSettingsRepository {

    fun getApplicationSettings(): Flow<ApplicationSettings>

    suspend fun updateApplicationSettings(applicationSettings: ApplicationSettings)
}