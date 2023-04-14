package com.example.ppf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btCadastrar;
    Button btInicio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCadastrar = findViewById(R.id.cadastro);
        btInicio = findViewById(R.id.inicio);


        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                abreSegundaTela();

            }

        });


        btInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                abreTelaInicio();

            }

        });
    }

    private void abreSegundaTela() {
        Intent it = new Intent(this, Cadastro.class);
        startActivityForResult(it, 1);
    }


    private void abreTelaInicio() {
        Intent it = new Intent(this, Inicio.class);
        startActivityForResult(it, 1);
    }

}