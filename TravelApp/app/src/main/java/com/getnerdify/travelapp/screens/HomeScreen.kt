package com.getnerdify.travelapp.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.getnerdify.travelapp.R
import com.getnerdify.travelapp.data.Destination
import com.getnerdify.travelapp.utils.cardElevation
import com.getnerdify.travelapp.utils.horizontalPadding


@Composable
fun HomeScreen(homeViewModel: HomeViewModel = HomeViewModel()) {

    val dataList = homeViewModel.dataResult.value

    Scaffold(modifier = Modifier) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 30.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(horizontal = horizontalPadding),
                text = "What you would like to find?",
                style = MaterialTheme.typography.subtitle1,
                fontSize = 28.sp
            )

            Spacer(modifier = Modifier.size(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = horizontalPadding),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                IconButton(modifier = Modifier
                    .clip(CircleShape)
                    .background(
                        color = Color(0xFFD8ECF1)
                    ),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_airplanemode),
                        contentDescription = "Airplane",
                        tint = Color(0xFF00A3E0)
                    )
                }
                IconButton(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(
                            color = Color(0xFFe7ebee)
                        ),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_car),
                        contentDescription = "Car",
                        tint = Color(0xFFb3c1c4)
                    )
                }
                IconButton(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(
                            color = Color(0xFFe7ebee)
                        ),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_beach),
                        contentDescription = "Beach",
                        tint = Color(0xFFb3c1c4)
                    )
                }
                IconButton(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(
                            color = Color(0xFFe7ebee)
                        ),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_hotel),
                        contentDescription = "Hotel",
                        tint = Color(0xFFb3c1c4)
                    )
                }
            }


            Spacer(modifier = Modifier.size(30.dp))

            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = horizontalPadding),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Top Destinations",
                        style = MaterialTheme.typography.subtitle1,
                        fontSize = 24.sp
                    )
                    TextButton(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFF00A3E0)
                        )
                    ) {
                        Text(
                            text = "See All",
                            style = MaterialTheme.typography.subtitle1,
                            fontSize = 16.sp
                        )
                    }
                }

            }


            Spacer(modifier = Modifier.size(30.dp))

            TravelList(dataList = dataList)
        }

    }
}


@Composable
fun TravelList(dataList: List<Destination>) {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
    ) {
        items(dataList) { currentDestination ->
            TravelCard(currentDestination) {
                //TODO
            }
        }
    }
}
