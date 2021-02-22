import java.util.ArrayList;

public class Ordenador {

    private ArrayList < Integer > lista_numeros;
    private ArrayList < objArrayTiempo > listaDePruebas = new ArrayList < objArrayTiempo > ();

    public Ordenador(String cadena) {
        lista_numeros = new ArrayList < > ();
        String[] lista_string = cadena.split(" ");
        for (String i: lista_string) {
            lista_numeros.add(Integer.parseInt(i));
        }
    }

    public ArrayList < Integer > getLista_numeros() {
        return this.lista_numeros;
    }

    /*
     * Ingres la lista de 3000 elementos Y la cantidad de elementos que desea
     * ordenar de esa lista
     */
    public String getTime(ArrayList < Integer > lista, int elementosAOrdenar, int sort) {
        if (elementosAOrdenar <= 3000) {
            ArrayList < Integer > listaAOrdenar = new ArrayList < Integer > ();
            for (int i = 0; i <= elementosAOrdenar; i++)
                listaAOrdenar.add(lista.get(i));
            long TInicio, TFin, tiempo;
            TInicio = System.nanoTime();
            // Incia algoritmo de ordenamiento
            ArrayList<Integer> resultado = new ArrayList<>();
            String nombre = "";
            if(sort == 1) {
                nombre = "Gnome";
                resultado = gnomeSort(listaAOrdenar, elementosAOrdenar);
            } else if(sort == 2) {
                nombre = "Merge";
                resultado = mergeSort(listaAOrdenar);
            } else if(sort == 3) {
                nombre = "Quick";
                //resultado = quickSort(listaAOrdenar, 0, listaAOrdenar.size() - 1); 
            } else  if(sort == 4) {
                nombre = "Radix";
                resultado = radixSort(listaAOrdenar);
            }
            // Termina algoritmo de ordenamiento
            TFin = System.nanoTime();
            tiempo = TFin - TInicio;
            objArrayTiempo arrayTiempo = new objArrayTiempo(resultado, String.valueOf(tiempo));
            listaDePruebas.add(arrayTiempo);
            String titulo = "Sort " + String.valueOf(listaDePruebas.indexOf(arrayTiempo) + 1) + " (index):" + nombre + " (" +
                elementosAOrdenar + " elementos). Resultado: " + arrayTiempo.getTiempo() + " milisegundos";
            arrayTiempo.setTitulo(titulo);
            return nombre + "Sort, Ejecutado exitosamente";
        } else
            return "El numero de elementos debe sere menos o igual a 3000";
    }


    public ArrayList < Integer > gnomeSort(ArrayList < Integer > lista, int elementosAOrdenar) {
        int index = 0;
        while (index < lista.size()) {
            if (index == 0)
                index++;
            if (lista.get(index) >= lista.get(index - 1))
                index++;
            else {
                int temp = 0;
                temp = lista.get(index);
                lista.set(index, lista.get(index - 1));
                lista.set(index - 1, temp);
                index--;
            }
        }
        return lista;
    }

    public ArrayList < Integer > mergeSort(ArrayList < Integer > lista) {
        if (lista.size() <= 1) {
            return lista;
        }
        int mitad = lista.size() / 2;
        ArrayList < Integer > sinistra = new ArrayList < > ();
        ArrayList < Integer > dietro = new ArrayList < > ();
        for (int i = 0; i < mitad; i++) {
            sinistra.add(lista.get(i));
        }
        for (int j = 0; j < mitad; j++) {
            dietro.add(lista.get(mitad + j));
        }
        ArrayList < Integer > resultado = new ArrayList < > ();
        sinistra = mergeSort(sinistra);
        dietro = mergeSort(dietro);
        resultado = merge(sinistra, dietro);
        return resultado;
    }

    public ArrayList < Integer > merge(ArrayList < Integer > sinistra, ArrayList < Integer > dietro) {
        ArrayList < Integer > resultado = new ArrayList < > ();
        int sinistro_puntatore, dietro_puntatore;
        sinistro_puntatore = dietro_puntatore = 0;
        while (sinistro_puntatore < sinistra.size() || dietro_puntatore < dietro.size()) {
            if (sinistro_puntatore < sinistra.size() && dietro_puntatore < dietro.size()) {
                if (sinistra.get(sinistro_puntatore) < dietro.get(dietro_puntatore)) {
                    resultado.add(sinistra.get(sinistro_puntatore++));
                } else {
                    resultado.add(dietro.get(dietro_puntatore++));
                }
            } else if (sinistro_puntatore < sinistra.size()) {
                resultado.add(sinistra.get(sinistro_puntatore++));
            } else if (dietro_puntatore < dietro.size()) {
                resultado.add(dietro.get(dietro_puntatore++));
            }
        }
        return resultado;
    }

    /**
     * Obtenido de
     * https://issuu.com/josedarwinchacantamame/docs/algoritmo_de_ordenamiento_java
     * Autor: Jose Darwin Chacan
     */
    public ArrayList < Integer > quickSort(ArrayList < Integer > listaAOrdenar, int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (int)((primero + ultimo) / 2);
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
            quickSort(listaAOrdenar, primero, j);
        }
        if (i < ultimo)
            quickSort(listaAOrdenar, i, ultimo);
        return listaAOrdenar;
    }

    private ArrayList < Integer > radixSort(ArrayList < Integer > lista) {
        int x, i, j;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            ArrayList < Integer > aiuto = new ArrayList < > ();
            for (int w = 0; w < lista.size(); w++) {
                aiuto.add(0);
            }
            j = 0;
            for (i = 0; i < lista.size(); i++) {
                boolean mover = lista.get(i) << x >= 0;
                if (x == 0 ? !mover : mover) {
                    aiuto.set(j, lista.get(i));
                } else {
                    lista.set(i - j, lista.get(i));
                }
            }
            for (i = j; i < aiuto.size(); i++) {
                aiuto.set(i, lista.get(i - j));
            }
            lista = aiuto;
        }
        return lista;
    }

    public String verPruebas() {
        String res = "";
        for (objArrayTiempo r: listaDePruebas) {
            res = res + "\n" + r.getTitulo() + ", tiempo: " + r.getTiempo();
        }
        if (res == "")
            res = "Parece que aun no has realizado ninguna prueba de ordenamiento";
        return res;
    }

}