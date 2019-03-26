package com.example.colecaosapatos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class RegistosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void Cancel(View view) {
        finish();
    }

    public void Save(View view) {

        EditText textInputLayoutMarca = (EditText) findViewById(R.id.editTextMarca);
        EditText montante = (EditText) findViewById(R.id.editTestPreco);

        String nomemarca = textInputLayoutMarca.getText().toString();

        if(nomemarca.trim().length() == 0) {
            textInputLayoutMarca.setError("Campo obrigatorio");
            textInputLayoutMarca.requestFocus();
            return;
        }
        finish();


    }
}
