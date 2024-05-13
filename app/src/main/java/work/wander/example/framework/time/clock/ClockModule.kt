package work.wander.example.framework.time.clock

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ClockModule {

    @Provides
    @Singleton
    fun provideAppClock(): AppClock {
        return object : AppClock {
            override fun currentTimeMillis(): Long {
                return System.currentTimeMillis()
            }
        }
    }

}