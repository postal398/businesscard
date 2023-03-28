package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
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


                ) {//Surface start

                    Column(//Первая колонка, с картинкой и двумя текстами
                        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.android_logo), contentDescription = "logo",
                        Modifier.size(135.dp))
                        Text("Maslov Vadim", fontSize = 40.sp)
                        Text(text = "Android Developer ExtraLol", color = Color.Green, fontSize = 24.sp)
                    }
                    
                    Column(//Вторая колонка, с иконками и текстами
                        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier.padding(bottom =40.dp)
                    ) {
                        Divider (
                            color = Color.White,
                            modifier = Modifier
                                .height(1.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                        )

                        Divider (
                            color = Color.White,
                            modifier = Modifier
                                .height(1.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                        )

                        Row(
                            modifier = Modifier
//                                .border(BorderStroke(1.dp, Color.White))
                                .fillMaxWidth()
                            ,horizontalArrangement = Arrangement.Center
                        ) {
                         Icon(imageVector = Icons.Default.Phone , contentDescription = "Phone")
                            Spacer(modifier = Modifier.width(width = 40.dp))
                         Text(text = "+11 (123) 444 555 666", fontSize = 23.sp,
                             modifier = Modifier.padding(end = 39.dp)
                             )
                        }

                        Divider (
                            color = Color.White,
                            modifier = Modifier
                                .height(1.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                        )

                        Row(
                            modifier = Modifier
//                                .border(BorderStroke(1.dp, Color.White))
                                .fillMaxWidth()
                            ,horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(imageVector = Icons.Default.Share, contentDescription = "Share")
                            Spacer(modifier = Modifier.width(width = 80.dp))
                            Text("@Android", fontSize = 23.sp,
                                modifier = Modifier.padding(end = 130.dp)
                            )
                        }

                        Divider (
                            color = Color.White,
                            modifier = Modifier
                                .height(1.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(imageVector = Icons.Default.Email, contentDescription = "Email")
                            Spacer(modifier = Modifier.width(width = 10.dp))
                            Text("maslovvadim398@gmail.com", fontSize = 23.sp)
                        }
                    }



                }//Surface End
            }//Theme end
        }//Set content end
    }//onCreate end
} //MainActivity end

//verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,
//modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(1f).