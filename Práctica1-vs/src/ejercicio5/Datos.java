package ejercicio5;

public class Datos {
	private int mayor = -2147483648;
	private int menor = 2147483647;
	private double promedio = 0;
	
	public int getMayor() {
		return mayor;
	}
	public void setMayor(int mayor) {
		this.mayor = mayor;
	}
	public int getMenor() {
		return menor;
	}
	public void setMenor(int menor) {
		this.menor = menor;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	} 
	@Override
	public String toString() {
		return "Datos [mayor=" + mayor + ", menor=" + menor + ", promedio=" + promedio + "]";
	}
}
