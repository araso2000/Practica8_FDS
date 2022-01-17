package state;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        Scanner scan = new Scanner(System.in);
        
        coche.estado();
        
        int opt=-1;
        
        while(opt!=0){
            System.out.println("1.Contacto\n2.Repostar\n3.Acelerar\n4.Frenar\n5.Estado del vehiculo\n0.SALIR\n");
            opt=scan.nextInt();
            
            switch(opt){
                case 1:
                    coche.contacto();
                    break;
                case 2:
                    int cantidad=0;
                    if(coche.getTituloEstado().equals("Sin combustible")){
                        System.out.println("Cantidad a repostar: ");
                        cantidad = scan.nextInt();
                        coche.repostar(cantidad);
                    }else{
                        coche.repostar(cantidad);
                    }
                    break;
                case 3:
                    coche.acelerar();
                    break;
                case 4:
                    coche.frenar();
                    break;
                case 5:
                    coche.estado();
                    break;
            }
        }
    } 
}