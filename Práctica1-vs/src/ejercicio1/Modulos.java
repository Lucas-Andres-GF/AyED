package ejercicio1;

public class Modulos {

	public static void ImprimirFor (int a , int b) {
		for (int i=a ; i <= b ; i++) {
			System.out.println(i);
		}
	}
	
	public static void ImprimirWhile (int a, int b ) {
		while (a <= b) {
			System.out.println(a);
			a++; 
		}
	}
	
	public static void Imprimir(int a, int b) {
		if (a <= b){
			System.out.println(a);
			++a; 
			Modulos.Imprimir(a, b);
		}
	}
}