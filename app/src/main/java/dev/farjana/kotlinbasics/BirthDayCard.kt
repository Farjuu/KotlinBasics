package dev.farjana.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class BirthDayCard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_day_card)

        var wishText = findViewById<TextView>(R.id.wishText)
        var sendertext = findViewById<TextView>(R.id.senderText)
        var cakeImage = findViewById<ImageView>(R.id.cakeImage)




    }
}