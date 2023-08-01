package com.example.projectbiodata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatViewInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class portofolio : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    val listPortofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listPortofolio.add(PortofolioData(
            R.drawable.baseline_public_24, "PROJECT PAKET B",
            "Sistem Pemilihan Calon KADES desa Timbul Sloko RT/01 RW/07, Kec.Sayung Kab.Demak", "https://github.com/KHUSNUU/PROJECT-PAKET-B"
        ))
        listPortofolio.add(PortofolioData(
            R.drawable.baseline_public_24, "CI-4",
            "Sistem Web Penjualan PO bus PT.KHUSNU TRANS", "https://github.com/KHUSNUU/CI-4-KHUSNU"
        ))

        portofolioView = findViewById(R.id.rvPortofolio)
        portofolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = PortofolioAdapter(listPortofolio)
        portofolioAdapter.notifyDataSetChanged()
        portofolioView.adapter = portofolioAdapter
    }
}
