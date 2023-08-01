package com.example.projectbiodata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardProfile = findViewById<CardView>(R.id.profile)
        val cardPortofolio = findViewById<CardView>(R.id.portofolio)
        val cardSkill = findViewById<CardView>(R.id.skill)
        val cardHobby = findViewById<CardView>(R.id.hobby)
        val cardSchool = findViewById<CardView>(R.id.education)

        cardProfile.setOnClickListener{
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        cardPortofolio.setOnClickListener{
            val intent = Intent(this, portofolio::class.java)
            startActivity(intent)
            Toast.makeText(this, "Tombol Portofolio", Toast.LENGTH_SHORT).show()
        }
        cardSkill.setOnClickListener{
            val intent = Intent(this, skill::class.java)
            startActivity(intent)
            Toast.makeText(this, "Tombol SKill", Toast.LENGTH_SHORT).show()
        }
        cardHobby.setOnClickListener{
            val intent = Intent(this, hobby::class.java)
            startActivity(intent)
            Toast.makeText(this, "Tombol Hobby", Toast.LENGTH_SHORT).show()
        }
        cardSchool.setOnClickListener{
            val intent = Intent(this, education::class.java)
            startActivity(intent)
            Toast.makeText(this, "Tombol Education", Toast.LENGTH_SHORT).show()
        }

    }
}
