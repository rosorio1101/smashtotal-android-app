package smashtotal.com.app

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import smashtotal.com.app.di.component.DaggerSmashTotalAppComponent

class SmashTotalApp: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerSmashTotalAppComponent.builder().create(this)
}