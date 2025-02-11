package com.example.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.auth.ui.signin.SigninScreen
import com.example.auth.ui.signup.SignupScreen

class MainActivity : ComponentActivity() {

    sealed class Screen(val route: String) {
        object AuthSignin : Screen("authsignin")
        object AuthSignup : Screen("authsignup")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            com.example.ui.theme.Commerce_TestTheme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Screen.AuthSignin.route
                ) {
                    composable(Screen.AuthSignin.route) {
                        SigninScreen(
                            navController = navController
                        )
                    }
                    composable(Screen.AuthSignup.route) {
                        SignupScreen(
                            navController = navController
                        )
                    }
                }
            }
        }
    }
}
