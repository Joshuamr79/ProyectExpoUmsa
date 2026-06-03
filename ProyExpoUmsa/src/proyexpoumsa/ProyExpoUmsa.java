package proyexpoumsa;
import java.util.Scanner;

public class ProyExpoUmsa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        ExpoUmsa miExpo = null; 

        do {
            System.out.println("\n=======================================");
            System.out.println("      PROGRAMA EXPO UMSA - MENU");
            System.out.println("=======================================");
            System.out.println("1. Organizar nueva Expo (Registrar Stands)");
            System.out.println("2. Mostrar toda la Expo y Stands");
            System.out.println("3. Buscar un Stand especifico (Por numero)");
            System.out.println("4. Salir del Programa");
            System.out.print("-> Elige una opcion: ");
            
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- 1. ORGANIZANDO NUEVA EXPO ---");
                    System.out.print("Ingrese la Gestion (Ej: 2026): ");
                    String gestion = teclado.next();
                    
                    System.out.print("Cuantos Stands tendra la Expo?: ");
                    int cant = teclado.nextInt();
                    
                    // Llama a tu constructor de ExpoUmsa.java
                    miExpo = new ExpoUmsa(gestion, cant); 
                    System.out.println("\nExpo organizada y registrada con exito!");
                    break;

                case 2:
                    System.out.println("\n--- 2. MOSTRANDO EXPO ---");
                    if (miExpo != null) {
                        miExpo.mostrar(); 
                    } else {
                        System.out.println("Error: Primero debes organizar la Expo (Opcion 1).");
                    }
                    break;

                case 3:
                    System.out.println("\n--- 3. BUSCAR STAND ---");
                    if (miExpo != null) {
                        System.out.print("Ingrese el numero del Stand a buscar: ");
                        int nroStand = teclado.nextInt();
                        
                        miExpo.buscarStand(nroStand); 
                    } else {
                        System.out.println("Error: Primero debes organizar la Expo (Opcion 1).");
                    }
                    break;

                case 4:
                    System.out.println("\nCerrando el programa... Mucho exito en tu presentacion!");
                    break;

                default:
                    System.out.println("\nOpcion no valida. Por favor ingresa un numero del 1 al 4.");
                    break;
            }
        } while (opcion != 4);
    }
}