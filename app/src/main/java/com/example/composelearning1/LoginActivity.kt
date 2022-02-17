package com.example.composelearning1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelearning1.ui.theme.ComposeLearning1Theme

class LoginActivity:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearning1Theme {

                Surface(color = MaterialTheme.colors.background) {
                    LoginScreen()
                }

            }
        }
    }

    private fun logged(username:String,password:String)
    {
        if(username=="anjali" && password=="12345")
        {
            Toast.makeText(this,"logged!!",Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this,"wrong credential!!",Toast.LENGTH_SHORT).show()
        }
    }

    @Composable
    fun LoginScreen()
    {
        val username=remember{
            mutableStateOf("")
        }
        val password=remember{
            mutableStateOf("")
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
                ){
            Text(text = "Hello Again!", color = Color.Blue, fontSize = 25.sp,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold
            )
            Text(text = "Welcome", color = Color.Blue, fontSize = 25.sp,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold
            )
            Text(text = "Back", color = Color.Blue, fontSize = 25.sp,
                fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold
            )

            OutlinedTextField(value = username.value, onValueChange ={
                username.value=it
            },
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "person")
            },
                label = {
                    Text(text = "Username")
                },
                placeholder = {
                    Text(text = "enter username")
                },
                modifier = Modifier.fillMaxWidth()

            )


            OutlinedTextField(value = password.value, onValueChange ={
                password.value=it
            },
                leadingIcon = {
                    Icon(Icons.Default.Info, contentDescription = "info")
                },
                label = {
                    Text(text = "Password")
                },
                placeholder = {
                    Text(text = "enter password")
                },
                modifier = Modifier.fillMaxWidth()
            )

            OutlinedButton(onClick = { logged(username.value, password.value )}, modifier = Modifier.fillMaxWidth().padding(top = 10.dp)) {
                Text(text = "Login")
            }

        }
    }
}