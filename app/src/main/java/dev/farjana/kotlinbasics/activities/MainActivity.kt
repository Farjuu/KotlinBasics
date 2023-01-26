package dev.farjana.kotlinbasics.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dev.farjana.kotlinbasics.classes.Dice
import dev.farjana.kotlinbasics.R
import dev.farjana.kotlinbasics.classes.Coin

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var maintext = findViewById<TextView>(R.id.mainText)

        val diceRoll = Dice(6)
        val coinSpin = Coin(4)
        maintext.setText(diceRoll.roll().toString() +" "+  diceRoll.rollColor() + coinSpin.spin())

//var a = 10;
       // var intent = Intent(this@MainActivity,BirthDayCard::class.java)
       // startActivity(intent)
    }
}