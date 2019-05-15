package com.example.colecaosapatos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listarDados;
    private FloatingActionButton buton;

    ViewPager galeria;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        // todo: ------------------------------------ Chamar a classe da galeria de imagens na activity -----------------------------------------------

         galeria = (ViewPager) findViewById(R.id.galeria);
        GaleriaImagemAdapter adapter = new GaleriaImagemAdapter(this);
        galeria.setAdapter(adapter);


       // galeria.setCurrentItem(1, true);
        Timer timer = new Timer();
        timer.schedule(new Tempo(),4000, 2000 );

        apresentacaoMarca();
    }


    ///////////////////////////////////////////////////////////////////////////7
   //todo: ------------------------------------------------------ codigo para o tempo -----------------------------------------------------------------

    public class Tempo extends java.util.TimerTask{

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(galeria.getCurrentItem()==0) {
                        galeria.setCurrentItem(1);

                    }else if (galeria.getCurrentItem()==1){
                    galeria.setCurrentItem(2);

                }else if (galeria.getCurrentItem()==2){
                    galeria.setCurrentItem(3);

                }else if (galeria.getCurrentItem()==3){
                        galeria.setCurrentItem(4);

                    }else if (galeria.getCurrentItem()==4){
                        galeria.setCurrentItem(5);

                    }else if (galeria.getCurrentItem()==5){
                        galeria.setCurrentItem(6);

                    }else if (galeria.getCurrentItem()==6) {
                        galeria.setCurrentItem(0);

                    }
                }
            });

        }
    }

/////////////////////////////////////////////////////////////777777777



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void apresentacaoMarca() {
         Intent intent = getIntent();
        //  listarDados = (RecyclerView) findViewById(R.id.recyclerViewMarca);

    }


    public void Inserir(View view) {

        Intent intent = new Intent(this, RegistoActivity.class);
        startActivity(intent);


    }

    public void ListarTodos(View view) {

        Intent intent = new Intent(this, ListarTodosActivity.class);
        startActivity(intent);

    }
}
