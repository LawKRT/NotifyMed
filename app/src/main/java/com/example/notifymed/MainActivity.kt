package com.example.notifymed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.notifymed.fragments.MedicationFragment
import com.example.notifymed.fragments.ProfileFragment
import com.example.notifymed.fragments.RegisterFragment
import com.example.notifymed.fragments.SettingsFragment
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity(){
    private lateinit var toogle: ActionBarDrawerToggle
    private lateinit var fAuth: FirebaseAuth
    private lateinit var drawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fAuth = Firebase.auth

        val drawerLayout: DrawerLayout  = findViewById(R.id.drawerlayout)
        val navView : NavigationView= findViewById(R.id.navigationView)

        toogle = ActionBarDrawerToggle(this, drawerLayout,R.string.open, R.string.close )
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {

            it.isChecked = true

            when(it.itemId){

                R.id.id_medication_Fragment -> replaceFragment(MedicationFragment(), it.title.toString())
                R.id.id_profile_Fragment -> replaceFragment(ProfileFragment(), it.title.toString())
                R.id.register -> replaceFragment(RegisterFragment(), it.title.toString())
                R.id.id_settings_Fragment -> replaceFragment(SettingsFragment(), it.title.toString())
            }

            true

        }

    }

    private fun replaceFragment(fragment: Fragment, title :String){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)


    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toogle.onOptionsItemSelected(item)){

        return true
    }

        return super.onOptionsItemSelected(item)
    }
}