package tp03.ejercicio1;
import tp02.ejercicio3.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}
	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public void printPreorden (){
		System.out.println(this.getDato());
		if (this.tieneHijoIzquierdo()){
			getHijoIzquierdo().printPreorden();
		}
		if(this.tieneHijoDerecho()){
			getHijoDerecho().printPreorden();
		}
	}

	public void printPosorden(){
		if (this.tieneHijoIzquierdo()){
			this.getHijoIzquierdo().printPosorden();
		}
		if(this.tieneHijoDerecho()){
			this.getHijoDerecho().printPosorden();
		}
		System.out.println(this.getDato());
	}

	public void printInorden (){
		if (this.tieneHijoIzquierdo()){
			this.getHijoIzquierdo().printInorden();
		}
		System.out.println(this.getDato());
		if(this.tieneHijoDerecho()){
			this.getHijoDerecho().printInorden();
		}
	}

	public void printPorNiveles (){
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>(); 
		ArbolBinario <T> arbol_aux = null; 
		cola.encolar(this);
		cola.encolar(null);
		while (!cola.esVacia()) {
			arbol_aux = cola.desencolar();
			if (arbol_aux != null) {
				System.out.print (arbol_aux.getDato() + " ");
				if (arbol_aux.tieneHijoIzquierdo ())
					cola.encolar (arbol_aux.getHijoIzquierdo ());
				if (arbol_aux.tieneHijoDerecho())
					cola.encolar (arbol_aux.getHijoDerecho());
			} else if (!cola.esVacia()) {
				System.out.println(" ");
				cola.encolar(null);
			}
		}
	}

	public boolean lleno () {
		ArbolBinario<T>arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		boolean lleno = true;
		int cant_nodos=0;
		int nivel= 0;
		cola.encolar (this);
		cola.encolar (null);
		while (!cola.esVacia () && lleno) {
			arbol = cola.desencolar();
			if (arbol != null) {
				if (arbol.tieneHijoIzquierdo()) {
					cola.encolar (arbol.getHijoIzquierdo()); 
					cant_nodos++;
				}
				if  (arbol.tieneHijoDerecho()) {
					cola.encolar (arbol.getHijoDerecho());
					cant_nodos++;
				}
			} 
			else if (!cola.esVacia ()) {
				if (cant_nodos == Math.pow (2, ++nivel)) {
					cola.encolar (null);
					cant_nodos=0;
				}
				else 
					lleno=false; 
			}		
		}
		return lleno; 
	}

	public int contarHojas () {
		if (!this.esVacio()){
			if (this.esHoja()){
				return 1;	
			}
			int canth = 0; 
			if (this.tieneHijoIzquierdo()){
				canth += this.getHijoIzquierdo().contarHojas(); 
			}
			if (this.tieneHijoDerecho()){
				canth += this.getHijoDerecho().contarHojas(); 
			}	
			return canth; 
		}
		return 0; 
	}
	
    public ArbolBinario<T> espejo() {
		ArbolBinario<T>abEspejo = new ArbolBinario<T>(this.dato); 
		if (this.tieneHijoIzquierdo()){
			abEspejo.agregarHijoDerecho(this.getHijoIzquierdo().espejo()); 
		}
		if (tieneHijoDerecho()){
			abEspejo.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
		}
		return abEspejo;
	}



	// public void entreNiveles(int n, int m){
	// 	int nivel = 0; 
	// 	if (!this.esVacio()){
	// 		this.
	// 	}
	// }

}
