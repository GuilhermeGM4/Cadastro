package com.aula.views

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tarefa.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

        amb.estadoCivilSp.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val estadoCivil = (view as TextView).text.toString()
                if (estadoCivil == "Casado") {
                    amb.conjugeLl.visibility = View.VISIBLE
                }
                else {
                    amb.run {
                        amb.conjugeLl.visibility = View.GONE
                        amb.nomeConjugeEt.setText("")
                        amb.sobrenomeConjugeEt.setText("")
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // NSA
            }
        }

        amb.salvarBt.setOnClickListener{
            Toast.makeText(this@MainActivity, "", Toast.LENGTH_SHORT).show()
        }
    }
}