package src;

/**
 * 
 * @author Luis Pedro & Axel 
 * @version 1.0
 **/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class Generador {
    /**
     * 
     * Atributos 
     *  
     **/
    private Random rand;
    private int numero_maximo;


    /**
     * 
     * Constructor 
     *  
     **/
    public Generador() {
        rand = new Random();
        numero_maximo = 2999;
    }

    /**
     * 
     * Generar números aleatorios.
     *  
     **/
    public void randomNumbers() {
        ArrayList < Integer > numeros = new ArrayList < > ();
        String cadena = "";
        for (int i = 0; i < 3000; i++) {
            numeros.add(this.rand.nextInt(this.numero_maximo));
        }
        for (Integer num: numeros) {
            cadena = cadena + num.toString() + " ";
        }
        writeFile(cadena);
    }

    /**
     * 
     * Genera un archivo con los datos enviados.
     * @param cadena numeros aleatorios
     *  
     **/
    public void writeFile(String cadena) {
        try {
            File archivo = new File("assets/datos.txt");
            archivo.createNewFile();
            FileWriter archivo_escritura = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(archivo_escritura);
            buffer.write(cadena);
            buffer.flush();
            buffer.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * 
     * Retorna los datos que se almacenan en el documento.
     * @return linea 
     *  
     **/
    public String readFile() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String linea = "";

        try {
            archivo = new File("assets/datos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            linea = br.readLine();
        } catch (Exception e) {
            linea = e.toString();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                linea = e2.toString();
            }
        }

        return linea;
    }

}