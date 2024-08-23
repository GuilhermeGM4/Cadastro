package com.tarefa.cadastro

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tarefa.cadastro.Formulario
import com.tarefa.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

        amb.saveBt.setOnClickListener{
            val name: String = amb.fullNameEt.text.toString()
            val phone: String = amb.phoneEt.text.toString()
            val email: String = amb.emailEt.text.toString()
            val receiveEmails: Boolean = amb.mailingCb.isChecked
            val city: String = amb.cityEt.text.toString()
            val state: String = amb.stateSp.selectedItem.toString()

            val selectedSexId = amb.sexRg.checkedRadioButtonId
            val selectedSex = findViewById<RadioButton>(selectedSexId)
            val sex = selectedSex.text.toString()

            val form: Formulario = Formulario(name, phone, email, receiveEmails, sex, city, state)


            Toast.makeText(this@MainActivity, form.toString(), Toast.LENGTH_LONG).show()
        }
    }
}