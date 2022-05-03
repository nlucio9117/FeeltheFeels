package com.example.feelthefeelsmoodassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import com.example.feelthefeelsmoodassessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_menu_item) {
            val builder = AlertDialog.Builder(binding.root.context)

            builder.setTitle(R.string.About)
            builder.setMessage(R.string.message)
            builder.setPositiveButton(android.R.string.ok, null)
            builder.show()
        }//end if statement
        return super.onOptionsItemSelected(item)
    }//end of onOptionsItemSelected

}//end of MainActivity
