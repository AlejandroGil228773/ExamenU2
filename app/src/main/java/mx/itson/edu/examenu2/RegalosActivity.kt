package mx.itson.edu.examenu2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class RegalosActivity : AppCompatActivity() {

    var adapter : RegaloAdapter?=null
    var regalos: ArrayList<Detalle> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var opcion: String? = intent.getStringExtra("opcion")

        cargarRegalos(opcion)

        adapter = RegaloAdapter(this, regalos)
        var grid: GridView = findViewById(R.id.regalos_catalogo)

        grid.adapter = adapter

    }

    fun cargarRegalos(opcion: String?){
        when(opcion){
            "detalles" -> {
                regalos.add(Detalle(R.drawable.cumplebotanas, "$280"))
                regalos?.add(Detalle(R.drawable.cumplecheve, "$320"))
                regalos?.add(Detalle(R.drawable.cumpleescolar, "$330"))
                regalos?.add(Detalle(R.drawable.cumplepaletas, "$190"))
                regalos?.add(Detalle(R.drawable.cumplesnack, "$150"))
                regalos?.add(Detalle(R.drawable.cumplevinos, "$370"))
            }
            "globos" -> {
                regalos?.add(Detalle(R.drawable.globos, "$240"))
                regalos?.add(Detalle(R.drawable.globoamor, "$820"))
                regalos?.add(Detalle(R.drawable.globocumple, "$260"))
                regalos?.add(Detalle(R.drawable.globonum, "$760"))
                regalos?.add(Detalle(R.drawable.globofestejo, "$450"))
                regalos?.add(Detalle(R.drawable.globoregalo, "$240"))
            }
            "peluches" -> {
                regalos?.add(Detalle(R.drawable.peluchemario, "$320"))
                regalos?.add(Detalle(R.drawable.pelucheminecraft, "$320"))
                regalos?.add(Detalle(R.drawable.peluchepeppa, "$290"))
                regalos?.add(Detalle(R.drawable.peluches, "$450"))
                regalos?.add(Detalle(R.drawable.peluchesony, "$330"))
                regalos?.add(Detalle(R.drawable.peluchestich, "$280"))
                regalos?.add(Detalle(R.drawable.peluchevarios, "$195"))
            }
            "regalos" -> {
                regalos?.add(Detalle(R.drawable.regalos, "$80"))
                regalos?.add(Detalle(R.drawable.regaloazul, "$290"))
                regalos?.add(Detalle(R.drawable.regalobebe, "$140"))
                regalos?.add(Detalle(R.drawable.regalocajas, "$85"))
                regalos?.add(Detalle(R.drawable.regalocolores, "$450"))
                regalos?.add(Detalle(R.drawable.regalovarios, "$75"))
            }
            "tazas" -> {
                regalos?.add(Detalle(R.drawable.tazaabuela, "$120"))
                regalos?.add(Detalle(R.drawable.tazalove, "$120"))
                regalos?.add(Detalle(R.drawable.tazaquiero, "$260"))
                regalos?.add(Detalle(R.drawable.tazas, "$280"))
            }
        }
    }

    class RegaloAdapter: BaseAdapter {
        var contexto: Context
        var regalos: ArrayList<Detalle> = ArrayList()

        constructor(context: Context, regalos: ArrayList<Detalle>):super(){
            this.contexto = context
            this.regalos = regalos!!
        }


        override fun getCount(): Int {
            return regalos.size
        }

        override fun getItem(p0: Int): Any {
            return regalos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var regalo = regalos[p0]
            var inflador = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflador.inflate(R.layout.detalle_regalos, null)

            var imagen: ImageView = vista.findViewById(R.id.iv_regalo_image)
            var precio: TextView = vista.findViewById(R.id.tv_regalo_prize)

            imagen.setImageResource(regalo.image)
            precio.setText(regalo.precio)

            return vista
        }

    }
}