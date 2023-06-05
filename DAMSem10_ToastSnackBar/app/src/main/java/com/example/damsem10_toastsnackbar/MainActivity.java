package com.example.damsem10_toastsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCorto, btnMedio, btnLargo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculamos
        btnCorto = findViewById(R.id.button1);
        btnMedio = findViewById(R.id.button2);
        btnLargo = findViewById(R.id.button3);

        // Evento Click
        btnCorto.setOnClickListener(this);
        btnMedio.setOnClickListener(this);
        btnLargo.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.button1){
            Snackbar.make(v, "Mostrando duracion corta", Snackbar.LENGTH_SHORT).show();
        }
        if(v.getId()==R.id.button2){
            Snackbar.make(v, "Mostrando duracion media", Snackbar.LENGTH_LONG).show();
        }
        if(v.getId()==R.id.button3){
            Snackbar.make(v, "Mostrando duracion larga", Snackbar.LENGTH_INDEFINITE).show();
        }

    }
}