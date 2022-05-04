package com.example.feelthefeelsmoodassessment

//Author: Natasha Lucio
//Course: CSCI 4020-W1
//Date: 4 May 2022
//Task: Final Project - Mood Result Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import com.example.feelthefeelsmoodassessment.databinding.ActivityMoodResultBinding

class MoodResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMoodResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoodResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentValue = intent.getStringExtra("Summary")

        binding.editTextSummary.setText(intentValue)
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

}// end of MoodResultActivity