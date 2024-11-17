package com.practicum.weather.activity

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.practicum.weather.Constances
import com.practicum.weather.R

var signState = "empty"

class SignInUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_up)

        signState = intent.getStringExtra(Constances.SIGN_STATE)!!
        if (signState == Constances.SIGN_IN_STATE) {
            findViewById<EditText>(R.id.name).visibility = View.GONE
            findViewById<EditText>(R.id.surname).visibility = View.GONE
            findViewById<EditText>(R.id.surname_2).visibility = View.GONE
            findViewById<ImageView>(R.id.avatar_button).visibility = View.INVISIBLE
        }

    }

    fun onClickDone(view: View) {
        if (signState == Constances.SIGN_IN_STATE) {

        }
    }

    fun onClickAvatar(view: View) {
        if (signState == Constances.SIGN_IN_STATE) {

            findViewById<ImageView>(R.id.avatar_image).visibility = View.VISIBLE
        }
    }
}