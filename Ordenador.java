import java.util.ArrayList;

public class Ordenador {

    private ArrayList<Integer> lista_numeros;
    private ArrayList < objArrayTiempo > listaDePruebas = new ArrayList < objArrayTiempo > ();

    public Ordenador(String cadena) {
        lista_numeros = new ArrayList<>();
        String[] lista_string = cadena.split(" ");
        for(String i : lista_string) {
            lista_numeros.add(Integer.parseInt(i));   
        }
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

    public String getTimeMergeSort(ArrayList < Integer > lista, int elementosAOrdenar) {
        if (elementosAOrdenar <= 3000) {
            ArrayList < Integer > listaAOrdenar = new ArrayList < Integer > ();
            for (int i = 0; i < elementosAOrdenar; i++) listaAOrdenar.add(lista.get(i));
            long TInicio, TFin, tiempo;
            TInicio = System.currentTimeMillis();
            //Inicia algoritmo de ordenamiento
            ArrayList resultado = mergeSort(lista);
            System.out.println(resultado);
            //Termina algoritmo de ordenamiento
            TFin = System.currentTimeMillis();
            tiempo = TFin - TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(resultado, String.valueOf(tiempo));
            listaDePruebas.add(arrayTiempo);
            String titulo = "Prueba " + String.valueOf(listaDePruebas.indexOf(arrayTiempo)) + " (index): GnomeSort ( "
                    + elementosAOrdenar + " elementos). Resultado: " + arrayTiempo.getTiempo() + " milisegundos";
            arrayTiempo.setTitulo(titulo);
            return arrayTiempo.getTitulo();

        } else
            return "El numero de elementos debe sere menos o igual a 3000";
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> lista) {
        if(lista.size() <= 1) {
            return lista;
        }
        int mitad = lista.size() / 2;
        ArrayList<Integer> sinistra = new ArrayList<>();
        ArrayList<Integer> dietro = new ArrayList<>();
        for(int i = 0; i < mitad; i++) {
            sinistra.add(lista.get(i));
        }
        for(int j = 0; j < mitad; j++) {
            dietro.add(lista.get(mitad + j));
        }
        ArrayList<Integer> resultado = new ArrayList<>();
        sinistra = mergeSort(sinistra);
        dietro = mergeSort(dietro);
        resultado = merge(sinistra, dietro);
        return resultado;
    }

    public ArrayList<Integer> merge(ArrayList<Integer> sinistra, ArrayList<Integer> dietro) {
        ArrayList<Integer> resultado = new ArrayList<>();
        int sinistro_puntatore, dietro_puntatore;
        sinistro_puntatore = dietro_puntatore = 0;
        while(sinistro_puntatore < sinistra.size() || dietro_puntatore < dietro.size()) {
            if(sinistro_puntatore < sinistra.size() && dietro_puntatore < dietro.size()) {
                if(sinistra.get(sinistro_puntatore) < dietro.get(dietro_puntatore)) {
                    resultado.add(sinistra.get(sinistro_puntatore++));
                } else {
                    resultado.add(dietro.get(dietro_puntatore++));
                }
            } else if(sinistro_puntatore < sinistra.size()) {
                resultado.add(sinistra.get(sinistro_puntatore++));   
            } else if(dietro_puntatore < dietro.size()) {
                resultado.add(dietro.get(dietro_puntatore++));   
            }
        }
        return resultado;
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