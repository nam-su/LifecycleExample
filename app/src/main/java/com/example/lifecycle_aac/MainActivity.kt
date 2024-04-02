package com.example.lifecycle_aac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() { // 이 액티비티가 LifeCycle Owner가 되는것

    val TAG = "메인액티비티"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(LifecycleObserver())

        Log.d(TAG, "onCreate: ")

    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart: ")

    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume: ")

    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause: ")

    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop: ")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy: ")

    }

}