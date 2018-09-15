package smashtotal.com.app.main

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Toast
import smashtotal.com.app.commons.ItemClickHandler
import javax.inject.Inject

class MainMenuItemClickHandler @Inject constructor(private val context: Context): ItemClickHandler<MenuIem> {
    override fun invoke(menuIem: MenuIem, view: View) {
        try {
            val intent = Intent(context, Class.forName(menuIem.link))
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(context, "No se encontro la activity " + menuIem.link, Toast.LENGTH_SHORT).show()
        }
    }
}