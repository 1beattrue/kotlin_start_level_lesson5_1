package edu.mirea.onebeattrue.lesson5_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.mirea.onebeattrue.lesson5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTextName = binding.editTextName
        val buttonSave = binding.buttonSave
        val textViewName = binding.textViewName

        buttonSave.setOnClickListener {
            textViewName.text = "Hello, ${editTextName.text.toString().trim()}!" // решение в одну строчку
        }
    }
}