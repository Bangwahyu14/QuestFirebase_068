package com.example.questfirebase.view.route

import com.example.questfirebase.R
import com.example.questfirebase.view.route.DestinasiNavigasi

object DestinasiEdit : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}