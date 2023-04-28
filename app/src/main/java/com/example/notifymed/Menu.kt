//package com.example.notifymed
//
//import android.os.Bundle
//import android.view.Menu
//import android.view.MenuInflater
//import android.view.MenuItem
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//
//class Menu : AppCompatActivity(){
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
//    }
//
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        val inflater: MenuInflater = menuInflater
//        inflater. inflate(R.menu.activity_menu, menu)
//        return true
//
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when(item.itemId){
//            R.id.Medication -> {
//                Toast.makeText(this, "Medication selected", Toast.LENGTH_LONG ).show()
//                true
//            }
//
//            R.id.add -> {
//                Toast.makeText(this, "Add Medication ", Toast.LENGTH_LONG ).show()
//                true
//            }
//
//
//            R.id.alarm -> {
//                Toast.makeText(this, "Alarm reminder", Toast.LENGTH_LONG ).show()
//                true
//            }
//
//            R.id.search_badge-> {
//                Toast.makeText(this, "Search", Toast.LENGTH_LONG ).show()
//                true
//            }
//
//            R.id.Profile -> {
//                Toast.makeText(this, "Profile selected", Toast.LENGTH_LONG ).show()
//                true
//            }
//
//            R.id.User -> {
//                Toast.makeText(this, "Profile selected", Toast.LENGTH_LONG ).show()
//                true
//            }
//            R.id.Account -> {
//                Toast.makeText(this, "Profile selected", Toast.LENGTH_LONG ).show()
//                true
//            }
//
//
//            R.id.Settings -> {
//                Toast.makeText(this, "Settings selected", Toast.LENGTH_LONG ).show()
//                true
//            }
//
//            R.id.About -> {
//                Toast.makeText(this, "About selected", Toast.LENGTH_LONG ).show()
//                true
//            }
//
//            R.id.End -> {
//                Toast.makeText(this, "End of Dose selected", Toast.LENGTH_LONG ).show()
//                true
//            }
//
//
//            R.id.notification_background -> {
//                Toast.makeText(this, "Notifications selected", Toast.LENGTH_LONG ).show()
//                true
//            }
//
//
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
//    }