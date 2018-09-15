package smashtotal.com.app.di.component

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import smashtotal.com.app.SmashTotalApp
import smashtotal.com.app.di.module.ActivityModule
import smashtotal.com.app.di.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = arrayOf(
                AndroidSupportInjectionModule::class,
                AppModule::class,
                ActivityModule::class
        )
)
interface SmashTotalAppComponent: AndroidInjector<SmashTotalApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<SmashTotalApp>()

}