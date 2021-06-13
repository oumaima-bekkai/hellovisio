package com.example.visio_apsy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.util.Log;
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_home2.*


class HomeFragment2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home2)

        btnprofile.setOnClickListener {
            val action = HomeFragment2Directions.actionHomefragmentToLoginFragment()
            findNavController().navigate(action)

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

    fun profilebtn(view: View) {
        Toast.makeText(this,"Clicked profile", Toast.LENGTH_SHORT).show()
    }


}
