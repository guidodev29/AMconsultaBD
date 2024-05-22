package sv.edu.ufg.fis.amb.consulta_basededatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sv.edu.ufg.fis.amb.consulta_basededatos.databinding.ActivityGuardarBinding
import sv.edu.ufg.fis.amb.consulta_basededatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNuevosRegistros.setOnClickListener{
            val intent = Intent(this,Guardar::class.java)
            startActivity(intent)
        }
    }
}