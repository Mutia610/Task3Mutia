package com.mutia.task3mutia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_hitung_fisika.*

class HitungFisikaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_fisika)

        btnHasilLs.setOnClickListener {
            hitungLuas()
        }

        btnHasilVl.setOnClickListener {
            hitungVolume()
        }
    }

    private fun hitungLuas() {
        var edpanjangLs = etPanjangLs.text.toString()
        var edlebarLs = etLebarLs.text.toString()

        if (edpanjangLs.isNotEmpty() && edlebarLs.isNotEmpty()){
            var panjangLs = edpanjangLs.toInt()
            var lebarLs = edlebarLs.toInt()

            var hasil = "Hasil Luas : ${panjangLs*lebarLs} m2"

            tvHasilLuas.text = hasil
            tvHasilLuas.visibility = View.VISIBLE

        }else{
            if (edpanjangLs.isEmpty()){
                etPanjangLs.error = getString(R.string.erPjg)
                Toast.makeText(this, getString(R.string.msgPjg), Toast.LENGTH_SHORT).show()
            }

            if (edlebarLs.isEmpty()){
                etLebarLs.error = getString(R.string.erLbr)
                Toast.makeText(this, getString(R.string.msgLbr), Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun hitungVolume() {
        var edpanjangVl = etPanjangVl.text.toString()
        var edlebarVl = etLebarVl.text.toString()
        var edtinggiVl = etTinggiVl.text.toString()

        if (edpanjangVl.isNotEmpty() && edlebarVl.isNotEmpty() && edtinggiVl.isNotEmpty()){
            val panjangVl = edpanjangVl.toInt()
            val lebarVl = edlebarVl.toInt()
            val tinggiVl = edtinggiVl.toInt()

            var hasil = "Hasil Volume : ${panjangVl*lebarVl*tinggiVl} m3"
            tvHasilVolume.text = hasil
            tvHasilVolume.visibility = View.VISIBLE

        }else{
            if (edpanjangVl.isEmpty()){
                etPanjangVl.error = getString(R.string.erPjg)
                Toast.makeText(this, getString(R.string.msgPjg), Toast.LENGTH_SHORT).show()
            }

            if (edlebarVl.isEmpty()){
                etLebarVl.error = getString(R.string.erLbr)
                Toast.makeText(this, getString(R.string.erLbr), Toast.LENGTH_SHORT).show()
            }

            if (edtinggiVl.isEmpty()){
                etTinggiVl.error = getString(R.string.erTinggi)
                Toast.makeText(this, getString(R.string.msgTinggi), Toast.LENGTH_SHORT).show()
            }
        }
    }
}