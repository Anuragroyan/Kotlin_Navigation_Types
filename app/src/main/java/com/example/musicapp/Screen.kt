package com.example.musicapp

import androidx.annotation.DrawableRes

sealed class Screen(
    val title: String,
    val route: String
) {
    sealed class BottomScreen(
        val bTitle: String, val bRoute: String, @DrawableRes val icon: Int
    ):Screen(bTitle,bRoute){
       object
       Home : BottomScreen(
           "Home",
           "home",
           R.drawable.baseline_library_music_24
       )
       object
       Library : BottomScreen(
           "Library",
           "library",
           R.drawable.baseline_video_library_24
       )
       object
       Browse :  BottomScreen(
           "Browse",
           "browse",
           R.drawable.baseline_web_24
       )
    }

    sealed class DrawerScreen(val dtitle: String, val dRoute: String, @DrawableRes val icon: Int):
            Screen(dtitle,dRoute){
               object Account: DrawerScreen(
                   "Account",
                   "account",
                   R.drawable.baseline_account_box_24
               )
              object Subscription: DrawerScreen(
                  "Subscription",
                  "subscribe",
                  R.drawable.baseline_library_music_24
              )
              object AddAccount:DrawerScreen(
                  "Add Account",
                  "add_account",
                  R.drawable.baseline_person_add_alt_1_24
              )
            }
}

val screenInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)

val screenInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)