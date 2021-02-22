import java.util.ArrayList;

public class Ordenador {
    private ArrayList<objArrayTiempo> listaDePruebas= new ArrayList<objArrayTiempo> (); 
    /*
    Ingres la lista de 3000 elementos
    Y la cantidad de elementos que desea ordenar de esa lista 
    */ 
    public String gnomeSort(ArrayList<Integer> lista, int elementosAOrdenar){
        if(elementosAOrdenar>=3000){
            ArrayList<Integer> listaAOrdenar = new ArrayList<Integer>();
            for(int i=0; i<=elementosAOrdenar;i++)listaAOrdenar.add(lista.get(i));
            long TInicio, TFin, tiempo;         
            TInicio = System.currentTimeMillis();
            //  metodo
            TFin = System.currentTimeMillis();
            tiempo=-TFin-TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(listaAOrdenar,String.valueOf(tiempo)); 
            listaDePruebas.add(arrayTiempo); 
            String titulo= "Prueba "+String.valueOf(listaDePruebas.indexOf(arrayTiempo))+" (index): GnomeSort ( "+elementosAOrdenar+" elementos).
            Resultado: "+arrayTiempo.getTiempo()+" milisegundos";
            arrayTiempo.setTitulo(titulo);
            return arrayTiempo.getTitulo(); 

    }else return "El numero de elementos debe sere menos o igual a 3000"; 
    }    
    public String verPruebas(){ 
        String res= "";  
        for (objArrayTiempo r: listaDePruebas){
            res= res+"\n"+r.getTitulo();
        }
        if (res=="") res="Parece que aun no has realizado ninguna prueba de ordenamiento";
        return res; 
    }

}
