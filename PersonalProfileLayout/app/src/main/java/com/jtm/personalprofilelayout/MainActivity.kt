package com.jtm.personalprofilelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jtm.personalprofilelayout.ui.theme.PersonalProfileLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()

        }
    }
}

@Composable
fun MyApp() {
    PersonalProfileLayoutTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            //ProfileCard()
            //RowColumnWeightExample()
           // ColorBoxExample()
            PersonList()
        }
    }
}


@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        BackgroundImage(modifier)
        ProfileBody(modifier)
    }
}

@Composable
fun BackgroundImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.sunset),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
    )
}

@Composable
fun ProfileBody(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(top = 125.dp)
    ) {
        ProfilePicture()
        Spacer(modifier = Modifier.height(20.dp))
        HeaderSection()
        Divider()
        ContactInfo()
        Divider()
        ButtonSection()
    }
}


@Composable
fun ProfilePicture(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.foto3),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .size(150.dp)
            .border(
                border = BorderStroke(5.dp, Color.Green),
                CircleShape
            )
            .clip(CircleShape)
    )
}

@Composable
fun HeaderSection(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(top = 10.dp)
    ) {
        Text(text = "Jefferson Monteiro", fontSize = 22.sp)
        Text(
            text = "Sr Software Engineer",
            fontSize = 16.sp, fontStyle = FontStyle.Italic, color = Color.Gray
        )
    }
}


@Composable
fun Divider(modifier: Modifier = Modifier) {
    Spacer(modifier = Modifier.height(20.dp))
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color.Black)
            .border(BorderStroke(1.dp, Color.Gray))
    ) {
    }

}

@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Icon(Icons.Rounded.Call, contentDescription = null)
            Text(text = "123-456-7890", modifier.padding(start = 10.dp))
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Icon(Icons.Rounded.Email, contentDescription = null)
            Text(text = "jeff@gmail.com", modifier.padding(start = 10.dp))
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Icon(Icons.Rounded.LocationOn, contentDescription = null)
            Text(text = "11 robert streete, New York, NY", modifier.padding(start = 10.dp))
        }
    }
}

@Composable
fun ButtonSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .wrapContentSize()) {
        Button(
            modifier = modifier.size(200.dp, 50.dp).padding(2.dp),
            shape = RoundedCornerShape(percent = 16),
            onClick = {}
        ) {
            Text(text = "ALL COURSES", fontSize = 16.sp)
        }
        Button(
            modifier = modifier.size(200.dp, 50.dp).padding(2.dp),
            shape = RoundedCornerShape(percent = 16),
            onClick = {}
        ) {
            Text(text = "VIEW BIO", fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp()
}