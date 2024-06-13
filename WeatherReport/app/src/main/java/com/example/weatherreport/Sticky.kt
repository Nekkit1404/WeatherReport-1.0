package com.example.weatherreport

//fun SetupStickyLabels(cityList: List<String>): Pair<MutableList<Int>, MutableList<Char>> {
//    var buffer: Char = 'a'
//    var IndexOfCities = mutableListOf<Int>()
//    var FirstLetter = mutableListOf<Char>()
//    for (city in cityList) {
//        if (buffer != city[0]) {
//            buffer = city[0]
//            IndexOfCities.add(cityList.indexOf(city))
//
////            println("set up sticky label with litera $buffer on city $city")
//        }
//        FirstLetter.add(city[0])
//        buffer = city[0]
//    }
//    return Pair(IndexOfCities, FirstLetter)
//}

fun FindCoordinates(cities: List<City>, city: String): Pair<String, String> {
    val lat: String
    val lon: String
    for (cityData in cities) {
            if (cityData.city == city) {
                lat = cityData.latitude
                lon = cityData.longitude
                return Pair(lat, lon)
            }
    }
    return Pair("", "")
}
