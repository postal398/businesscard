package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.R.drawable.android_logo
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme  {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.primarySurface,


                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.android_logo), contentDescription = "logo",
                        Modifier.size(135.dp))
                        Text("Maslov Vadim", fontSize = 40.sp)
                        Text(text = "Android Developer ExtraLol", color = Color.Green, fontSize = 24.sp)
                    }

//                    Icon(imageVector = Icons.Default.Phone , contentDescription = "Icon with...")

                }
            }
        }
    }
}

//verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,
//modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(1f).