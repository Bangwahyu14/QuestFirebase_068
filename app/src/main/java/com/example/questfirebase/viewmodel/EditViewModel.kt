package com.example.questfirebase.viewmodel


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questfirebase.modeldata.DetailSiswa
import com.example.questfirebase.modeldata.UIStateSiswa
import com.example.questfirebase.modeldata.toSiswa
import com.example.questfirebase.view.route.DestinasiDetail
import com.example.questfirebase.view.route.RepositorySiswa
import kotlinx.coroutines.launch

class EditViewModel(savedStateHandle: SavedStateHandle, private val repositorySiswa:
RepositorySiswa
): ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set









}