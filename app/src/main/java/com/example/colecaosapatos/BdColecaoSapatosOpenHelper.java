package com.example.colecaosapatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class BdColecaoSapatosOpenHelper extends SQLiteOpenHelper {


    public static final String NOME_BASE_DADOS = "sapatos.db";
    public static final int VERSION_BD = 1;

    public BdColecaoSapatosOpenHelper(@Nullable Context context) {
        super(context, NOME_BASE_DADOS, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        new BdTableCategorias(db).create();
        new BdTableSapatos(db).create();
        new BdTableCor(db).create();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
