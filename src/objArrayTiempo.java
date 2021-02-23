package src;
/**
 * 
 * @author Luis Pedro & Axel 
 * @version 1.0 
 **/

import java.util.ArrayList;

public class objArrayTiempo {

    /**
     * 
     * Atributos 
     *  
     **/
    private ArrayList < Integer > listaOrdenada;
    private String tiempo;
    private String titulo;

    /**
     * 
     * Constructor
     * @param listaOrdenada lista ordenada
     * @param tiempo tiempo de ejecución
     *  
     **/
    public objArrayTiempo(ArrayList < Integer > listaOrdenada, String tiempo) {
        this.tiempo = tiempo;
        this.listaOrdenada = listaOrdenada;
    }

    /**
     * 
     * Retorna la lista ordenada 
     * @return listaOrdenada
     **/
    public ArrayList < Integer > getListaOrdenada() {
        return listaOrdenada;
    }

    /**
     * 
     * Setea la lista ordenada 
     *
     * @param listaOrdenada guardar lista
     **/
    public void setListaOrdenada(ArrayList < Integer > listaOrdenada) {
        this.listaOrdenada = listaOrdenada;
    }

    /**
     * 
     * Retorna el tiempo 
     * @return tiempo
     **/
    public String getTiempo() {
        return tiempo;
    }

    /**
     * 
     * Setea el tiempo 
     *
     * @param tiempo tiempo de ejecución
     **/
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * 
     * Retorna el titulo 
     * @return titulo
     **/
    public String getTitulo() {
        return titulo;
    }

    /**
     * 
     * Setea el titulo
     *
     * @param titulo titulo del objeto
     **/
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}