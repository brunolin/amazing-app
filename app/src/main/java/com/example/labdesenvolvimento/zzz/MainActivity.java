package com.example.labdesenvolvimento.zzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ListView listFilme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(1, "A Lagoa Azul", 1988));
        filmes.add(new Filme(2, "A Bela e a Fera", 2017));
        filmes.add(new Filme(3, "50 tons mais escuros", 2017));

        listFilme = (ListView) findViewById(R.id.listFilmes);

        ArrayAdapter<Filme> filmeAdapter = new FilmeAdapter(this, R.layout.filme_item, filmes);

        listFilme.setAdapter(filmeAdapter);
    }
}
