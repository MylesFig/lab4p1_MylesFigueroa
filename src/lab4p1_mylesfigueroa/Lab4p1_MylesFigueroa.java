/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_mylesfigueroa;
import java.util.Scanner;
/**
 *
 * @author Myles Figueroa
 */
public class Lab4p1_MylesFigueroa {
    static Scanner leer=new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1. Cifrado de vocales");
        System.out.println("2. Verificacion de mensajeria");
        System.out.println("3. Original Contains");
        System.out.println("4. Salir");
        System.out.println(" Elija el ejercicio al cual entrar: ");
        int opcion = leer.nextInt();
        while (opcion!=5){
            switch(opcion){
                case 1:
                    cifradomen();
                    break;
                case 2:
                    verificacionmen();
                    break;
                case 3:
                    oricontains();
                    break;
                case 4:
                    salir();
                    break;
            }
            System.out.println("1. Cifrado de vocales");
            System.out.println("2. Verificacion de mensajeria");
            System.out.println("3. Original Contains");
            System.out.println("4. Salir");
            System.out.println(" Elija el ejercicio al cual entrar: ");
            opcion=leer.nextInt();
            
        }
        
    }
    public static void cifradomen (){
        System.out.println("*Cifrado de cadenas*");
        System.out.println("Ingrese la palabra que desea codificar: ");
        String palabra=leer.next();
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            
            if(letra=='a')
                System.out.print(letra+"4");
            else
                if(letra=='e')
                    System.out.print(letra+"3");
                else
                    if(letra=='i')
                        System.out.print(letra+"1");
                    else
                        if(letra=='o')
                            System.out.print(letra+"0");
                        
                        else
                            if(letra=='s')
                                System.out.print(letra+"5");
                            else
                                if(letra=='h')
                                    System.out.print(letra+"#");
                                else
                                    if(letra=='t')
                                        System.out.print(letra+"+");
                                    else
                                        System.out.print("Codigo cifrado: "+letra+"");
                                            
            }
            System.out.println();
            
            
                
    }
    public static void verificacionmen(){
        System.out.println("*Verificador de mensajes*");
        
    }
    public static void oricontains(){
        System.out.println("");
    }
    public static void salir(){
        System.out.println(" Fin del programa");
        
    }
}
