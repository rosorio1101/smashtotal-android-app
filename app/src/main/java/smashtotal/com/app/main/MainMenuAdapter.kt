package smashtotal.com.app.main

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import smashtotal.com.app.di.scope.MainActivityScope
import javax.inject.Inject

@MainActivityScope
class MainMenuAdapter
@Inject constructor(private val viewHolderProviders: Map<Int,@JvmSuppressWildcards MenuViewHolderProvider>,
                    private val itemClickHandler: MainMenuItemClickHandler)
    : RecyclerView.Adapter<MenuViewHolder>() {

    var menuItems: List<MenuIem> = emptyList()


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MenuViewHolder
            = viewHolderProviders.get(viewType)?.get(viewGroup)!!

    override fun getItemCount(): Int {
        return menuItems.size
    }

    override fun onBindViewHolder(viewHolder: MenuViewHolder, position: Int) {
        with(menuItems[position]) {
            viewHolder.render(this)
            viewHolder.itemView.setOnClickListener {
                itemClickHandler(this, it)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return MenuViewHolder.VIEW_TYPE_MENU
    }
}

