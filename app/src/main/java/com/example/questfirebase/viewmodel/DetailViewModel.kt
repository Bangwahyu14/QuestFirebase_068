@file:OptIn(InternalSerializationApi::class)
package com.example.questfirebase.viewmodel

import com.example.myfirebase.modeldata.Siswa
import kotlinx.serialization.InternalSerializationApi
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.myfirebase.repositori.RepositorySiswa
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.myfirebase.view.route.DestinasiDetail
import androidx.lifecycle.viewModelScope
import com.example.questfirebase.modeldata.Siswa
import com.example.questfirebase.view.route.DestinasiDetail
import com.example.questfirebase.view.route.RepositorySiswa
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositorySiswa: RepositorySiswa
) : ViewModel() {
    private val idSiswa: Long =
        savedStateHandle.get<String>(DestinasiDetail.itemIdArg)?.toLong()
            ?: error("idSiswa tidak ditemukan di SavedStateHandle")





}