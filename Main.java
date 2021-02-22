import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Generador generador = new Generador();
        //System.out.println(generador.readFile());
        Scanner teclado = new Scanner(System.in);
        Ordenador ord = new Ordenador("a"); 
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(27);
        lista.add(89);
        lista.add(1290);
        lista.add(140);
        lista.add(100);
        lista.add(500);
        lista.add(600);
        lista.add(700);
        lista.add(800);
        while(true){
            System.out.println("Elija una opcion \n 1. Ordenar \n 2. Ver lista ordenada\n 3. Salir");
            int res = teclado.nextInt();
            if(res==1){
                System.out.println(ord.quickSort(lista, 9));
            }else if(res==2){
                //System.out.println(ord.mostrarListaOrdenada(0));
            }else if (res==3){
                break; 
            }else{
                System.out.println("Ingrese una opcion valida");
                    }
        
    }
}
}