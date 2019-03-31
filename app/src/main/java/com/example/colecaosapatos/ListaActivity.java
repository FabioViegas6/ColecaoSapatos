package com.example.colecaosapatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ListaActivity extends AppCompatActivity {

    public static final String MARCA = "marca";
    public static final String PRECO = "preco";
    public static final String ANO = "ano";

    private EditText editTextMarca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

      //  listarTodos();


    }

    /*
    private void listarTodos() {

        Intent intent = getIntent();
      editTextMarca = (EditText) findViewById(R.id.editTextMarca);
      intent.putExtra(ListaActivity.MARCA, MARCA);
      editTextMarca.setText(MARCA);


    }*/
}
