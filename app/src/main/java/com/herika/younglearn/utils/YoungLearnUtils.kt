package com.herika.younglearn.utils

import android.app.Activity
import android.widget.ImageView
import android.widget.LinearLayout
import com.herika.younglearn.R

fun Activity.addDots(currentPage: Int, item: Int, linerLayout: LinearLayout) {
    val dots = arrayOfNulls<ImageView>(item)
    linerLayout.removeAllViews()
    for (i in 0 until item) {
        dots[i] = ImageView(this)
        if (i <= currentPage) {
            dots[i]?.setImageResource(R.drawable.dot_filled)
        } else {
            dots[i]?.setImageResource(R.drawable.dot_empty)
        }

        dots[i]?.setPadding(0, 0, 12, 0)
        linerLayout.addView(dots[i])
    }

    if (dots.isNotEmpty()) {
        dots[currentPage]?.setImageResource(R.drawable.dot_filled_background)
    }
}