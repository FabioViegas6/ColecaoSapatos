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
        EditText editTestPreco = (EditText) findViewById(R.id.editTestPreco);
        EditText editTextAno = (EditText) findViewById(R.id.editTextAno);

        String nomemarca = textInputLayoutMarca.getText().toString();
        String montante = editTestPreco.getText().toString();
        String ano = editTextAno.getText().toString();

        if(nomemarca.trim().length() == 0) {
            textInputLayoutMarca.setError("Campo Obrigatorio" );
            textInputLayoutMarca.requestFocus();
        }else if(montante.trim().length() == 0) {
            editTestPreco.setError("Campo obrigatorio");
            editTestPreco.requestFocus();
        }else if (ano.trim().length() ==0){
            editTextAno.setError("Campo Obrigatorio");
            editTextAno.requestFocus();
            return;
        }
       // finish();


    }


}
