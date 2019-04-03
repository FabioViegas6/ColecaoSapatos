package com.example.colecaosapatos;

import android.annotation.TargetApi;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.time.DayOfWeek;
import java.util.Date;


public class ApresentacaoActivity extends AppCompatActivity {


    public static final String MARCA = "marca";
    public static final String MONTANTE = "Preco";
    public static final String DATA = "Ano";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);

        ApresentarMarca();
    }

    private void ApresentarMarca() {

         // int dia = Day() ;
       //  int mes = MES() ;
     //    int anos = ANO();

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

    /**
    @TargetApi(Build.VERSION_CODES.N)
    private int Day(){
        Calendar d = Calendar.getInstance();
        int dia = d.get(Calendar.DAY_OF_MONTH);
        return dia;
    }

    @TargetApi(Build.VERSION_CODES.N)
    private int MES(){
        Calendar m = Calendar.getInstance();
        int mes = m.get(Calendar.MONTH)+1;
        return mes;
    }

    @TargetApi(Build.VERSION_CODES.N)
    private int ANO(){
        Calendar a = Calendar.getInstance();
        int ano = a.get(Calendar.YEAR);
        return ano;
    }
 */

}
