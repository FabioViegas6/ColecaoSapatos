package com.example.colecaosapatos;

import android.content.ContentValues;
import android.database.Cursor;

public class Cor {

    private long id;
    private String nomeC;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }


    public ContentValues getContentValues() {
        ContentValues valores = new ContentValues();

        valores.put(BdTableCor.CAMPO_NOME_COR, nomeC);

        return valores;
    }

    public static Cor fromCursor(Cursor cursor) {
        long id = cursor.getLong(
                cursor.getColumnIndex(BdTableCor._ID)
        );

        String nomeC = cursor.getString(
                cursor.getColumnIndex(BdTableCor.CAMPO_NOME_COR)
        );

        Cor cor = new Cor();

        cor.setId(id);
        cor.setNomeC(nomeC);

        return cor;
    }


}
