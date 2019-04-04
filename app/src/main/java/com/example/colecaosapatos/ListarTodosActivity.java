package com.example.colecaosapatos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ListarTodosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_todos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LISTARTODOS();
    }

    private void LISTARTODOS() {

        Intent intent = getIntent();

        String marcas = intent.getStringExtra(ApresentacaoActivity.MARCA);
        String preco = intent.getStringExtra(ApresentacaoActivity.MONTANTE);
        String data = intent.getStringExtra(ApresentacaoActivity.DATA);

        TextView textViewMarca = (TextView) findViewById(R.id.textViewMarca);
        TextView textViewPreco = (TextView) findViewById(R.id.textViewPreco);
        TextView textViewAno = (TextView) findViewById(R.id.textViewAno);


        textViewMarca.setText(marcas);
        textViewPreco.setText(preco + "$");
        textViewAno.setText(data);

        return;

        // Date ano = (Date) intent.getSerializableExtra(ApresentacaoActivity.DATA);
        // String Ano = intent.getStringExtra(ApresentacaoActivity.DATA);
        //  TextView textViewAno = (TextView) findViewById(R.id.textViewano);
        // textViewAno.setText(ano.toString());
    }

    public void Delete(View view) {
        Intent intent = new Intent(this, ApresentacaoActivity.class);
        startActivity(intent);
    }
}
