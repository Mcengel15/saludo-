package com.example.g7s21_practica2_aemm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class InicioActivity extends AppCompatActivity {

    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio);

        // Inicialización del EditText
        txtnombre = findViewById(R.id.txtnombre);
    }

    public void btnclick(View v) {
        String nombre = txtnombre.getText().toString().trim(); // Eliminar espacios en blanco

        // Comprobar si el campo está vacío
        if (nombre.isEmpty()) {
            // Mostrar un mensaje si el campo está vacío
            Toast.makeText(this, "Por favor, ingresa tu nombre.", Toast.LENGTH_SHORT).show();
        } else {
            // Iniciar la nueva actividad y pasar el nombre
            Intent pantalla = new Intent(this, SaludoActivity.class);
            pantalla.putExtra("nombre", nombre);
            startActivity(pantalla);
            finish();
        }
    }
}
