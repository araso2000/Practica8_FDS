package strategy;

import java.util.Scanner;

public class Strategy {

    public static void main(String[] args) {

        Burbuja o1 = new Burbuja();
        Directa o2 = new Directa();
        int arr[]= {2,6,3,5,8,32,664,68,8765,23,6789,23,7};
        int arr3[];
        int arr2[];
        Ordenador a1 = new Ordenador();
        Scanner scan = new Scanner(System.in); 
        System.out.println("¿Porque quieres empezar por Burbuja (0) o por Directa (1)?");
        int a = scan.nextInt();
        switch(a){
            case 0:
                System.out.println("Ordenación Burbuja\n");
                System.out.println("Decimos en el set el tipo de Orden que queremos (Burbuja)");
                a1.setOrden(o1);
                System.out.println("Ejecutamos el algoritmo");
                arr2 = a1.result(arr);
                System.out.println("Resultado: ");
                a1.printArray(arr2);
                System.out.println("\n");
                System.out.println("Ordenación Directa\n");
                System.out.println("Decimos en el set el tipo de Orden que queremos (Directa)");
                a1.setOrden(o2);
                System.out.println("Ejecutamos el algoritmo");
                arr3 = a1.result(arr);
                System.out.println("Resultado: ");
                a1.printArray(arr3);
                break;
                
            case 1:
                System.out.println("Ordenación Directa\n");
                System.out.println("Decimos en el set el tipo de Orden que queremos (Directa)");
                a1.setOrden(o2);
                System.out.println("Ejecutamos el algoritmo");
                arr3 = a1.result(arr);
                System.out.println("Resultado: ");
                a1.printArray(arr3);
                System.out.println("\n");
                System.out.println("Ordenación Burbuja\n");
                System.out.println("Decimos en el set el tipo de Orden que queremos (Burbuja)");
                a1.setOrden(o1);
                System.out.println("Ejecutamos el algoritmo");
                arr2 = a1.result(arr);
                System.out.println("Resultado: ");
                a1.printArray(arr2);
                break;
        }
    }
}
