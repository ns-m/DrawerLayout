package com.example.drawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.drawerlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            menuNavLeft.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.app_info -> {
                        Toast.makeText(this@MainActivity, "Learn is light", Toast.LENGTH_SHORT).show()
                    }
                    R.id.app_docs -> {
                        Toast.makeText(this@MainActivity, "Рукописи не горят", Toast.LENGTH_SHORT).show()
                    }
                    R.id.app_reports -> Toast.makeText(this@MainActivity, "Don`t worry, be happy", Toast.LENGTH_SHORT).show()
                    R.id.app_pay -> {

                    }
                    R.id.app_account -> Toast.makeText(this@MainActivity, "SuperMan owns this Account", Toast.LENGTH_SHORT).show()
                    R.id.app_settings -> {

                    }
                }
                drawerL.closeDrawer(GravityCompat.START)
                true
            }
            buttonOpenMenu.setOnClickListener {
                drawerL.openDrawer(GravityCompat.START)
            }
        }
    }
}