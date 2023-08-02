package com.example.pizzaapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.pizzaapp.databinding.ActivityMain3Binding



class MainActivity3 : AppCompatActivity() {
    private lateinit var binding:ActivityMain3Binding

    // معناته رح عرفه بعدين
    // كذا ربطنا اليدزاين بالكود في هذا الخطوة

    private lateinit var counterTextView: TextView
    private lateinit var incrementButton: Button
    private lateinit var incrementButton2: Button
    private lateinit var incrementButton3: Button
    private lateinit var incrementButton4: Button
    private lateinit var incrementButton5: Button

    private var counterValue = 0
    override fun onCreate(savedInstanceState: Bundle?) {
      this.binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)



    counterTextView = findViewById(R.id.counterTextView)
    incrementButton = findViewById(R.id.incrementButton)
        incrementButton2 = findViewById(R.id.incrementButton2)
        incrementButton3 = findViewById(R.id.incrementButton3)
        incrementButton4 = findViewById(R.id.incrementButton4)
        incrementButton5 = findViewById(R.id.incrementButton5)


        // Set initial counter value
    updateCounterDisplay()

    // Set click listener for the increment button
    incrementButton.setOnClickListener {
        incrementCounter()
    }
        incrementButton2.setOnClickListener {
            incrementCounter()
        }
        incrementButton3.setOnClickListener {
            incrementCounter()
        }
        incrementButton4.setOnClickListener {
            incrementCounter()
        }
        incrementButton5.setOnClickListener {
            incrementCounter()
        }


}

private fun incrementCounter() {
    counterValue++
    updateCounterDisplay()
}

private fun updateCounterDisplay() {
    counterTextView.text = "بيتزا: $counterValue"
}
}