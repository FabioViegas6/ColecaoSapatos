package com.example.colecaosapatos;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class BdTableCategorias implements BaseColumns {

    public static final String NOME_TABELA = "categorias";
    public static final String NOME_CATEGORIA = "nome categoria";


    private SQLiteDatabase db;

    public BdTableCategorias(SQLiteDatabase db){
        this.db = db;
    }

    public void cria(){
        db.execSQL(
                "CREATE TABLE "+ NOME_TABELA  + "(" +
                _ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                        NOME_CATEGORIA + "TEXT NOT NULL" +
                ")"
        );
    }




}
