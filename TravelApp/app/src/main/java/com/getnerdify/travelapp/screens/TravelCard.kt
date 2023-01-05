package com.getnerdify.travelapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.getnerdify.travelapp.data.Destination
import com.getnerdify.travelapp.utils.cardElevation


@Composable
fun TravelCard(destination: Destination, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .padding(8.dp)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(270.dp)
        ) {
            /// Text
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
                    .align(Alignment.BottomCenter),
                elevation = cardElevation,
                shape = RoundedCornerShape(15.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 45.dp)
                        .padding(10.dp)

                ) {
                    Text(
                        text = destination.city,
                        style = MaterialTheme.typography.subtitle1,
                        fontSize = 18.sp
                    )
                    Text(
                        text = destination.description,
                        style = MaterialTheme.typography.subtitle1,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        color = Color(0xFFb3c1c4),
                        fontSize = 14.sp
                    )
                }
            }

            /// Image
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(10.dp)
                    .align(
                        Alignment.TopCenter
                    ),
                shape = RoundedCornerShape(20.dp),
                elevation = cardElevation,
            ) {
                AsyncImage(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop,
                    model = destination.imageURL, contentDescription = "Image"
                )
            }
        }
    }
}
