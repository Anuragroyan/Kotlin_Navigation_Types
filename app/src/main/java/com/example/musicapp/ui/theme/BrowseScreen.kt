package com.example.musicapp.ui.theme

import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.items
import com.example.musicapp.R

@Composable
fun BrowseScreen(){
    val categories = listOf("Hits","Happy","Workout","Running","TGIF","Yoga")
    LazyVerticalGrid(GridCells.Fixed(2) ) {
       items(categories){
           cat->
           BrowserItem(cat = cat, drawable = R.drawable.baseline_open_in_browser_24)
       }
    }
}