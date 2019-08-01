package com.example.navigation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("test", "activity onCreate()")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        Log.i("test", "activity onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.i("test", "activity onResume()")
        super.onResume()
    }

    override fun onStop() {
        Log.i("test", "activity onStop()")
        super.onStop()
    }

    override fun onPause() {
        Log.i("test", "activity onPause()")
        super.onPause()
    }

    override fun onDestroy() {
        Log.i("test", "activity onDestroy()")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.i("test", "activity onRestart()")
        super.onRestart()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("test", "activity onSaveInstanceState()")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.i("test", "activity onRestoreInstanceState()")
        super.onRestoreInstanceState(savedInstanceState)
    }
}
