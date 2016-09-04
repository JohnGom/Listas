package com.herprogramacion.listas.Domain;

/**
 * Created by lds on 04/09/2016.
 */
public class Datos {

    private String nombre;
    private String categoria;
    private String idioma;
    private int image;

    public Datos (String nombre, String categoria, String idioma, int image){
        this.setNombre(nombre);
        this.setCategoria(categoria);
        this.setIdioma(idioma);
        this.setImage(image);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
