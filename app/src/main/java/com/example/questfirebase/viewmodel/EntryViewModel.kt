package com.example.questfirebase.viewmodel


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.questfirebase.modeldata.DetailSiswa
import com.example.questfirebase.modeldata.UIStateSiswa
import com.example.questfirebase.modeldata.toSiswa
import com.example.questfirebase.view.route.RepositorySiswa


class EntryViewModel(private val repositoriSiswa: RepositorySiswa) : ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    private fun validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa) : Boolean {
        return with(uiState) {
            nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }

    fun updateUiState(detailSiswa: DetailSiswa) {
        uiStateSiswa = UIStateSiswa(detailSiswa = detailSiswa, isEntryValid = validasiInput(detailSiswa))
    }

    suspend fun addSiswa() {
        if (validasiInput()) {
            repositoriSiswa.postDataSiswa(uiStateSiswa.detailSiswa.toSiswa())
        }
    }
}