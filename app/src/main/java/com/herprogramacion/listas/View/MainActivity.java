package com.herprogramacion.listas.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.herprogramacion.listas.Controller.AppController;
import com.herprogramacion.listas.R;
import com.herprogramacion.listas.View.Adapter.PeliculaAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView ListPeli = (ListView) findViewById(R.id.PeliculasList);

        PeliculaAdapter peliculaAdapter = new PeliculaAdapter(this, AppController.getInstance().getDatos());

        ListPeli.setAdapter(peliculaAdapter);
    }
}
