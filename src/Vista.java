package src;

/**
* 
* @author Luis Pedro & Axel 
* @version 1.0
**/

import java.util.Scanner;

public class Vista {

    /**
     * 
     * Constructor 
     *  
     **/
    public Vista() { }

    /**
     * 
     * Metodo para ejecurar la vista. 
     *  
     **/
    public void execute() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Bienvenido al sistema de ordenamiento\nElige una opción:");
        while(opcion != 3) {
            boolean validar_opcion = false;
            while(validar_opcion == false) {
                /*
                * Presentamos el menú        
                */
                System.out.println("1.Generar un archivo con número aleatorios.\n2.Leer y ordenar los datos del archivo existente.\n3.Salir\nSeleccione: ");  
                    try {
                        /*
                        * Opetenemos la opción.
                        */
                        opcion = Integer.parseInt(sc.next());
                        if(opcion < 4 && opcion > 0)
                            validar_opcion = true;
                        else
                            System.out.println("Ingrese una opción válida\n");
                    } catch(Exception e) {
                        System.out.println("Ingrese un número válido\n");
                    }
            }
            if(opcion == 1) {
                Generador generador = new Generador();
                generador.randomNumbers();
            } else if(opcion == 2) {
                Generador generador = new Generador();
                Ordenador ordenador = new Ordenador(generador.readFile());
                boolean validar_opcion1 = false;
                int opcion1 = 0;
                while(validar_opcion1 == false) {
                    System.out.println("Seleccione la cantidad de números a ordenar, \nNota: Debe ser un número entre 2 y 2999 : ");  
                    try {
                        /*
                        * Opetenemos la opción.
                        */
                        opcion1 = Integer.parseInt(sc.next());
                        if(opcion1 < 3000 && opcion1 > 1)
                            validar_opcion1 = true;
                        else
                            System.out.println("Ingrese una opción válida\n");
                    } catch(Exception e) {
                        System.out.println("Ingrese un número válido\n");
                    }
                }
                for(int i = 1; i < 6; i++) {
                    System.out.println(ordenador.getTime(ordenador.getLista_numeros(), opcion1, i));
                }
                System.out.println(ordenador.verPruebas());
            } else if(opcion == 3) {
                /*
                    * Salimos del sistema
                    */
                    System.out.println("Gracias, vuelva pronto.");
                    System.out.println("-----------------------------------------------------------------");
                    System.exit(0);
            }
        }
    }

}
