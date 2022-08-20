package com.mcd.newuxdesign

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.mcd.newuxdesign.databinding.ActivityLoginBinding
import kotlin.concurrent.thread

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    @Volatile
    private var isReady = false

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val content: View = findViewById(android.R.id.content)
        content.viewTreeObserver.addOnPreDrawListener(
            object : ViewTreeObserver.OnPreDrawListener {
                override fun onPreDraw(): Boolean {
                    // Check if the initial data is ready.

                    if (isReady) {
                        content.viewTreeObserver.removeOnPreDrawListener(this)
                    }
                    return isReady
                }
            })
        thread {
            Thread.sleep(3000)
            isReady = true
        }

        binding.loginGuestButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}