package smashtotal.com.app.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import smashtotal.com.app.di.scope.MainActivityScope
import smashtotal.com.app.main.MenuViewHolder
import smashtotal.com.app.main.MenuViewHolder.Companion.VIEW_TYPE_MENU
import smashtotal.com.app.main.MenuViewHolderProvider

@Module class MenuModule {

    @MainActivityScope
    @Provides
    @IntoMap
    @MenuViewHolder.MenuViewHolderKey(value = VIEW_TYPE_MENU)
    fun provideMenuViewHolderProvider(): MenuViewHolderProvider = MenuViewHolder
}