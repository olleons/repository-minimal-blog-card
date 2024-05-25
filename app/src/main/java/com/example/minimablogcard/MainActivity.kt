package com.example.minimablogcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.minimablogcard.ui.theme.MinimaBlogCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinimaBlogCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MinimalBlogCard()
                }
            }
        }
    }
}

@Composable
fun MinimalBlogCard() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp
            ),
            modifier = Modifier.width(368.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(16.dp)
            ) {
                ImageMinimalBlog()
                Spacer(Modifier.padding(16.dp))
                TextLabelMinimalBlog()
                Spacer(Modifier.padding(16.dp))
                TitleMinimalBlog()
                Spacer(Modifier.padding(6.dp))
                DescriptionMinimalBlog()
                Spacer(Modifier.padding(20.dp))
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(2.dp)
                )
                AuthorMinimalBlog()
                Spacer(modifier = Modifier.padding(4.dp))
            }
        }
    }
}

@Composable
fun AuthorMinimalBlog() {
    Text(
        text = "Omar Leon",
        fontWeight = FontWeight.Light,
        modifier = Modifier.padding(top = 16.dp)
    )
}

@Composable
fun DescriptionMinimalBlog() {
    Text(
        text = "The Hong Kong Cultural Centre is a public multipurpose performance facility in " +
                "Tsim Sha Tsui, Hong Kong.",
        fontWeight = FontWeight.Light
    )
}

@Composable
fun TitleMinimalBlog() {
    Text(
        text = "Honk Kong Cultural Centre",
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = Color.Black
    )
}

@Composable
fun TextLabelMinimalBlog() {
    Text(
        text = "Design",
        modifier = Modifier
            .background(Color(0xFFB3E5FC), RoundedCornerShape(16.dp))
            .padding(vertical = 6.dp, horizontal = 16.dp),
        textAlign = TextAlign.Center,
        color = Color(0xFF00AFFF),
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun ImageMinimalBlog() {
    Image(
        painter = painterResource(id = R.drawable.cai_fang_fupgl5qqxle_unsplash),
        contentDescription = "Honk Kong Cultural Centre",
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
    )
}
