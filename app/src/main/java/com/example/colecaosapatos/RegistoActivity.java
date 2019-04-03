package com.example.colecaosapatos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class RegistoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FuncaoData();
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
            return;
        }else if(montante.trim().length() == 0) {
            editTestPreco.setError("introduz o Preço");
            editTestPreco.requestFocus();
            return;
        }else if(ano.trim().length() == 0){
            editTextAno.setError("Campo Obrigatorio");
            editTextAno.requestFocus();
            return;
        }


        Intent intent = new Intent(this, ApresentacaoActivity.class);
        Date date = new Date();

        // todo: para apresentar a marca

        intent.putExtra(ApresentacaoActivity.MARCA, nomemarca);
        startActivity(intent);

        // todo: para apresentar a preço

        intent.putExtra(ApresentacaoActivity.MONTANTE, montante);
        startActivity(intent);

        // todo: para apresentar a data

        //intent.putExtra(ApresentacaoActivity.DATA, date);
        intent.putExtra(ApresentacaoActivity.DATA, ano);
        startActivity(intent);


        // todo: Para aparecer uma mensagem a dizer que os dados foram guardados

        if (nomemarca.trim().length() > 0 | montante.trim().length()>0 | ano.trim().length()>0){
            Toast.makeText(this, "Dados Salvo com Sucesso", Toast.LENGTH_LONG).show();
            finish();
            return;
        }

        Toast.makeText(this, "Não Foi Possivel Salvar Os Dados", Toast.LENGTH_SHORT).show();

    }

    private void FuncaoData() {

        int dia = Day();
        int mes = MES();
        int ano = ANO();

        TextView editTextAno = (TextView) findViewById(R.id.editTextAno);
        editTextAno.setText(""+ano+"/"+"0"+mes+"/"+"0"+dia);

    }

    private int Day(){
        Calendar d = Calendar.getInstance();
        int dia = d.get(Calendar.DAY_OF_MONTH);
        return dia;
    }

    private int MES(){
        Calendar m = Calendar.getInstance();
        int mes = m.get(Calendar.MONTH)+1;
        return mes;
    }


    private int ANO() {
        Calendar a = Calendar.getInstance();
        int ano = a.get(Calendar.YEAR);
        return ano;
    }



}
