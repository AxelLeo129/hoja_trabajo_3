import java.util.ArrayList;

public class Ordenador implements Comparable {
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
            //Incia algoritmo de ordenamiento 
            int index = 0; 
            while (index < listaAOrdenar.size()) { 
                if (index == 0) 
                    index++; 
                if (listaAOrdenar.get(index) >= listaAOrdenar.get(index-1)) 
                    index++; 
                else { 
                    int temp = 0; 
                    temp = listaAOrdenar.get(index); 
                    listaAOrdenar.set(index, listaAOrdenar.get(index-1));
                    listaAOrdenar.set(index-1, temp);
                    index--; 
                } 
            } 
              //Termina algoritmo de ordenamiento
            TFin = System.currentTimeMillis();
            tiempo=TFin-TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(listaAOrdenar,String.valueOf(tiempo)); 
            listaDePruebas.add(arrayTiempo); 
            String titulo= "Prueba "+String.valueOf(listaDePruebas.indexOf(arrayTiempo))+" (index): GnomeSort ( "+elementosAOrdenar+" elementos). Resultado: "+arrayTiempo.getTiempo()+" milisegundos";
            arrayTiempo.setTitulo(titulo);
            return arrayTiempo.getTitulo(); 
   
            }else return "El numero de elementos debe sere menos o igual a 3000"; 
    }    

    public String mergeSort(ArrayList<Integer> lista, int elementosAOrdenar){
        if(elementosAOrdenar>=3000){
            ArrayList<Integer> listaAOrdenar = new ArrayList<Integer>();
            for(int i=0; i<=elementosAOrdenar;i++)listaAOrdenar.add(lista.get(i));
            long TInicio, TFin, tiempo;         
            TInicio = System.currentTimeMillis();
            //Inicia algoritmo de ordenamiento

            //Termina algoritmo de ordenamiento
            TFin = System.currentTimeMillis();
            tiempo=TFin-TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(listaAOrdenar,String.valueOf(tiempo)); 
            listaDePruebas.add(arrayTiempo); 
            String titulo= "Prueba "+String.valueOf(listaDePruebas.indexOf(arrayTiempo))+" (index): GnomeSort ( "+elementosAOrdenar+" elementos). Resultado: "+arrayTiempo.getTiempo()+" milisegundos";
            arrayTiempo.setTitulo(titulo);
            return arrayTiempo.getTitulo(); 

    }else return "El numero de elementos debe sere menos o igual a 3000"; 
    }   
    
    public String quickSort(ArrayList<Integer> lista, int elementosAOrdenar){
        if(elementosAOrdenar>=3000){
            ArrayList<Integer> listaAOrdenar = new ArrayList<Integer>();
            for(int i=0; i<=elementosAOrdenar;i++)listaAOrdenar.add(lista.get(i));
            long TInicio, TFin, tiempo;         
            TInicio = System.currentTimeMillis();
            //Inicia algoritmo de ordenamiento
            
            //Termina algoritmo de ordenamiento
            TFin = System.currentTimeMillis();
            tiempo=TFin-TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(listaAOrdenar,String.valueOf(tiempo)); 
            listaDePruebas.add(arrayTiempo); 
            String titulo= "Prueba "+String.valueOf(listaDePruebas.indexOf(arrayTiempo))+" (index): GnomeSort ( "+elementosAOrdenar+" elementos). Resultado: "+arrayTiempo.getTiempo()+" milisegundos";
            arrayTiempo.setTitulo(titulo);
            return arrayTiempo.getTitulo(); 

    }else return "El numero de elementos debe sere menos o igual a 3000"; 
    }  
    
    public String radixSort(ArrayList<Integer> lista, int elementosAOrdenar){
        if(elementosAOrdenar>=3000){
            ArrayList<Integer> listaAOrdenar = new ArrayList<Integer>();
            for(int i=0; i<=elementosAOrdenar;i++)listaAOrdenar.add(lista.get(i));
            long TInicio, TFin, tiempo;         
            TInicio = System.currentTimeMillis();
            //Inicia algoritmo de ordenamiento
            
            //Termina algoritmo de ordenamiento
            TFin = System.currentTimeMillis();
            tiempo=TFin-TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(listaAOrdenar,String.valueOf(tiempo)); 
            listaDePruebas.add(arrayTiempo); 
            String titulo= "Prueba "+String.valueOf(listaDePruebas.indexOf(arrayTiempo))+" (index): GnomeSort ( "+elementosAOrdenar+" elementos). Resultado: "+arrayTiempo.getTiempo()+" milisegundos";
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
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
    public static int comparador(int mayor, int menor){
        if(mayor>menor) return 1; 
        else return 0; 
    }

}
