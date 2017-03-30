package com.example.labdesenvolvimento.zzz;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lab. Desenvolvimento on 29/03/2017.
 */

public class FilmeAdapter extends ArrayAdapter<Filme> {

    private List<Filme> filmes;
    private int layout;

    public FilmeAdapter(Context context, int resource, List<Filme> filmes) {
        super(context, resource, filmes);
        this.filmes = filmes;
        layout = resource;

    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {
        View localView = contentView;

        if(localView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            localView = inflater.inflate(layout, null);
        }

        Filme filme  = filmes.get(position);

        if(filme != null) {
            TextView textID = (TextView) localView.findViewById(R.id.textID);
            TextView textTitulo = (TextView) localView.findViewById(R.id.textTitulo);
            TextView textAno= (TextView) localView.findViewById(R.id.textAno);

            if(textID != null) {
                textID.setText(String.valueOf(filme.getID()));
            }
            if(textTitulo != null) {
                textTitulo.setText(filme.getTitulo());
            }
            if(textAno != null ) {
                int ano = filme.getAno();

                if(ano < 2000) {
                    textAno.setTextColor(Color.RED);
                } else {
                    textAno.setTextColor(Color.GREEN);
                }

                textAno.setText(String.valueOf(filme.getAno()));
            }
        }

        return localView;
    }
}
