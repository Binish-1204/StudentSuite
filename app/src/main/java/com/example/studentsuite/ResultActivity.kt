package com.example.studentsuite

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val etScannedText: EditText = findViewById(R.id.etScannedText)
        val btnCopy: Button = findViewById(R.id.btnCopy)
        val btnShare: Button = findViewById(R.id.btnShare)

        val scannedText = intent.getStringExtra("scannedText")
        etScannedText.setText(scannedText)

        btnCopy.setOnClickListener {
            val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("Scanned Text", etScannedText.text.toString())
            clipboard.setPrimaryClip(clip)
            Toast.makeText(this, "Text copied to clipboard", Toast.LENGTH_SHORT).show()
        }

        btnShare.setOnClickListener {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, etScannedText.text.toString())
                type = "text/plain"
            }
            startActivity(Intent.createChooser(shareIntent, "Share text via"))
        }
    }
}
