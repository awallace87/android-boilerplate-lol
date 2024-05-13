package work.wander.example.data.settings

import androidx.datastore.core.DataStore
import kotlinx.coroutines.flow.Flow
import work.wander.example.proto.settings.ApplicationSettings
import javax.inject.Inject

class DefaultApplicationSettingsRepository @Inject constructor(
    private val applicationSettingsDataStore: DataStore<ApplicationSettings>
) : ApplicationSettingsRepository {

    override fun getApplicationSettings(): Flow<ApplicationSettings> {
        return applicationSettingsDataStore.data
    }

    override suspend fun updateApplicationSettings(applicationSettings: ApplicationSettings) {
        applicationSettingsDataStore.updateData {
            applicationSettings
        }
    }
}