package com.example.weatherreport.screen2

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherreport.City
import com.example.weatherreport.weatherReportRequest.StartReport
import kotlin.concurrent.timer

@Composable
@OptIn(ExperimentalFoundationApi::class)
fun search_screen(
    sortedlist: MutableList<String>,
    cities: List<City>,
    SeeWeather: () -> Unit,
) {
    val groups = sortedlist.groupBy { it.first() }
    LazyColumn(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 70.dp)
    )
{
    groups.forEach { (_, city) ->
        stickyHeader {
                Text(
                    text = city[0][0].toString(),
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
        }
        items(city) { city ->
            TextButton(
                onClick = {
                            StartReport(cities, city)
                            Thread.sleep(500)
                            SeeWeather()
                          },
                modifier = Modifier
                    .padding(horizontal = 50.dp, vertical = 5.dp)
                    .fillMaxWidth()


            ) {
                Text(
                    text = city,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }
    }
}
}