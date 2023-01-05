package com.getnerdify.travelapp.screens

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.getnerdify.travelapp.data.Destinations
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    val dataResult = mutableStateOf(Destinations.mock)

}