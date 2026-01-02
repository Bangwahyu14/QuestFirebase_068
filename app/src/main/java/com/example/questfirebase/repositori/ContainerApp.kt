package com.example.questfirebase.repositori


import android.app.Application
import com.example.questfirebase.view.route.FirebaseRepositorySiswa
import com.example.questfirebase.view.route.RepositorySiswa

interface ContainerApp {
    val repositorySiswa: RepositorySiswa
}

class DefaultContainerApp : ContainerApp {
    override val repositorySiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}

class AplikasiDataSiswa : Application() {
    lateinit var container: ContainerApp
    override fun onCreate() {
        super.onCreate()
        this.container = DefaultContainerApp()
    }
}



