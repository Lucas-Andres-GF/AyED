package ejercicio5;

public class Main {
	public static void main(String[] args) { 
		int num = (int) (Math.random() * 10) ; 
		System.out.println("El vector contendra " + num + " Numeros");
		int [] array = new int[num];
		for (int i= 0; i < num ; i++) {
			array[i] = (int)(Math.random()*100); 
		}
		System.out.println("Arreglo");
		for (int i: array) {
			System.out.println(i);
		}
		
		System.out.println(Metodos.obtenerDatos1(array)); 
		
		Datos d = new Datos(); 
		Metodos.obtenerDatos2(array, d);
		System.out.println(d); 
		
		Metodos.obtenerDatos3(array);

	}	
}
