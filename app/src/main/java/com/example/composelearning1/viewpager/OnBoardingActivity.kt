package com.example.composelearning1.viewpager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.example.composelearning1.ui.theme.ComposeLearning1Theme

class OnBoardingActivity :ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearning1Theme {
                androidx.compose.material.Surface {
                    OnBoardingScreen()

                }

            }
        }
    }
}