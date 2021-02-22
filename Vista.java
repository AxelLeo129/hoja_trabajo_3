import java.util.Scanner;

public class Vista {

    public Vista() { }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Bienvenido al sistema de ordenamiento\nElige una opción");
        while(opcion != 1) {
            boolean validar_opcion = false;
            while(validar_opcion == false) {
                /*
                * Presentamos el menú        
                */
                System.out.println("1.Generar un archivo con número aleatorios.\n2.Leer y ordenar los datos del archivo existente.\n3.Salir");  
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
        }

        if(opcion == 1) {
        
        } else  if(opcion == 3) {
            /*
                * Salimos del sistema
                */
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("-----------------------------------------------------------------");
                System.exit(0);
        }
    }

}
