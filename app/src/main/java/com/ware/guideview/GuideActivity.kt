package com.ware.guideview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.ware.R

class GuideActivity : AppCompatActivity() {
    private val TAG = "GuideActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)
        findViewById<View>(R.id.view1).postDelayed({
            GuideBuilder(this).with(R.id.view1).show()
        }, 1000)

        Log.i(TAG, "")
    }
}
