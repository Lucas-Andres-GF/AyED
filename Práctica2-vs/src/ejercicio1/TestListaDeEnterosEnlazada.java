package ejercicio1;

import java.util.Scanner;
import tp02.ejercicio1.*;

public class TestListaDeEnterosEnlazada {
	public static void imprimirRecursivo (ListaDeEnterosEnlazada lista) {
		if (!lista.fin()) {
			int l = lista.proximo();
			imprimirRecursivo(lista);
			System.out.print(l + " ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada(); 
		Integer x; 
		System.out.print("Num:");
		x = input.nextInt();  
		
		while (x != 0) {
			lista.agregarFinal(x); 
			System.out.print("Num:");x = input.nextInt();
		}
		
		lista.comenzar();

		while (! lista.fin()) {
			System.out.print(lista.proximo() + " ");  
		}
		
		input.close();
		System.out.println();

		lista.comenzar();
		System.out.println("Forma resursiva");
		imprimirRecursivo(lista);
	}
	
}
