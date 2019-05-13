package com.example.colecaosapatos;

import android.content.ContentValues;
import android.database.Cursor;
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

    public void create(){

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

    public Cursor query(String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy) {
        return db.query(NOME_TABELA, columns, selection, selectionArgs, groupBy, having, orderBy);
    }

    public long insert(ContentValues values) {
        return db.insert(NOME_TABELA, null, values);
    }

    public int update(ContentValues values, String whereClause, String [] whereArgs) {
        return db.update(NOME_TABELA, values, whereClause, whereArgs);
    }

    public int delete(String whereClause, String[] whereArgs) {
        return db.delete(NOME_TABELA, whereClause, whereArgs);
    }

}
