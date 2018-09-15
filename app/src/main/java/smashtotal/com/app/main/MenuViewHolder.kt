package smashtotal.com.app.main

import android.support.annotation.IntDef
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.MapKey
import kotlinx.android.synthetic.main.menu_item_layout.view.*
import smashtotal.com.app.R

class MenuViewHolder(val view:ViewGroup):
        RecyclerView.ViewHolder(
                LayoutInflater
                        .from(view.context)
                        .inflate(R.layout.menu_item_layout, view, false)) {

    companion object : MenuViewHolderProvider {
        const val VIEW_TYPE_MENU: Int = 1
        override fun get(viewGroup: ViewGroup): MenuViewHolder = MenuViewHolder(viewGroup)
    }

    fun render(menuItem: MenuIem) {
        itemView.item_title.text = menuItem.title
    }

    @IntDef(value = [VIEW_TYPE_MENU])
    annotation class MenuViewType

    @MapKey
    annotation class MenuViewHolderKey(@MenuViewType val value: Int)

}