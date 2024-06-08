package com.example.practical11

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val textView: TextView = findViewById(R.id.textView)
        val layout: ConstraintLayout = findViewById(R.id.layout)
        when (item.itemId){
            R.id.action1->{
                textView.text ="Вы выбрали черный цвет!"
                layout.setBackgroundColor(Color.parseColor("#000000"))
                Toast.makeText(this,"Черный", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action2->{
                textView.text ="Вы выбрали желтый цвет!"
                layout.setBackgroundColor(Color.parseColor("#FFFF00"))
                Toast.makeText(this,"Желтый", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action3->{
                textView.text ="Вы выбрали оранжевый цвет!"
                layout.setBackgroundColor(Color.parseColor("#FFA500"))
                Toast.makeText(this,"Оранжевый", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
