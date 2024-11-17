package com.practicum.weather.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.practicum.weather.Constances
import com.practicum.weather.R
import kotlin.jvm.java as java

class Example : AppCompatActivity() {

    private var login:String = "empty"
    private var password:String = "empty"
    private var name:String = "empty"
    private var surname:String = "empty"
    private var surname2:String = "empty"
    private var avatarImageId:Int = 0
    private var launcherSignIn: ActivityResultLauncher<Intent>? = null
    private var launcherSignUp: ActivityResultLauncher<Intent>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

    }

    val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        result: ActivityResult -> if (result.resultCode == RESULT_OK) {
            result.data
        }
    }

    fun onClickSingIn(view: View) {

        val signInIntent = Intent(this, SignInUpActivity::class.java).also {
            it.putExtra(Constances.SIGN_STATE, Constances.SIGN_IN_STATE)
            startActivityForResult(it, Constances.REQUEST_CODE_SIGN_IN)
        }
    }

    fun onClickSingUp(view: View) {

        val signUpIntent = Intent(this, SignInUpActivity::class.java).also {
            it.putExtra(Constances.SIGN_STATE, Constances.SIGN_UP_STATE)
            startActivityForResult(it, Constances.REQUEST_CODE_SIGN_UP)
        }
    }
}





