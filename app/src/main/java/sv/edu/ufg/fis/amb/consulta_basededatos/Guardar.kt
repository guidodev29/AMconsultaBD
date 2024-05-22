package sv.edu.ufg.fis.amb.consulta_basededatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sv.edu.ufg.fis.amb.consulta_basededatos.databinding.ActivityGuardarBinding

class Guardar : AppCompatActivity() {

    private lateinit var binding: ActivityGuardarBinding
    //private lateinit var db

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //agregamos esta linea
        binding=ActivityGuardarBinding.inflate(layoutInflater)
        //modificamos lo de abajo
        setContentView(binding.root)
    }
}