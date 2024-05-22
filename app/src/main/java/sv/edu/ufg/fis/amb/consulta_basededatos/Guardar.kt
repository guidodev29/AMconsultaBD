package sv.edu.ufg.fis.amb.consulta_basededatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import sv.edu.ufg.fis.amb.consulta_basededatos.databinding.ActivityGuardarBinding

class Guardar : AppCompatActivity() {

    private lateinit var binding: ActivityGuardarBinding
    private lateinit var db: BaseDeDatos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //agregamos esta linea
        binding=ActivityGuardarBinding.inflate(layoutInflater)
        //modificamos lo de abajo
        setContentView(binding.root)

        db = BaseDeDatos(this)
        binding.btnGuardar.setOnClickListener{
            val mensaje = binding.txtData.text.toString()
            val registro = Registro(mensaje)
            db.insertarMensaje(registro)
            finish()
            Toast.makeText(this, "SE HA GUARDADO EL MENSAJE",Toast.LENGTH_LONG).show()
        }
    }
}