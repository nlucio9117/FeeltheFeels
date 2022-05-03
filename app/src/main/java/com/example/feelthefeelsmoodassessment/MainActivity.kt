package com.example.feelthefeelsmoodassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import com.example.feelthefeelsmoodassessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),
  RadioGroup.OnCheckedChangeListener {
    private lateinit var binding: ActivityMainBinding

    var color : String = ""
    var summary : String  = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.radioGroupEmotions.setOnCheckedChangeListener(this)
        binding.buttonSubmit.setOnClickListener(SubmitListener())
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

    inner class SubmitListener : View.OnClickListener {
        override fun onClick(p0: View?) {
            val intent = Intent(applicationContext, MoodResultActivity::class.java)
            startActivity(intent)
        }
    }//end of inner class



    override fun onCheckedChanged(radioGroup: RadioGroup?, buttonId: Int) {
        color = "Black"
        summary = "A symbol of power and authority.\n" +
                "\n" +
                "Black is also used as a color of sophistication and elegance, often provoking emotions of mystery.\n" +
                "\n" +
                "Black is also associated with evil, taboo."
        if (buttonId == R.id.radioButton_mysterious) {
            val intent = Intent(applicationContext, MoodResultActivity::class.java)
            intent.putExtra("Black", "${color.toString()}")
            intent.putExtra("Summary", summary.toString())
            startActivity(intent)

            Log.i("STATUS", "${color}")
            Log.i("STATUS", "${summary}")


        }
        if (buttonId == R.id.radioButton_depressed) {
            color = "Blue"
            summary = "One of the must commonly used colors. Blue is the color of the sky and is often associated with tranquility, depth, honor, trusts and productivity. Blue is also said to decrease one's appetite.\n" +
                    "\n" +
                    "Acceptance, Authority, Balance, Calmness, Care, Caution, Cleanliness, Coolness, Cooperation, Compassion, Confidence, Contemplation, Culture, Depression, Despair, Depth, Dignity, Faith, Flexibility, Frankness, Freedom, Freshness, Goodness, Harmony, Honesty, Hope, Ice, Infinity, Intelligence, Introspection, Isolation, Law, Logic, Loyalty, Maturity, Obedience, Order, Peace, Piety, Power, Protection, Quality, Quietness, Reflection, Reliability, Responsibility, Sadness, Security, Self Control, Serenity, Sincerity, Solitude, Stability, Stiffness, Technology, Tenderness, Tradition, Tranquility, Transparency, Trust, Truth, Unity, Value, Virtue, Water."
        }
        if (buttonId == R.id.radioButton_outdoorsy) {
            color = "Brown"
            summary = "Solid, dependable, and confident are often Traits attributed to brown. It can be though of as being both conventional and sophisticated depending on its intended use.\n" +
                    "\n" +
                    "Nature, Outdoorsy, Reliability, Ruggedness, Security, Support, Tough."
        }


    }

}
