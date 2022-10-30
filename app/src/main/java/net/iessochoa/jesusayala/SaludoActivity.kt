package net.iessochoa.jesusayala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {

    private lateinit var tvSaludo: TextView

    companion object{
        val EXTRA_NOMBRE = "practica1.SaludoActivity.nombre"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        tvSaludo=findViewById(R.id.tvSaludo)
        val nombre=intent.getStringExtra(EXTRA_NOMBRE)
        tvSaludo.text= String.format(getString(R.string.saludo),nombre)    }
}