package com.example.auth.ui.signup

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
import com.example.ui.components.CommerceButtonPrimary
import com.example.ui.components.CommerceButtonSMRow
import com.example.ui.components.CommerceEditText
import com.example.ui.components.CommerceImageViewClick
import com.example.ui.components.CommerceTextHeader
import com.example.ui.components.CommerceTextRegular
import com.example.ui.components.CommerceTextRegularWithClick
import com.example.ui.components.CommerceTextViewRow

@Composable
fun SignupScreen (
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
                navController.popBackStack()
            }
        )

        Spacer (modifier = Modifier.height(20.dp))

        CommerceTextHeader(
            text = "Create Your Account",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer (modifier = Modifier.height(10.dp))

        CommerceTextRegularWithClick(
            text = "Do you already have an account ?  ",
            textClick = "Sign In",
            modifier = Modifier.padding(horizontal = 16.dp),
            onClick = {
                navController.popBackStack()

            }
        )

        Spacer (modifier = Modifier.height(16.dp))

        CommerceTextRegular(
            text = "Username",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer (modifier = Modifier.height(16.dp))

        CommerceEditText(
            value = "Username"
        )

        Spacer (modifier = Modifier.height(16.dp))


        CommerceTextRegular(
            text = "E-mail",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer (modifier = Modifier.height(16.dp))

        CommerceEditText()

        Spacer (modifier = Modifier.height(16.dp))

        CommerceTextRegular(
            text = "Password",
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer (modifier = Modifier.height(16.dp))

        CommerceEditText(
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer (modifier = Modifier.height(16.dp))

        CommerceButtonPrimary(
            text = "Create an account"
        )


    }
}

@Composable
@Preview (showBackground = true, device = Devices.NEXUS_5)
fun SignupScreenPreview () {
    SignupScreen()
}
