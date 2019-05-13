package com.example.colecaosapatos;

import android.content.ContentValues;
import android.database.Cursor;

public class Categorias {

    private long id;
    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContentValues getContentValues() {
        ContentValues valores = new ContentValues();

        valores.put(BdTableCategorias.NOME_CATEGORIA, nome);
        return valores;
    }

    public static Categorias fromCursor(Cursor cursor){
        long id = cursor.getLong(
                cursor.getColumnIndex(BdTableCategorias._ID)
        );

        String nome = cursor.getString(
                cursor.getColumnIndex(BdTableCategorias.NOME_CATEGORIA)
        );

        Categorias categorias = new Categorias();
        categorias.setId(id);
        categorias.setNome(nome);

        return categorias;

    }

}
