package com.herika.younglearn.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.herika.younglearn.R
import com.herika.younglearn.databinding.ActivityOnBoardingBinding
import com.herika.younglearn.utils.addDots

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var databinding: ActivityOnBoardingBinding
    private var currentPage = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding = DataBindingUtil.setContentView(this,R.layout.activity_on_boarding)

        initializeViewPager()

    }

    private fun initializeViewPager() {
       with(databinding){
           viewPager.adapter = OnBoardingViewPagerAdapter()
           addDots(currentPage, 3, llDotsIndicator)
           viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
               override fun onPageScrolled(
                   position: Int,
                   positionOffset: Float,
                   positionOffsetPixels: Int
               ) {

               }

               override fun onPageSelected(position: Int) {
                   currentPage = position
                   addDots(position, 3, llDotsIndicator)
               }

               override fun onPageScrollStateChanged(state: Int) {

               }

           })
       }
    }
}