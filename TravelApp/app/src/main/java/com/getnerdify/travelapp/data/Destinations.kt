package com.getnerdify.travelapp.data


data class Destinations(
    val result: List<Destination>
) {
    companion object {
        private val activities = listOf(
            Activities(
                imageURL = "",
                name = "Hiking",
                type = "Outdoor",
                startTimes = listOf("9:00 AM", "11:00 AM"),
                rating = 4.3f,
                price = 50
            ),
            Activities(
                imageURL = "",
                name = "Skydiving",
                type = "Outdoor",
                startTimes = listOf("9:00 AM", "11:00 AM"),
                rating = 4.3f,
                price = 50
            ),
            Activities(
                imageURL = "",
                name = "Mountain biking",
                type = "Outdoor",
                startTimes = listOf("9:00 AM", "11:00 AM"),
                rating = 4.3f,
                price = 50
            ),
            Activities(
                imageURL = "",
                name = "Kayaking",
                type = "Outdoor",
                startTimes = listOf("9:00 AM", "11:00 AM"),
                rating = 4.3f,
                price = 50
            ),

            )
        val mock = listOf(
            Destination(
                imageURL = "https://www.history.com/.image/t_share/MTkyNDQ5NzY0ODY2OTI1OTgw/gettyimages-1395722285.jpg",
                city = "New York",
                country = "United States",
                description = "New York, New York is a song written by John Kander and Fred Ebb. It was first performed by Liza Minnelli in the musical Cabaret in 1966. The song was written for the musical's leading character, Sally Bowles, a young English cabaret singer and actress in 1930s Berlin.",
                listOfActivities = activities
            )
        )
    }
}

data class Destination(
    val imageURL: String,
    val city: String,
    val country: String,
    val description: String,
    val listOfActivities: List<Activities>
)

data class Activities(
    val imageURL: String,
    val name: String,
    val type: String,
    val startTimes: List<String>,
    val rating: Float,
    val price: Int,
)