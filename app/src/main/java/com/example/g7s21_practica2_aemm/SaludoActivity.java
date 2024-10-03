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

        // Obtiene los parámetros de la intención y establece un valor predeterminado.
        Bundle parametros = getIntent().getExtras();
        nombre = (parametros != null) ? parametros.getString("nombre", "Invitado") : "Invitado";

        // Establece el texto en el TextView.
        lblsaludo.setText(String.format("Bienvenido, %s", nombre));
    }
}
