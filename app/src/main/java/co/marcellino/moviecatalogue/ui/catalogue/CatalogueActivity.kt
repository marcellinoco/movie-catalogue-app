package co.marcellino.moviecatalogue.ui.catalogue

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import co.marcellino.moviecatalogue.R
import kotlinx.android.synthetic.main.activity_catalogue.*

class CatalogueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogue)

        setSupportActionBar(toolbar_catalogue)
        supportActionBar?.elevation = .0f

        val cataloguePagerAdapter = CataloguePagerAdapter(this, supportFragmentManager)
        vp_catalogue.adapter = cataloguePagerAdapter
        tabs_catalogue.setupWithViewPager(vp_catalogue)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_catalogue, menu)
        return super.onCreateOptionsMenu(menu)
    }
}