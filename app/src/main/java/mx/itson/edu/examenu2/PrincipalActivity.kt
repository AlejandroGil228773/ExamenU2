package mx.itson.edu.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val btnDetalles: Button = findViewById(R.id.btnDetalles)
        val btnGlobos: Button = findViewById(R.id.btnGlobos)
        val btnPeluches: Button = findViewById(R.id.btnPeluches)
        val btnRegalos: Button = findViewById(R.id.btnRegalos)
        val btnTazas: Button = findViewById(R.id.btnTazas)

        btnDetalles.setOnClickListener{
            var intent = Intent(this, RegalosActivity::class.java)
            intent.putExtra("opcion", "detalles")
            startActivity(intent)
        }
        btnGlobos.setOnClickListener{
            var intent = Intent(this, RegalosActivity::class.java)
            intent.putExtra("opcion", "globos")
            startActivity(intent)
        }
        btnPeluches.setOnClickListener{
            var intent = Intent(this, RegalosActivity::class.java)
            intent.putExtra("opcion", "peluches")
            startActivity(intent)
        }
        btnRegalos.setOnClickListener{
            var intent = Intent(this, RegalosActivity::class.java)
            intent.putExtra("opcion", "regalos")
            startActivity(intent)
        }
        btnTazas.setOnClickListener{
            var intent = Intent(this, RegalosActivity::class.java)
            intent.putExtra("opcion", "tazas")
            startActivity(intent)
        }

    }
}