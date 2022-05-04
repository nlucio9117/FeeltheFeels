package com.example.feelthefeelsmoodassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.RadioGroup
import androidx.appcompat.app.AlertDialog
import com.example.feelthefeelsmoodassessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),
  RadioGroup.OnCheckedChangeListener {
    private lateinit var binding: ActivityMainBinding

    var summary : String  = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.radioGroupEmotions.setOnCheckedChangeListener(this)
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

    override fun onCheckedChanged(radioGroup: RadioGroup?, buttonId: Int) {
        if (buttonId == R.id.radioButton_evil) {
            summary = "Associated Emoji: \uD83D\uDE08\n\n" + "Associated Color: Black\n\n" + "A symbol of power and authority.\n\n" +
                    "Black is also used as a color of sophistication and elegance, often provoking emotions of mystery.\n\n" +
                    "Black is also associated with evil, taboo."
            val intent = Intent(applicationContext, MoodResultActivity::class.java)
            intent.putExtra("Summary", summary.toString())
            startActivity(intent)

            Log.i("STATUS", "${summary}")
        }

        if (buttonId == R.id.radioButton_depressed) {
            summary = "Associated Emoji: \uD83D\uDE22\n\n" + "Associated Color: Blue\n\n" + "One of the must commonly used colors. Blue is the color of the sky and is often associated with " +
                    "tranquility, depth, honor, trusts and productivity. Blue is also said to decrease one's appetite.\n\n" +
                    "Acceptance, Authority, Balance, Calmness, Care, Caution, Cleanliness, Coolness, Cooperation, Compassion, " +
                    "Confidence, Contemplation, Culture, Depression, Despair, Depth, Dignity, Faith, Flexibility, Frankness, Freedom, " +
                    "Freshness, Goodness, Harmony, Honesty, Hope, Ice, Infinity, Intelligence, Introspection, Isolation, Law, Logic, Loyalty, " +
                    "Maturity, Obedience, Order, Peace, Piety, Power, Protection, Quality, Quietness, Reflection, Reliability, Responsibility, " +
                    "Sadness, Security, Self Control, Serenity, Sincerity, Solitude, Stability, Stiffness, Technology, Tenderness, Tradition, " +
                    "Tranquility, Transparency, Trust, Truth, Unity, Value, Virtue, Water."
            val intent = Intent(applicationContext, MoodResultActivity::class.java)
            intent.putExtra("Summary", summary.toString())
            startActivity(intent)

            Log.i("STATUS", "${summary}")
        }

        if (buttonId == R.id.radioButton_tough) {
            summary = "Associated Emoji: \uD83D\uDCAA\n\n" +"Associated Color: Brown\n\n" + "Solid, dependable, and confident are often traits attributed to brown. " +
                    "It can be though of as being both conventional and sophisticated depending on its intended use.\n\n" +
                    "Nature, Outdoorsy, Reliability, Ruggedness, Security, Support, Tough."
            val intent = Intent(applicationContext, MoodResultActivity::class.java)
            intent.putExtra("Summary", summary.toString())
            startActivity(intent)

            Log.i("STATUS", "${summary}")
        }

        if (buttonId == R.id.radioButton_excited) {
            summary = "Associated Emoji: \uD83D\uDE04\n\n" +"Associated Color: Orange\n\n" + "Associated with energetic warmth and ambition. Orange is a vibrant " +
                    "color which often denotes new beginnings, enthusiasm and creativity: Paring hints of orange " +
                    "with cooler blues often creates an excited pop.\n\n" + "Action, Ambition, Appetite, Assurance, Celebration, " +
                    "Change, Charisma, Communication, Competence, Coziness, Creativity, Determination, Disorder, Domination, " +
                    "Dryness, Earth, Emotion, Encouragement, Endurance, Energy, Enthusiasm, Exaggeration, Excitement, Expansion, " +
                    "Explosion, Extravagance, Extroversion, Exuberance, Fascination, Fitness, Flavor, Flexibility, Friendship, Fun, " +
                    "Generosity, Happiness, Health, Heat, Humanism, Humor, Independence, Invitation, Joy, Laughter, Motivation, " +
                    "Practicality, Radiation, Security, Service, Society, Smile, Success, Sunset, Temptation, Tropic, Visibility, " +
                    "Warmth, Warning, Wisdom."
            val intent = Intent(applicationContext, MoodResultActivity::class.java)
            intent.putExtra("Summary", summary.toString())
            startActivity(intent)

            Log.i("STATUS", "${summary}")
        }

        if (buttonId == R.id.radioButton_nurturing) {
            summary = "Associated Emoji: \uD83E\uDD70\n\n" +"Associated Color: Pink\n\n" + "Often Attributed to femininity, love, romance and tenderness. \n\n" +
                    "Pink has also been known to produce a calming effect.\n" + "Charming, Cheerful, Feminine, " +
                    "Gentle, Nurturing, Sincerity, Soft, Sophistication, Tranquility, Warmth."
            val intent = Intent(applicationContext, MoodResultActivity::class.java)
            intent.putExtra("Summary", summary.toString())
            startActivity(intent)

            Log.i("STATUS", "${summary}")
        }

        if (buttonId == R.id.radioButton_spiritual) {
            summary = "Associated Emoji: \uD83D\uDE07\n\n" +"Associated Color: Purple\n\n" + "Historically connected to royalty, nobility, power and wealth. \n\n" +
                    "Purple can also be associated with spirituality but do to its rarity in nature, purple can " +
                    "often appear artificial.\n\n" + "Ambition, Aristocracy, Art, Anxiety, Beauty, Balance, Compassion, " +
                    "Conflict, Contrition, Coolness, Creativity, Drama, Dream, Dignity, Enchantment, Enigma, Extravagance, " +
                    "Fantasy, Fashion, Femininity, Grief, Homosexuality, Independence, Individualism, Inspiration, Intelligence, " +
                    "Introspection, Intuition, Justice, Knowledge, Leadership, Luxury, Magic, Majesty, Meditation, Mood, Mystery, " +
                    "Mysticism, Nobility, Nostalgia, Passiveness, Penitence, Preciousness, Pride, Quietness, Reflection, Religious Devotion, " +
                    "Responsibility, Richness, Royalty, Sadness, Secrecy, Sensuality, Seriousness, Shadows, Sobriety, Solemnity, Solitude, " +
                    "Sophistication, Sorrow, Spirituality, Splendor, Style, Sublimation, Suffering, Superstition, Truth, Value, Wealth, " +
                    "Wisdom, Wit, Vanity."
            val intent = Intent(applicationContext, MoodResultActivity::class.java)
            intent.putExtra("Summary", summary.toString())
            startActivity(intent)

            Log.i("STATUS", "${summary}")
        }

        if (buttonId == R.id.radioButton_dangerous) {
            summary = "Associated Emoji: ☠ \n\n" +"Associated Color: Red\n\n" + "The most emotionally intense color of all! Red is an extreme color often " +
                    "associated with boldness, love, and life (blood). Red also can denote a warning (traffic lights/sign/alarm) " +
                    "so be careful of overuse.\n\n" + "Alertness, Ambition, Aggression, Battle, Beauty, Brilliance, Charity, Charm, " +
                    "Circulation, Communism, Compassion, Courage, Danger, Desire, Determination, Devotion, Domination, Eccentricity, " +
                    "Emotion, Energy, Eroticism, Excitement, Extroversion, Fashion, Fervor, Fire, Friendship, Hate, Heat, High Voltage, " +
                    "Intensity, Life, Love, Luck, Lust, Madness, Martyrdom, Motion, Movement, Murder, Pain, Passion, Patriotism, Power, " +
                    "Prohibition, Rage, Rebellion, Rescue, Revolution, Romanticism, Sacrifice, Sensuality, Sexuality, Sin, Speed, Strength, " +
                    "Suffering, Success, Tension, Thrill, Triumph, Urgency, Victory, Violence, Vitality, War, Warmth."
            val intent = Intent(applicationContext, MoodResultActivity::class.java)
            intent.putExtra("Summary", summary.toString())
            startActivity(intent)

            Log.i("STATUS", "${summary}")
        }

        if (buttonId == R.id.radioButton_indifferent) {
            summary = "Associated Emoji: \uD83D\uDE10\n\n" +"Associated Color: Gray\n\n" + "Pure gray is the only color that has no direct psychological properties. " +
                    "It is, however, quite suppressive. A virtual absence of color is depressing and when the world " +
                    "turns gray we are instinctively conditioned to draw in and prepare for hibernation. Unless the precise " +
                    "tone is right, gray has a dampening effect on other colors used with it. Heavy use of grey usually indicates " +
                    "a lack of confidence and fear of exposure.\n\n" + "Positive: Psychological neutrality.\n\n" +
                    "Negative: Lack of confidence, dampness, depression, hibernation, lack of energy."

            val intent = Intent(applicationContext, MoodResultActivity::class.java)
            intent.putExtra("Summary", summary.toString())
            startActivity(intent)

            Log.i("STATUS", "${summary}")
        }
    }//end of onCheckedChanged

}//end of MainActivity
