package com.example.swipableviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.swipableviewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val images = listOf(
            R.drawable.first_image,
            R.drawable.second_image,
            R.drawable.third_image
        )

        val adapter = PagerAdapter(images)
        activityMainBinding.viewPager.adapter = adapter
        activityMainBinding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
    }


}