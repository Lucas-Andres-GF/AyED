package ejercicio2;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Ingrese un valor: ");
		int n = input.nextInt(); 
		int [] arreglo = Metodos.NuevoArray(n); 
		for (int i : arreglo) {
			System.out.println(i);
		}
		input.close();
	}
}
