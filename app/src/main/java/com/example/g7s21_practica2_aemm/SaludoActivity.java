package com.example.g7s21_practica2_aemm;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SaludoActivity extends AppCompatActivity {

    String nombre;
    TextView lblsaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_saludo);

        lblsaludo = findViewById(R.id.lblsaludo);

        Bundle parametros = getIntent().getExtras();
        if (parametros != null) {
            nombre = parametros.getString("nombre", "Invitado"); // Valor por defecto
        } else {
            nombre = "Invitado"; // Valor por defecto
        }

        lblsaludo.setText("Bienvenido, " + nombre);
    }
}
