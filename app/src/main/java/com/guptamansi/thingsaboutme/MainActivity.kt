package com.guptamansi.thingsaboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSkills = findViewById<Button>(R.id.btnSkills)
        btnSkills.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        val btnEdu = findViewById<Button>(R.id.btnEdu)
        btnEdu.setOnClickListener {
            val intent = Intent(this, EduActivity::class.java)
            startActivity(intent)

        }

        val btnExp = findViewById<Button>(R.id.btnExperience)
        btnExp.setOnClickListener {
            val intent = Intent(this, ExpActivity::class.java)
            startActivity(intent)
        }

        val btnProjects = findViewById<Button>(R.id.btnProjects)
        btnProjects.setOnClickListener {
            val intent = Intent(this, ProjectsActivity::class.java)
            startActivity(intent)
        }
    }
}