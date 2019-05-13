package com.example.colecaosapatos;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class BdTableSapatos implements BaseColumns {

    public static final String ID_CATEGORIA = "idCategoria";
    public static final String FIELD_PRECO = "preco";
    public static final String FIELD_NOME = "nomeS";
    public static String NOME_TABELA = "sapatos";


    private SQLiteDatabase db;
    public BdTableSapatos(SQLiteDatabase db){
        this.db = db;
    }

    public void cria(){

        db.execSQL(
        "CREATE TABLE " + NOME_TABELA + "(" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                FIELD_NOME + "TEXT NOT NULL," +
                FIELD_PRECO + "REAL," +
                ID_CATEGORIA + "INTEGER," +
                "FOREIGN KEY (" + ID_CATEGORIA +") REFERENCES " +
                    BdTableCategorias.NOME_TABELA +
                        "(" + BdTableCategorias._ID + ")" +
                ")"
        );
    }

}
