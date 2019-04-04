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


    }

    public void SIM(View view) {


    }

    public void NAO(View view) {
        finish();
    }



}
