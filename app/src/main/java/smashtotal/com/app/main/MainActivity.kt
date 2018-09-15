package smashtotal.com.app.main

import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import smashtotal.com.app.R
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var menuAdapter: MainMenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuAdapter.menuItems = menuItems

        menu_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        menu_list.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        menu_list.adapter = menuAdapter

    }

    val menuItems: List<MenuIem> = listOf(
            object : MenuIem("Jugar Torneo", "smashtotal.com.app.playtournament.PlayTournamentActivity"){},
            object : MenuIem("Tabla de Posiciones", "PlayTournamentActivity"){},
            object : MenuIem("Jugar Torneo", "PlayTournamentActivity"){}
    )
}
