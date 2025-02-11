package com.example.auth.ui.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.auth.MainActivity
import com.example.ui.components.CommerceButtonPrimary
import com.example.ui.components.CommerceButtonSMRow
import com.example.ui.components.CommerceEditText
import com.example.ui.components.CommerceImageViewClick
import com.example.ui.components.CommerceTextHeader
import com.example.ui.components.CommerceTextRegular
import com.example.ui.components.CommerceTextRegularWithClick
import com.example.ui.components.CommerceTextViewRow

@Composable
fun SigninScreen (
    navController : NavController = rememberNavController()
) {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
            .background(Color.White)

    ) {
        CommerceImageViewClick(
            onClick = {

            }
        )

        Spacer (modifier = Modifier.height(20.dp))

        CommerceTextHeader(
            text = "Welcome to Login",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer (modifier = Modifier.height(10.dp))

        CommerceTextRegularWithClick(
            text = "Please fill out Email and Password to proceed to your account. ",
            textClick = "Sign Up",
            modifier = Modifier.padding(horizontal = 16.dp),
            onClick = {
                navController.navigate(MainActivity.Screen.AuthSignup.route)
            }
        )

        Spacer (modifier = Modifier.height(5.dp))

        CommerceTextRegular(
            text = "Email",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer (modifier = Modifier.height(10.dp))

        CommerceEditText()

        Spacer (modifier = Modifier.height(10.dp))

        CommerceTextRegular(
            text = "Password",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer (modifier = Modifier.height(10.dp))

        CommerceEditText(
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer (modifier = Modifier.height(1.dp))

        CommerceTextViewRow()

        Spacer (modifier = Modifier.height(1.dp))

        CommerceButtonPrimary()

        CommerceButtonSMRow(
            onClickFacebook = {},
            onClickGoogle = {}
        )



    }
}

@Composable
@Preview (showBackground = true, device = Devices.NEXUS_5)
fun SigninScreenPreview () {
    SigninScreen()
}
