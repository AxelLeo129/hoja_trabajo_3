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
    private ArrayList<Integer> listaOrdenada; 
    private String tiempo;
    private String titulo;  

    /**
     * 
     * Constructor
     * @params ArrayList<Integer> listaOrdenada, String tiempo 
     *  
     **/
    public objArrayTiempo(ArrayList<Integer> listaOrdenada, String tiempo){
        this.tiempo=tiempo; 
        this.listaOrdenada=listaOrdenada;         
    }

    /**
     * 
     * Retorna la lista ordenada 
     * @return ArrayList<Integer> listaOrdenada
     **/
    public ArrayList<Integer> getListaOrdenada() {
        return listaOrdenada;
    }

    /**
     * 
     * Setea la lista ordenada 
     *
     **/
    public void setListaOrdenada(ArrayList<Integer> listaOrdenada) {
        this.listaOrdenada = listaOrdenada;
    }

    /**
     * 
     * Retorna el tiempo 
     * @return String tiempo
     **/
    public String getTiempo() {
        return tiempo;
    }

    /**
     * 
     * Setea el tiempo 
     *
     **/
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * 
     * Retorna el titulo 
     * @return String titulo
     **/
    public String getTitulo() {
        return titulo;
    }

    /**
     * 
     * Setea el titulo
     *
     **/
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
