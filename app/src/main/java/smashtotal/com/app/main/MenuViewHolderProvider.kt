package smashtotal.com.app.main

import android.view.ViewGroup

interface MenuViewHolderProvider {
    fun get(viewGroup: ViewGroup): MenuViewHolder
}