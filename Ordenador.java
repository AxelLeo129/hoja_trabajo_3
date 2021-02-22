import java.util.ArrayList;

public class Ordenador {

    private String[] lista_numeros;
    private ArrayList<objArrayTiempo> listaDePruebas = new ArrayList<objArrayTiempo>();

    public Ordenador(String cadena) {
        this.lista_numeros = cadena.split(" ");
    }

    /*
     * Ingres la lista de 3000 elementos Y la cantidad de elementos que desea
     * ordenar de esa lista
     */
    public String gnomeSort(ArrayList<Integer> lista, int elementosAOrdenar) {
        if (elementosAOrdenar <= 3000) {
            ArrayList<Integer> listaAOrdenar = new ArrayList<Integer>();
            for (int i = 0; i <= elementosAOrdenar; i++)
                listaAOrdenar.add(lista.get(i));
            long TInicio, TFin, tiempo;
            TInicio = System.nanoTime();
            // Incia algoritmo de ordenamiento
            int index = 0;
            while (index < listaAOrdenar.size()) {
                if (index == 0)
                    index++;
                if (listaAOrdenar.get(index) >= listaAOrdenar.get(index - 1))
                    index++;
                else {
                    int temp = 0;
                    temp = listaAOrdenar.get(index);
                    listaAOrdenar.set(index, listaAOrdenar.get(index - 1));
                    listaAOrdenar.set(index - 1, temp);
                    index--;
                }
            }
            // Termina algoritmo de ordenamiento
            TFin = System.nanoTime();
            tiempo = TFin - TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(listaAOrdenar, String.valueOf(tiempo));
            listaDePruebas.add(arrayTiempo);
            String titulo = "Prueba " + String.valueOf(listaDePruebas.indexOf(arrayTiempo)) + " (index): GnomeSort ( "
                    + elementosAOrdenar + " elementos). Resultado: " + arrayTiempo.getTiempo() + " milisegundos";
            arrayTiempo.setTitulo(titulo);
            return arrayTiempo.getTitulo();

        } else
            return "El numero de elementos debe sere menos o igual a 3000";
    }

    public String mergeSort(ArrayList < Integer > lista, int elementosAOrdenar) {
        if (elementosAOrdenar >= 3000) {
            ArrayList< Integer > listaAOrdenar = new ArrayList < Integer > ();
            for (int i = 0; i <= elementosAOrdenar; i++)
                listaAOrdenar.add(lista.get(i));
            long TInicio, TFin, tiempo;
            TInicio = System.currentTimeMillis();
            // Inicia algoritmo de ordenamiento

            // Termina algoritmo de ordenamiento
            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(listaAOrdenar, String.valueOf(tiempo));
            listaDePruebas.add(arrayTiempo);
            String titulo = "Prueba " + String.valueOf(listaDePruebas.indexOf(arrayTiempo)) + " (index): GnomeSort ( "
                    + elementosAOrdenar + " elementos). Resultado: " + arrayTiempo.getTiempo() + " milisegundos";
            arrayTiempo.setTitulo(titulo);
            return arrayTiempo.getTitulo();

        } else
            return "El numero de elementos debe sere menos o igual a 3000";
    }

    public String quickSort(ArrayList < Integer > lista, int elementosAOrdenar) {
        if (elementosAOrdenar <= 3000) {
            ArrayList < Integer > listaAOrdenar = new ArrayList < Integer > ();
            for (int i = 0; i <= elementosAOrdenar; i++) listaAOrdenar.add(lista.get(i));
            long TInicio, TFin, tiempo;
            TInicio = System.nanoTime();
            //Inicia algoritmo de ordenamiento
            /**Obtenido de https://issuu.com/josedarwinchacantamame/docs/algoritmo_de_ordenamiento_java
            Autor: Jose Darwin Chacan
            */
            quickSort2(listaAOrdenar, 0, listaAOrdenar.size()-1);
            //Termina algoritmo de ordenamiento
            TFin = System.nanoTime();
            tiempo = TFin - TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(listaAOrdenar, String.valueOf(tiempo));
            listaDePruebas.add(arrayTiempo);
            String titulo = "Prueba " + String.valueOf(listaDePruebas.indexOf(arrayTiempo)) + " (index): GnomeSort ( " + elementosAOrdenar + " elementos). Resultado: " + arrayTiempo.getTiempo() + " milisegundos";
            arrayTiempo.setTitulo(titulo);
            for (int r: listaAOrdenar) System.out.println(r);
            return arrayTiempo.getTitulo();

        } else return "El numero de elementos debe sere menos o igual a 3000";
        
    }

    /**
     * Obtenido de
     * https://issuu.com/josedarwinchacantamame/docs/algoritmo_de_ordenamiento_java
     * Autor: Jose Darwin Chacan
     */
    public  void quickSort2(ArrayList<Integer> listaAOrdenar, int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (int) ((primero + ultimo) / 2);
        pivote = listaAOrdenar.get(central);
        i = primero;
        j = ultimo;
        do {
            while (listaAOrdenar.get(i) < pivote)
                i++;
            while (listaAOrdenar.get(j) > pivote)
                j--;
            if (i <= j) {
                int tmp;
                tmp = listaAOrdenar.get(i);
                listaAOrdenar.set(i, listaAOrdenar.get(j));
                listaAOrdenar.set(j, tmp);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quickSort2(listaAOrdenar, primero, j);
        }
        if (i < ultimo)
            quickSort2(listaAOrdenar, i, ultimo);
    }

    public String radixSort(ArrayList<Integer> lista, int elementosAOrdenar) {
        if (elementosAOrdenar >= 3000) {
            ArrayList<Integer> listaAOrdenar = new ArrayList<Integer>();
            for (int i = 0; i <= elementosAOrdenar; i++)
                listaAOrdenar.add(lista.get(i));
            long TInicio, TFin, tiempo;
            TInicio = System.currentTimeMillis();
            // Inicia algoritmo de ordenamiento

            // Termina algoritmo de ordenamiento
            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(listaAOrdenar, String.valueOf(tiempo));
            listaDePruebas.add(arrayTiempo);
            String titulo = "Prueba " + String.valueOf(listaDePruebas.indexOf(arrayTiempo)) + " (index): GnomeSort ( "
                    + elementosAOrdenar + " elementos). Resultado: " + arrayTiempo.getTiempo() + " milisegundos";
            arrayTiempo.setTitulo(titulo);
            return arrayTiempo.getTitulo();

        } else
            return "El numero de elementos debe sere menos o igual a 3000";
    }

    public String verPruebas() {
        String res = "";
        for (objArrayTiempo r : listaDePruebas) {
            res = res + "\n" + r.getTitulo();
        }
        if (res == "")
            res = "Parece que aun no has realizado ninguna prueba de ordenamiento";
        return res;
    }

}