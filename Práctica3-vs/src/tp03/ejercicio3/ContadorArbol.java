package tp03.ejercicio3;

import tp03.ejercicio1.*;

public class ContadorArbol {
    private ArbolBinario <Integer> dato;  

	public ContadorArbol (ArbolBinario<Integer> dato){
		this.dato = dato;
	}

	public void numerosParesPosOrden(){
		if (dato.tieneHijoIzquierdo()){
			ContadorArbol cont = new ContadorArbol(dato.getHijoIzquierdo()); 
			cont.numerosParesPosOrden();
		}
		if(dato.tieneHijoDerecho()){
			ContadorArbol cont = new ContadorArbol(dato.getHijoDerecho()); 
			cont.numerosParesPosOrden();
		}
		if (dato.getDato() % 2 == 0){
			System.out.println(dato.getDato());
		}
    }

    public void numerosParesInOrden(){
		if (dato.tieneHijoIzquierdo()){
			ContadorArbol cont = new ContadorArbol(dato.getHijoIzquierdo()); 
			cont.numerosParesInOrden();
		}
		if (dato.getDato() % 2 == 0){
			System.out.println(dato.getDato());
		}
		if(dato.tieneHijoDerecho()){
			ContadorArbol cont = new ContadorArbol(dato.getHijoDerecho()); 
			cont.numerosParesInOrden();
		}
    }

    // public void printPosorden(){
	// 	if (arbol.tieneHijoIzquierdo()){
	// 		arbol.getHijoIzquierdo().printPosorden();
	// 	}
	// 	if(arbol.tieneHijoDerecho()){
	// 		arbol.getHijoDerecho().printPosorden();
	// 	}
	// 	System.out.println(arbol.getDato());
	// }

	// public void printInorden (){
	// 	if (arbol.tieneHijoIzquierdo()){
	// 		arbol.getHijoIzquierdo().printInorden();
	// 	}
	// 	System.out.println(arbol.getDato());
	// 	if(arbol.tieneHijoDerecho()){
	// 		arbol.getHijoDerecho().printInorden();
	// 	}
	// }
	
}
