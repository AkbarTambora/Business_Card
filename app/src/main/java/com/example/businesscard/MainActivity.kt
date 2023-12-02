package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingCenter(
                        stringResource(R.string.fullname),
                        stringResource(R.string.title)
                    )
                    GreetingBottom(
                        stringResource(R.string.nomor_telp),
                        stringResource(R.string.sosmed),
                        stringResource(R.string.email)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingCenter(fullname: String,
                   title: String,
                   modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color(0xFFC5D7CC))
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
//                .align(alignment = Alignment.CenterHorizontally)
                .background(Color(0xFF083042))
                .size(width = 150.dp, height = 150.dp)
        )
        Text(
            text = fullname,
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 16.dp)
        )
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF177F50)
        )
    }
}

@Composable
fun GreetingBottom(nomorTelp: String,
                   sosmed: String,
                   email: String,
                   modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .padding(bottom = 32.dp)
    ) {
        Row(
            modifier = Modifier
        ) {
            Column(
                modifier = Modifier
                    .padding(end = 8.dp)
            ) {
                // 3 icon disini
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "Call Icon",
                    tint = Color(0xFF177F50),
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Share Icon",
                    tint = Color(0xFF177F50),
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
                Icon(
                    imageVector = Icons.Default.Mail,
                    contentDescription = "Mail Icon",
                    tint = Color(0xFF177F50),
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )

            }
            Column(
                modifier = Modifier
                    //.padding(8.dp)
            ) {
                // 3 text disini
                Text(
                    text = nomorTelp,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
                Text(
                    text = sosmed,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
                Text(
                    text = email,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                )
            }
        }
    }
}

//@Composable
//fun GreetingBottom(nomorTelp: String,
//                   sosmed: String,
//                   email: String,
//                   modifier: Modifier = Modifier) {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Bottom,
//        modifier = Modifier
//            .padding(bottom = 32.dp)
//    ) {
//        Row() {
//            // icon Telepon dari materialdesign
//            Icon(
//                imageVector = Icons.Default.Call,
//                contentDescription = "Call Icon",
//                tint = Color(0xFF177F50),
//                modifier = Modifier
//                    .padding(end = 8.dp)
//            )
//            Text(
//                text = nomorTelp,
//                modifier = Modifier
//                    .padding(bottom = 8.dp)
//            )
//        }
//        Row() {
//            // icon Share dari materialdesign
//            Icon(
//                imageVector = Icons.Default.Share,
//                contentDescription = "Share Icon",
//                tint = Color(0xFF177F50),
//                modifier = Modifier
//                    .padding(end = 8.dp)
//            )
//            Text(
//                text = sosmed,
//                modifier = Modifier
//                    .padding(bottom = 8.dp)
//            )
//        }
//        Row() {
//            // icon Mail dari materialdesign
//            Icon(
//                imageVector = Icons.Default.Mail,
//                contentDescription = "Mail Icon",
//                tint = Color(0xFF177F50),
//                modifier = Modifier
//                    .padding(end = 8.dp)
//            )
//            Text(
//                text = email,
//                modifier = Modifier
//                    .padding(bottom = 8.dp)
//            )
//        }
//    }
//}


@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        GreetingCenter(
            stringResource(R.string.fullname),
            stringResource(R.string.title)
        )
        GreetingBottom(
            stringResource(R.string.nomor_telp),
            stringResource(R.string.sosmed),
            stringResource(R.string.email)
        )
    }
}