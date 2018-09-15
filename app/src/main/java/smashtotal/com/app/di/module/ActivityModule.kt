package smashtotal.com.app.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import smashtotal.com.app.di.scope.MainActivityScope
import smashtotal.com.app.main.MainActivity

@Module abstract class ActivityModule {
    @MainActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MenuModule::class))
    abstract fun contributeMainActivity() : MainActivity
}