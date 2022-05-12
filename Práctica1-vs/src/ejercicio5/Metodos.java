package ejercicio5;

public class Metodos {
    
	public static String obtenerDatos1 (int[]arreglo) {
		int menor= 9999; 
		int mayor= -9999; 
		int suma = 0; 
		for (int i: arreglo) {
			if (i < menor) {
				menor = i; 
			}
			if (i > mayor) {
				mayor = i; 
			}
			suma += i; 
		}
		return "Menor:" + menor + " Mayor:" + mayor + " Promedio:" + suma/ (double)arreglo.length ; 
	}
	
	public static void obtenerDatos2 (int[] arreglo, Datos d) {
		int suma = 0; 
		for (int i : arreglo) {
			if (i < d.getMenor()) {
				d.setMenor(i);  
			}
			if (i > d.getMayor()) {
				d.setMayor(i); 
			}
			suma += i; 
		}
		d.setPromedio( suma / (double)arreglo.length);	 
	}
	
	public static void obtenerDatos3(int[] arreglo) {
		int menor= 9999; 
		int mayor= -9999; 
		int suma = 0; 
		for (int i: arreglo) {
			if (i < menor) {
				menor = i; 
			}
			if (i > mayor) {
				mayor = i; 
			}
			suma += i; 
		}
		System.out.println("Menor:" + menor + " Mayor:" + mayor + " Promedio:" + suma/ (double)arreglo.length );
	}
}
