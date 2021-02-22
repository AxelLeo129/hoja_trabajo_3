import java.util.ArrayList;

public class objArrayTiempo {
    private ArrayList<Integer> listaOrdenada; 
    private String tiempo;
    private String titulo;  
    public objArrayTiempo(ArrayList<Integer> listaOrdenada, String tiempo, ){
        this.tiempo=tiempo; 
        this.listaOrdenada=listaOrdenada;         
    }

    public ArrayList<Integer> getListaOrdenada() {
        return listaOrdenada;
    }

    public void setListaOrdenada(ArrayList<Integer> listaOrdenada) {
        this.listaOrdenada = listaOrdenada;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
