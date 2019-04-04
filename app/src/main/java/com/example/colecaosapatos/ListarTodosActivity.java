package com.example.colecaosapatos;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class ListarTodosActivity extends AppCompatActivity {

    //todo - clase (Atributo)
    private AlertDialog alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_todos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LISTARTODOS();
    }

    private void LISTARTODOS() {

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

    public void Delete(View view) {

       // Intent intent = new Intent(this, ApresentacaoActivity.class);
        //startActivity(intent);

        // todo- cria o gerador do dialogo " AlerteDialog "
        AlertDialog.Builder caixadedialo = new AlertDialog.Builder(this);

        // todo- implementação de um titulo (Define)
        caixadedialo.setTitle("Aviso");

        // todo- implementação de uma mensagem (Define)
        caixadedialo.setMessage("Pretende eliminar o item?");

        // todo- implementação do botão positivo (Define)

        caixadedialo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                // todo- envia uma mensagem a dizer "item eliminado" caso a mensagem for aceite 

                Toast.makeText(ListarTodosActivity.this, "Item eliminado", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        // todo- implementação do botão negativo (Define)

        caixadedialo.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                // todo- envia uma mensagem a dizer "operação cancelada" caso for negada a eliminação

                Toast.makeText(ListarTodosActivity.this, "Operação cancelada", Toast.LENGTH_SHORT).show();
                dialog.cancel();

            }
        });

        // todo- cria o Alerta (AlertDialog)
        alerta = caixadedialo.create();
        // todo- Envia para o ecra " Exibe "
        alerta.show();




    }

    public void EDITAR(View view) {

        Intent intent = new Intent(this, RegistoActivity.class);
        startActivity(intent);

    }
}
