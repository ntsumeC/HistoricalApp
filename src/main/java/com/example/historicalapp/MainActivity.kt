package com.example.historicalapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DeleteButton = findViewById<Button>(R.id.DeleteButton)
        val ClickButton = findViewById<Button>(R.id.ClickButton)
        val EnterAge = findViewById<EditText>(R.id.EnterAge)
        val RESULT = findViewById<TextView>(R.id.RESULT)

        ClickButton.setOnClickListener {
            val ageText = EnterAge.text.toString()
            if (ageText.isBlank()) {
                RESULT.text = "Please enter a valid age"
            } else {
                val age = ageText.toIntOrNull()
                if (age == null) {
                    RESULT.text = "Please enter a valid age"
                } else {
                    if (age < 20 || age > 100) {
                        RESULT.text = "Please enter a valid age between 20 to 100"
                        EnterAge.text.clear()
                    } else {
                        val result = when (age) {
                            69 -> "Alan Rick man was an English actor and director, best known for his memorable performances in film, television, and on stage. He was born on February 21, 1946, in Hammersmith, London, and died on January 14, 2016, at the age of 69."
                            28 -> "Heath Andrew Ledger (4 April 1979 – 22 January 2008) was an Australian actor. After playing roles in several Australian television and film productions during the 1990s, he moved to the United States in 1998 to further develop his film career."
                            63 -> "Robin McLaurin Williams (July 21, 1951 – August 11, 2014) was an American actor and comedian. Known for his improvisational skills and the wide variety of characters he created on the spur of the moment and portrayed on film, in dramas and comedies alike, he is regarded as one of the greatest comedians of all time."
                            74 -> "Fred Mc Rogers (March 20, 1928 – February 27, 2003), better known as Mister Rogers, was an American television host, author, producer, and Presbyterian minister. He was the creator, showrunner, and host of the preschool television series Mister Rogers' Neighborhood, which ran from 1968 to 2001."
                            44 -> "Stephen Robert Irwin (22 February 1962 – 4 September 2006), known as The Crocodile Hunter was an Australian zookeeper, conservationist, television personality, wildlife educator, and environmentalist."
                            61 -> "Both Anthony Michael  and Norman Gene Macdonald passed away at this age. Anthony Michael  was an American celebrity chef, author, and traveller . Norman Gene Macdonald was a Canadian stand-up comedian, actor, and writer whose style was characterized by deadpan delivery and the use of folksy, old-fashioned turns of phrase."
                            43 -> "Chadwick , one of the greatest actors in the world, known for his role at the Black Panther in the MCU Universe, died at this age."
                            27 -> "Anton (Russian, IPA; March 11, 1989 – June 19, 2016) was an American actor. Born in the Soviet Union to a Russian Jewish family, he immigrated to the United States with his parents at the age of 6 months."
                            49 -> "Philip Edward Hartman (né Hartmann; September 24, 1948 – May 28, 1998) was a Canadian-born American comedian, actor, screenwriter, and graphic designer. Hartman was born in Brantford, Ontario, Canada, and his family moved to the United States when he was ten years old. After graduating from California State University, Northridge with a degree in graphic arts, he designed album covers for bands including Poco and America."
                            else -> "No one died at this age. Please try a different one."
                        }
                        RESULT.text = result
                    }
                }
            }
        }

        DeleteButton.setOnClickListener {
            EnterAge.text.clear()
            RESULT.text = ""
        }


    }
}




