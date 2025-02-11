package com.example.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.R
import com.example.ui.theme.LightOrange
import com.example.ui.theme.ModerateBlue
import com.example.ui.theme.VeryDarkGreyBlue
import com.example.ui.theme.VividRed

@Composable
fun CommerceButtonPrimary (
    text: String = "Login Now",
    onClick: () -> Unit = {  }
){
    CommerceBaseButton(
        text = text,
        onClick = onClick,
        enabled = true,
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
            .height (56.dp),
        color = ButtonDefaults.buttonColors(
            containerColor = LightOrange,
            contentColor = VeryDarkGreyBlue
        )

    )
}

@Composable
@Preview
fun CommerceButtonPrimaryPreview (){
    CommerceButtonPrimary()
}

@Composable
fun CommerceButtonFacebook (
    text: String = "Facebook",
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
    .fillMaxWidth()
    .padding(16.dp)
    .height(56.dp)
) {
    CommerceWithIconBaseButton(
        text = text,
        onClick = onClick,
        enabled = true,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = ModerateBlue,
            contentColor = Color.White
        ),
        srcIcon = R.drawable.ic_facebook,
        descIcon = "Facebook"
    )
}

@Composable
@Preview
fun CommerceButtonFacebookPreview (){
    CommerceButtonFacebook()

}

@Composable
fun CommerceButtonGoogle (
    text: String = "Google",
    onClick: () -> Unit = {},
    modifier : Modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .height(56.dp)
) {
    CommerceWithIconBaseButton(
        text = text,
        onClick = onClick,
        enabled = true,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = VividRed,
            contentColor = Color.White
        ),
        srcIcon = R.drawable.ic_google,
        descIcon = "Google"
    )
}

@Preview
@Composable
fun CommerceButtonGooglePreview (){
    CommerceButtonGoogle()
}

@Composable
fun CommerceButtonSMRow (
    onClickGoogle: () -> Unit = {},
    onClickFacebook : () -> Unit = {},
    modifier: Modifier = Modifier.fillMaxWidth()
        .padding (16.dp)

){
    Row (
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    )
    {
    CommerceButtonGoogle(
        modifier = Modifier
            .height(56.dp)
            .weight (1f),
        onClick = onClickGoogle
    )
    CommerceButtonFacebook(
        modifier = Modifier
            .height(56.dp)
            .weight (1f),
        onClick = onClickFacebook
    )
    }

}

@Composable
@Preview
fun CommerceButtonSMPreview (){
    CommerceButtonSMRow()
}