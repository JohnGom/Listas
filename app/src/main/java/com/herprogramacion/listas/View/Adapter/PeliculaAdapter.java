package com.herprogramacion.listas.View.Adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.herprogramacion.listas.Domain.Datos;
import com.herprogramacion.listas.R;

import java.util.ArrayList;

/**
 * Created by lds on 04/09/2016.
 */
public class PeliculaAdapter  extends ArrayAdapter<Datos>{

    private final Context contexto;
    private ArrayList<Datos> datospeli;

    public PeliculaAdapter(Context context, ArrayList<Datos> datospeli) {
        super(context, -1, datospeli);
        this.contexto = context;
        this.datospeli = datospeli;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) contexto
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View LayoutPelicula = inflater.inflate(R.layout.adapter_peliculas, parent, false);

        ImageView imagePe = (ImageView) LayoutPelicula.findViewById(R.id.imagep);
        TextView namePe = (TextView) LayoutPelicula.findViewById(R.id.namep);
        TextView categoriaPe = (TextView) LayoutPelicula.findViewById(R.id.categoriap);
        TextView idiomaPe = (TextView) LayoutPelicula.findViewById(R.id.idiomap);

        Datos datos = datospeli.get(position);

        imagePe.setImageResource(datos.getImage());
        namePe.setText(datos.getNombre());
        categoriaPe.setText(datos.getCategoria());
        idiomaPe.setText(datos.getIdioma());

        return LayoutPelicula;

    }


}
