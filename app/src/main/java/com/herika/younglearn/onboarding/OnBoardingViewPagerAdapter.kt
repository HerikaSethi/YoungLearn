package com.herika.younglearn.onboarding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.herika.younglearn.R

class OnBoardingViewPagerAdapter: PagerAdapter() {
    override fun getCount(): Int {
        return 3
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater = container.context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view: View =
            layoutInflater.inflate(R.layout.on_boarding_viewpager, container, false)
        container.addView(view)

        val welcomeImage = view.findViewById<ImageView>(R.id.slide1_image)
        val welcomeHeading = view.findViewById<TextView>(R.id.heading)
        val welcomeSlideDesc = view.findViewById<TextView>(R.id.subHeading)

        when (position) {
            0 -> {
                welcomeImage.setImageResource(R.drawable.onboarding_one_xhdpi)
//                welcomeHeading.setText(R.string.welcome_to_next_rewards)
//                welcomeSlideDesc.setText(R.string.what_happens_next)
            }

            1 -> {
               welcomeImage.setImageResource(R.drawable.ic_onboarding_two_xhdpi)
//                welcomeHeading.setText(R.string.follow_your_favorite_games)
//                welcomeSlideDesc.setText(R.string.each_day_pick_the_games_to_follow)
            }

            2 -> {
//                welcomeImage.setImageResource(R.drawable.ic_onboarding_three)
//                welcomeHeading.setText(R.string.play_pivotal_moments)
//                welcomeSlideDesc.setText(R.string.guess_the_outcome_of_in_game_pivotal_mpments_to_win)
            }

        }
        return view
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view === obj
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view = `object` as View
        container.removeView(view)
    }
}