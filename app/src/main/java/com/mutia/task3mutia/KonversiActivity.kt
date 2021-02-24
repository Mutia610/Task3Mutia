package com.mutia.task3mutia

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_konversi.*

class KonversiActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi)

        val spin1 = spin1
       // spin1.setOnItemSelectedListener(this)
        val satuan = resources.getStringArray(R.array.satuan)

        val arraySatuan: ArrayAdapter<*> = ArrayAdapter<Any?>(this, R.layout.spinner_item, satuan)
        arraySatuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spin1.setAdapter(arraySatuan)

        val spin2 = spin2
      //  spin2.setOnItemSelectedListener(this)
        spin2.setAdapter(arraySatuan)

        btnKonversiSatuan.setOnClickListener {

            var x = spin1.selectedItemPosition + 1
            var y = spin2.selectedItemPosition + 1

            if (y > x){
                var etAngka = et1.text.toString()
                var angka = etAngka.toInt()

              for (i in (x+1)..y){
                    var hasil = angka*10

                    if (i.equals(y)){
                        tv2.text = hasil.toString()
                    }

                  angka = hasil
              }
            }else if (x == y){

                tv2.text = et1.text.toString()

            }else{
                var etAngka = et1.text.toString()
                var angka = etAngka.toDouble()

                for (i in (y+1)..x){
                    var hasil = angka/10

                    if (i.equals(x)){
                        tv2.text = hasil.toString()
                    }
                    angka = hasil
                }
            }
        }

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }


}




