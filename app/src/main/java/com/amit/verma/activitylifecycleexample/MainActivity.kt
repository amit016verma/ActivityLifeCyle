package com.amit.verma.activitylifecycleexample

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.also {
            it.setOnClickListener {
                val intent = Intent(this, Main2Activity::class.java)
                startActivity(intent)
                finish()
            }
        }

        Log.e(TAG, "onCreate() called")
    }

    override fun onStart() {
        super.onStart()

        Log.e(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()

        Log.e(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()

        Log.e(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()

        Log.e(TAG, "onStop() called")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

        Log.e(TAG, "onSaveInstanceState() called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.e(TAG, "onRestoreInstanceState() called")
    }

    override fun onRestart() {
        super.onRestart()

        Log.e(TAG, "onRestart() called")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e(TAG, "onDestroy() called")
    }
}
