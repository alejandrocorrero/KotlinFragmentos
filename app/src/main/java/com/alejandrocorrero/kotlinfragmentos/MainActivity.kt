package com.alejandrocorrero.kotlinfragmentos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.alejandrocorrero.kotlinfragmentos.utils.executeTransaction
import android.view.MenuInflater
import android.view.MenuItem


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportFragmentManager.findFragmentByTag("Fragment1") == null) {
            supportFragmentManager.executeTransaction { replace(R.id.frmprueba, FirstFragment(), "Fragment1") }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.frg1 -> if (supportFragmentManager.findFragmentByTag("Fragment1") == null) {
                supportFragmentManager.executeTransaction { replace(R.id.frmprueba, FirstFragment(), "Fragment1") }
            }
            R.id.frg2 -> if (supportFragmentManager.findFragmentByTag("Fragment2") == null) {
                supportFragmentManager.executeTransaction {
                    replace(R.id.frmprueba, SecondFragment
                    (), "Fragment2")
                }
            }

        }
        return super.onOptionsItemSelected(item)
    }

}
