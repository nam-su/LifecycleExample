package com.example.lifecycle_aac

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class LifecycleObserver: DefaultLifecycleObserver{

    val TAG = "라이프 사이클 옵저버"

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)

        Log.d(TAG, "onCreate: ")

    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)

        Log.d(TAG, "onStart: ")

    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)

        Log.d(TAG, "onResume: ")

    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)

        Log.d(TAG, "onPause: ")

    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)

        Log.d(TAG, "onStop: ")

    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)

        Log.d(TAG, "onDestroy: ")

    }

}