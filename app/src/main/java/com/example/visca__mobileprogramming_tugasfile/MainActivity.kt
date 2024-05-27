package com.example.visca__mobileprogramming_tugasfile

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var buttonSave: Button
    private lateinit var buttonRead: Button
    private lateinit var buttonEdit: Button
    private lateinit var buttonDelete: Button

    private var savedText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        buttonSave = findViewById(R.id.buttonSave)
        buttonRead = findViewById(R.id.buttonRead)
        buttonEdit = findViewById(R.id.buttonEdit)
        buttonDelete = findViewById(R.id.buttonDelete)

        buttonSave.setOnClickListener {
            savedText = editText.text.toString()
            editText.text.clear()
        }

        buttonRead.setOnClickListener {
            editText.setText(savedText)
        }

        buttonEdit.setOnClickListener {
            savedText = editText.text.toString()
            editText.text.clear()
        }

        buttonDelete.setOnClickListener {
            savedText = null
            editText.text.clear()
        }
    }
}
