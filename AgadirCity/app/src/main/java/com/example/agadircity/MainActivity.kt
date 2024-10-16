package com.example.agadircity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.agadircity.ui.theme.AgadirCityTheme
import com.example.agadircity.ui.theme.mainColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AgadirCityTheme {
                App(
                    name = "Agadir Oufella",
                    description = "Agadir Oufella is a historic hilltop fortress located in Agadir, Morocco. It was built in the 16th century and offers panoramic views of the city and coastline. The fortress was partially destroyed in the 1960 earthquake, but its ruins remain a popular tourist attraction for its historical significance and scenic vistas.",
                    phone = "05282-80808",
                    location = "Oufella, Agadir",
                )
            }
        }
    }
}

@Composable
fun App(name: String, description: String, phone: String, location: String) {
    val agadirOufellaImage = painterResource(R.drawable.agadir)
    val backgroundCaption  = painterResource(R.drawable.marina_sunset)

    Box {
        Image(
            painter = backgroundCaption,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.6F
        )

        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = agadirOufellaImage,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 300.dp, height = 300.dp)
                    .border(
                        width = 4.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(16.dp)
                    )
                ,
            )
            Text(
                text = name,
                modifier = Modifier.padding(20.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                color = Color.Black,
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = description,
                    modifier = Modifier.padding(20.dp),
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }

            Column {
                val phoneIcon = painterResource(R.drawable.phone_24)
                val locationIcon = painterResource(R.drawable.location_on_24)

                Box {
                    Image(
                        painter = phoneIcon,
                        contentDescription = null
                    )

                    Text(
                        text = phone,
                        modifier = Modifier.padding(horizontal = 25.dp),
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }

                Box {
                    Image(
                        painter = locationIcon,
                        contentDescription = null
                    )

                    Text(
                        text = location,
                        modifier = Modifier.padding(horizontal = 25.dp),
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AgadirCityTheme {
        App(
            name = "Agadir Oufella",
            description = "Agadir Oufella is a historic hilltop fortress located in Agadir, Morocco. It was built in the 16th century and offers panoramic views of the city and coastline. The fortress was partially destroyed in the 1960 earthquake, but its ruins remain a popular tourist attraction for its historical significance and scenic vistas.",
            phone = "05282-80808",
            location = "Oufella, Agadir",
        )
    }
}