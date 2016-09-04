package com.herprogramacion.listas.Controller;

import com.herprogramacion.listas.Domain.Datos;
import com.herprogramacion.listas.R;

import java.util.ArrayList;

/**
 * Created by lds on 04/09/2016.
 */
public class AppController {

    private static AppController _instance;



    private String[] peliList;
    private ArrayList<Datos> datospeli;

    public static AppController getInstance()
    {
        if (_instance == null)
        {
            _instance = new AppController();
        }
        return _instance;
    }


    private AppController(){
        this.fillCountryList();
    }

    private void fillCountryList() {
        datospeli = new ArrayList<Datos>();
        datospeli.add(new Datos("Civil War","aventura, accion","ingles, latino", R.drawable.civilwar));
        datospeli.add(new Datos("Skiptrace","accion, comedia", "latino",R.drawable.skiptrace ));
        datospeli.add(new Datos("Skiptrace","accion, comedia", "latino",R.drawable.skiptrace ));
        datospeli.add(new Datos("Skiptrace","accion, comedia", "latino",R.drawable.skiptrace ));
        datospeli.add(new Datos("Skiptrace","accion, comedia", "latino",R.drawable.skiptrace ));

    }


    public String[] getPeliList() {
        return peliList;
    }

    public void setPeliList(String[] peliList) {
        this.peliList = peliList;
    }

    public ArrayList<Datos> getDatos() {
        return datospeli;
    }

    public void setDatos(ArrayList<Datos> datos) {
        this.datospeli = datos;
    }
}
