package com.herika.younglearn.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.herika.younglearn.R
import com.herika.younglearn.databinding.ActivitySplashBinding
import com.herika.younglearn.onboarding.OnBoardingActivity
import com.herika.younglearn.ui.main.MainActivity


class SplashActivity : AppCompatActivity() {
    private lateinit var databinding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        databinding = DataBindingUtil.setContentView(this,R.layout.activity_splash)

        Handler().postDelayed(Runnable {
            startActivity(Intent(this@SplashActivity, OnBoardingActivity::class.java))
            finish()
        },  4000)


    }


    override fun onResume() {
        super.onResume()
    }


}