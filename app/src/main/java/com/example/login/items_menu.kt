package com.example.login

sealed class items_menu(
    val icon: Int,
    val title: String,
    val ruta: String
){
    object PantallaHome: items_menu(R.drawable.icon_home,
        "Home", "Pantalla1")
    object PantallaPositions: items_menu(R.drawable.icon_positions,
        "Positions", "Pantalla2")
    object PantallaFindTalent: items_menu(R.drawable.icon_person_search,
        "Find Talent", "Pantalla3")
}