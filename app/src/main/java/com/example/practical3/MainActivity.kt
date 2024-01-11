package com.example.practical3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practical3.databinding.ActivityMainBinding
import com.google.android.gms.tasks.OnSuccessListener

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        clickListener()
    }

    public fun clickListener(){
        binding.BGMI.setOnClickListener{
            startActivity(Intent(this@MainActivity, bgmi::class.java))
        }

        binding.VALORANT.setOnClickListener{
            startActivity(Intent(this@MainActivity,valo_activity::class.java))
        }

        binding.COD.setOnClickListener{
            startActivity(Intent(this@MainActivity,cod_activity::class.java))
        }

        binding.FREEFIRE.setOnClickListener{
            startActivity(Intent(this@MainActivity,freefire_activity::class.java))
        }

        binding.FORTNITE.setOnClickListener{
            startActivity(Intent(this@MainActivity,fortnite_activity::class.java))
        }

        binding.AMONGUS.setOnClickListener{
            startActivity(Intent(this@MainActivity,amgus_activity::class.java))
        }
    }
}