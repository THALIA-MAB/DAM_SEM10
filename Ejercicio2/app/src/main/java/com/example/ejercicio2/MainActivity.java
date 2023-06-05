package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculamos
        button = findViewById(R.id.button);
        // Evento Click
        button.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            Toast.makeText(this, "Matricula completa", Toast.LENGTH_SHORT).show();
        }
    }
}
