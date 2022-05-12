package ejercicio1;

import tp02.ejercicio1.*;
import java.util.Scanner;

public class TestListaDeEnterosConArreglos {
	public static void imprimirRecursivo (ListaDeEnterosConArreglos lista) {
		if (!lista.fin()) {
			int l = lista.proximo();
			imprimirRecursivo(lista);
			System.out.print(l + " ");
		}
	}
	public static void imprimirRecursivo2 (ListaDeEnterosConArreglos lista, Integer pos ) {
		if (! lista.esVacia())
			System.out.print(lista.elemento(pos) + " ");
			if (pos > 1)
				imprimirRecursivo2(lista, pos -1);
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in); 
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos(); 
		Integer x; 

		System.out.print("Num:");
		x = input.nextInt();  
		
		while (x != 0) {
			lista.agregarFinal(x); 
			System.out.print("Num:");x = input.nextInt();
		}
		input.close();
		
		while (!lista.fin()) {
			System.out.print(lista.proximo() + " ");  
		}
		
		System.out.println();
		
		System.out.println("Forma Recursiva");
		lista.comenzar();
		imprimirRecursivo(lista); 
		Integer pos = (lista.tamanio()); 
		System.out.println();// salto de linea
		imprimirRecursivo2(lista,pos);
		lista.comenzar();
		System.out.println();
		System.out.println("Lista con toString()");
		System.out.println(lista);
	}
}