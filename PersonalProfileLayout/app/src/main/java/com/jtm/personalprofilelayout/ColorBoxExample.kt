package com.jtm.personalprofilelayout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun ColorBoxExample(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Row (
            modifier = modifier.weight(1f)
        ){
            MyBox(color = Color.Green, modifier = Modifier.weight(1f), text = "Green")
            MyBox(color = Color.Red, modifier = Modifier.weight(1f), text = "Red")
        }

        Row (
            modifier = modifier.weight(1f)
        ){
            MyBox(color = Color.Blue, modifier = Modifier.weight(1f), text = "Blue")
            MyBox(color = Color.Magenta, modifier = Modifier.weight(1f), text = "Magenta")
        }

    }


}

@Composable
fun MyBox(
    modifier: Modifier = Modifier,
    color: Color,
    text: String = "",
) {
    Surface(
        color = color,
        modifier = modifier
            //.width(100.dp)
            .fillMaxHeight()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = text, fontSize = 20.sp, color = Color.White)
        }
    }

}

@Preview
@Composable
private fun ColorBoxExamplePreview() {
    ColorBoxExample()
}