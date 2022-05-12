package ejercicio4;

import java.util.Scanner;
import tp02.ejercicio3.PilaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class Main_Pila_cola {
    public static void main(String[] args) {
        PilaGenerica <Integer> p = new PilaGenerica <Integer>(); 
        
        Integer elem;
        Scanner s = new Scanner(System.in); 
        System.out.print("Numero: "); elem = s.nextInt(); 
        System.out.println();
        while (elem != 0) {
            p.apilar(elem);
            System.out.print("Numero: "); elem = s.nextInt();
            System.out.println();
        }
        System.out.println("-----Pila-----");
        while (! p.esVacia()){
            System.out.println(p.desapilar());
        }

       //System.out.println("Tope: " + p.tope());
        
        ColaGenerica <Integer> c = new ColaGenerica<>(); 
        System.out.print("Numero: "); elem = s.nextInt();
        System.out.println();
        while (elem != 0){
            c.encolar(elem);
            System.out.print("Numero: "); elem = s.nextInt();
            System.out.println();
        }
        System.out.println("-----Cola-----");
        while (! c.esVacia()){
            System.out.print(c.desencolar() + " ");
        }
        
        s.close();
    }
}
