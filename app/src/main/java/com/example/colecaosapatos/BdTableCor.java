package com.example.colecaosapatos;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class BdTableCor implements BaseColumns {

    public static final String TABLE_NAME = "cor";
    public static final String CAMPO_NOME_COR = "nomeCor";


    private SQLiteDatabase db;

    public BdTableCor(SQLiteDatabase db) {
        this.db = db;
    }


    public void create() {
        db.execSQL(
                "CREATE TABLE " + TABLE_NAME + "(" +
                _ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                        CAMPO_NOME_COR + "TEXT NOT NULL" +
                        ")"

        );
    }
}
