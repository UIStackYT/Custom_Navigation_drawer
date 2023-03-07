package com.example.navigationdrawerui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import com.example.navigationdrawerui.ui.screen.MainScreenUI
import com.example.navigationdrawerui.ui.screen.SidebarUI
import com.example.navigationdrawerui.ui.theme.NavigationDrawerUITheme
import com.example.navigationdrawerui.ui.theme.PrimaryColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationDrawerUITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = PrimaryColor
                ) {

                    var drawerState by remember {
                        mutableStateOf(false)
                    }
                    var xOffset by remember {
                        mutableStateOf(0.dp)
                    }
                    var degree by remember {
                        mutableStateOf(0f)
                    }
                    var size by remember {
                        mutableStateOf(1f)
                    }
                    var shape by remember {
                        mutableStateOf(0.dp)
                    }

                    val offsetXAnimated by animateDpAsState(targetValue = xOffset)
                    val shapeAnimated by animateDpAsState(targetValue = shape)
                    val degreeAnimated by animateFloatAsState(targetValue = degree)
                    val sizeAnimated by animateFloatAsState(targetValue = size)

                    val mainPageModifier = Modifier
                        .offset(x = offsetXAnimated)
                        .rotate(degreeAnimated)
                        .scale(sizeAnimated)
                        .clip(RoundedCornerShape(shapeAnimated))
                    if (drawerState) {
                        xOffset = 180.dp
                        degree = 8f
                        size = 0.8f
                        shape = 30.dp
                    } else {
                        xOffset = 0.dp
                        degree = 0f
                        size = 1f
                        shape = 0.dp
                    }
                    SidebarUI()

                    MainScreenUI(drawerState, mainPageModifier) {
                        drawerState = !drawerState
                    }
                }
            }
        }
    }
}


