package ejercicio2;

public class Metodos {
	
	public static int [] NuevoArray(int n) {
		int [] array = new int [n]; 
		for (int i = 0; i < n; i++) {
			array[i] = n * (i + 1); 
		}
		return array; 
	}
}

