package com.example.day19_alertdialogue

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.day19_alertdialogue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Do you really want to exit?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes", DialogInterface.OnClickListener{ dialogInterface, i ->

                // What action should be taken when "yes" is clicked
                finish()
            })
            builder1.setNegativeButton("No", DialogInterface.OnClickListener{ dialogInterface, i ->

            })
            builder1.show()

            }
        binding.btn2.setOnClickListener{
            val options = arrayOf("Ladoo","Gulab jamun","Kaju katli","Rasgulla", "Lassi")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweet?")
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialog, which ->
                // what action is performed when the user clicks on an item
                Toast.makeText(this,"You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener{ dialogInterface, i ->

                // What action should be taken when "yes" is clicked
            })
            builder2.setNegativeButton("Decline", DialogInterface.OnClickListener{ dialogInterface, i ->
            })
            builder2.show()
        }
        binding.btn3.setOnClickListener{
            val options = arrayOf("Ladoo","Gulab jamun","Kaju katli","Rasgulla", "Lassi")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Which is your favourite sweet?")
            builder3.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit", DialogInterface.OnClickListener{ dialogInterface, i ->

                // What action should be taken when "yes" is clicked
            })
            builder3.setNegativeButton("Decline", DialogInterface.OnClickListener{ dialogInterface, i ->
            })
            builder3.show()
        }
    }
}
