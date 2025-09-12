package com.jtm.personalprofilelayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RowColumnWeightExample(
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier.fillMaxSize()
    ){
        Surface (
            color = Color.Red,
            modifier = modifier.width(100.dp).height(300.dp).weight(1f)
        ){}

        Surface (
            color = Color.Green,
            modifier = modifier.width(100.dp).height(300.dp).weight(2f)
        ){}

        Surface (
            color = Color.Blue,
            modifier = modifier.width(100.dp).height(300.dp).weight(1f)
        ){}

        Surface (
            color = Color.Yellow,
            modifier = modifier.width(100.dp).height(300.dp).weight(1f)
        ){}
    }
    
    
}


@Preview()
@Composable
private fun RowColumnWeightExamplePreview() {
    RowColumnWeightExample()
}