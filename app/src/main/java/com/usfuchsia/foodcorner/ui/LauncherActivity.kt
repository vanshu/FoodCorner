package com.usfuchsia.foodcorner.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LauncherActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val viewModel:LauncherViewModel by viewModels()
    }

//    suspend fun toFinishActivity() = coroutineScope {  // this: CoroutineScope
//        launch {
//            delay(3000L)
//            finish()
//        }
//    }
}