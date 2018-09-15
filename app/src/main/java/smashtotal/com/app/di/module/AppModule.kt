package smashtotal.com.app.di.module

import android.content.Context
import dagger.Binds
import dagger.Module
import smashtotal.com.app.SmashTotalApp
import javax.inject.Singleton

@Module abstract class AppModule {
    @Binds @Singleton abstract fun bindsContext(app: SmashTotalApp) : Context
}