package com.anyuaning.mibo.kotlin

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import com.anyuaning.mibo.R
import com.google.firebase.analytics.FirebaseAnalytics

import kotlinx.android.synthetic.main.activity_mibo_main.*;


class MiboMainActivity : AppCompatActivity() {

    lateinit var mFirebaseAnalytics:FirebaseAnalytics;  // diff lateinit and lazy

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mibo_main)

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this)

//        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

//        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener {
            view -> Snackbar.make(view, "Replace with your own action",
                Snackbar.LENGTH_LONG).setAction("Action", null).show()

            var bundle: Bundle = Bundle()
            bundle.putString(FirebaseAnalytics.Param.ITEM_ID, view.id.toString())
            bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "action")
            bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "snackbar")
            mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_mibo_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
