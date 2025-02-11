@file:Suppress("DEPRECATION")

package com.example.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.LightOrange

@Composable
fun CommerceTextHeader(
    text: String = "Welcome to Login",
    color: Color = Color.Black,
    modifier: Modifier = Modifier.padding(16.dp)
    ) {

    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 24.sp,
            color = color,
            textAlign = TextAlign.Left
        ),
        overflow = TextOverflow.Ellipsis,
        maxLines = 1,
        color = color
    )


}

@Preview
@Composable
fun CommerceTextHeaderPreview() {
    CommerceTextHeader(
        text = "Welcome to Login dan selamat menikmati",
        color = Color.Black
    )
}

@Composable
fun CommerceTextRegularWithClick (
    text: String = "Please fill out Email and Password to proceed to your account.",
    textClick: String = " Sign Up",
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier.padding(16.dp)
){

    val annotatedText = buildAnnotatedString {
    append(text)

    pushStringAnnotation(
        tag = "clickable",
        annotation = textClick
    )

    withStyle(
        style = SpanStyle(
            color = LightOrange,
            fontWeight = FontWeight.Bold
        )
    ) {
        append(textClick)
    }
    pop()

    }

    ClickableText(
        text = annotatedText,
        modifier = modifier,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 24.sp,
            textAlign = TextAlign.Left
        ),
        onClick = { offset ->
            annotatedText.getStringAnnotations(
                tag = "clickable",
                start = offset,
                end = offset
            ).firstOrNull()?.let {
                onClick()
            }
        }
    )


}

@Preview
@Composable
fun CommerceTextRegularWithClickPreview (){
    CommerceTextRegularWithClick()

}

@Composable
fun CommerceTextRegular (
    modifier: Modifier = Modifier.padding(16.dp),
    text: String = "E-mail",
    color: Color = Color.Black
){
    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 16.sp,
            color = color,
            textAlign = TextAlign.Left
        ),
    )
}

@Composable
@Preview
fun CommerceTextRegularPreview (){
    CommerceTextRegular()
}

@Composable
fun CommerceTextViewRow (
    checked : Boolean = false,
    onCheckedChange : (Boolean) -> Unit = {},
    onTextClick : () -> Unit = {},
    textLeft : String = "Remember Me",
    textRight : String = "Forgot Password ?"

){
    Row(
        modifier = Modifier.padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        CommerceCheckbox(
            checked = checked,
            onCheckedChange = onCheckedChange,
            label = textLeft,
            modifier = Modifier.padding(vertical = 8.dp)
                .weight(1f)
        )

        val annotatedString = buildAnnotatedString {
            append (textRight)
        }

        ClickableText(
            text = annotatedString,
            modifier = Modifier.padding(vertical = 8.dp),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 14.sp,
                textAlign = TextAlign.Left
            ),
            onClick = {
                onTextClick()
            }
        )
    }

}

@Composable
@Preview
fun CommerceTextViewRowPreview (){
    CommerceTextViewRow()
}