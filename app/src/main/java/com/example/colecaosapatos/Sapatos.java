package com.example.colecaosapatos;

import android.content.ContentValues;
import android.database.Cursor;

public class Sapatos {

    private long id;
    private String nomeS;
    private double preco;
    private long idCategorias;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeS() {
        return nomeS;
    }

    public void setNomeS(String nomeS) {
        this.nomeS = nomeS;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public long getIdCategorias() {
        return idCategorias;
    }

    public void setIdCategorias(long idCategorias) {
        this.idCategorias = idCategorias;
    }


    public ContentValues getContentValues() {

        ContentValues valores = new ContentValues();

        valores.put(BdTableSapatos.FIELD_NOME, nomeS);
        valores.put(BdTableSapatos.FIELD_PRECO, preco);
        valores.put(BdTableSapatos.ID_CATEGORIA, idCategorias);

        return valores;

    }

    public static Sapatos fromCursor(Cursor cursor) {
        long id = cursor.getLong(
                cursor.getColumnIndex(BdTableSapatos._ID)
        );

        String nome = cursor.getString(
                cursor.getColumnIndex(BdTableSapatos.FIELD_NOME)
        );
        double preco = cursor.getDouble(
                cursor.getColumnIndex(BdTableSapatos.FIELD_PRECO)
        );
        long idCategoria = cursor.getLong(
                cursor.getColumnIndex(BdTableSapatos.ID_CATEGORIA)
        );

        Sapatos sapatos = new Sapatos();

        sapatos.setId(id);
        sapatos.setIdCategorias(idCategoria);
        sapatos.setNomeS(nome);
        sapatos.setPreco(preco);

        return sapatos;

    }

}
