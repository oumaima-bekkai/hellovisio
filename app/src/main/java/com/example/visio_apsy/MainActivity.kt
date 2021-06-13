package com.example.visio_apsy

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.visio_apsy.databinding.ActivityMainBinding
import com.flurry.android.FlurryAgent
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    private val loginFragment = LoginFragment() as Fragment
    private val binding = ActivityMainBinding.inflate(layoutInflater)

    private lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(binding.root)
        replaceFragment(loginFragment)

        FlurryAgent.Builder()
            .withLogEnabled(true)
            .build(this, "KQN97GN9X96J5VY2JP33")



        val drawerLayout:DrawerLayout=findViewById(R.id.drawerLayout)
        val navView:NavigationView=findViewById(R.id.navView)


        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext,"Clicked Home", Toast.LENGTH_SHORT).show()
                R.id.nav_settings -> Toast.makeText(applicationContext,"Clicked Settings", Toast.LENGTH_SHORT).show()
                R.id.nav_contact -> Toast.makeText(applicationContext,"Clicked Contact", Toast.LENGTH_SHORT).show()
                R.id.nav_manual -> Toast.makeText(applicationContext,"Clicked Manual", Toast.LENGTH_SHORT).show()
                R.id.nav_about -> Toast.makeText(applicationContext,"Clicked About", Toast.LENGTH_SHORT).show()

            }
            true
        }



    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun replaceFragment(fragment:Fragment){
        if (fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment )
            transaction.commit()
        }

    }


    fun callsbtn(view: View) {
        Toast.makeText(this,"Clicked calls", Toast.LENGTH_SHORT).show()
    }
    fun messagesbtn(view: View) {
        Toast.makeText(this,"Clicked messages", Toast.LENGTH_SHORT).show()
    }
    fun calandersbtn(view: View) {
        Toast.makeText(this,"Clicked calander", Toast.LENGTH_SHORT).show()
    }


}
