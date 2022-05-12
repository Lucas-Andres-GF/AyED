package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {
	private T dato;
	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}
	public boolean lleno() {
	 ArbolBinario<T> arbol = null;
	 ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
	 boolean lleno = true;
	 cola.encolar( this);
	 int cant_nodos=0;
	 cola.encolar( null);
	 int nivel= 0;

	 while (!cola.esVacia() && lleno) {
		 arbol = cola.desencolar();
		 if (arbol != null) {
			 System. out.print(arbol.getDatoRaiz());
			 if (!arbol.getHijoIzquierdo().esvacio()) {
				 cola.encolar(arbol.getHijoIzquierdo());
				 cant_nodos++;
			 }
			 if (! arbol.getHijoDerecho().esvacio()) {
				 cola.encolar(arbol.getHijoDerecho());
				 cant_nodos++;
			 }
		 } else if (!cola.esVacia()) {
			 if (cant_nodos == Math.pow(2, ++nivel)){
				 cola.encolar( null);
				 cant_nodos=0;
				 System. out.println();
			 }
			 else lleno=false;
			}
	 }
	 return lleno;
}
	public T getDato() {
		return dato;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {
		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {
		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {
		return this.dato == null && !this.tieneHijos();
	}

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	// Recorridos
	public ListaEnlazadaGenerica<T> preOrden (){
        ListaEnlazadaGenerica<T> lis = new ListaEnlazadaGenerica<T>();
        this.preOrden(lis);
        return lis;
    }
    private void preOrden(ListaGenerica<T> lis){
        lis.agregarFinal(this.getDato());
        if (this.tieneHijos()){
			ListaGenerica<ArbolGeneral <T>> lHijos = this.getHijos ();
			lHijos.comenzar();
        	while (!lHijos.fin()){
            	lHijos.proximo().preOrden(lis);
        	}
		}
    }

	public  ListaEnlazadaGenerica<T> postOrden (){
		ListaEnlazadaGenerica<T> lis = new ListaEnlazadaGenerica<T>(); 
		this.postOrden(lis);
		return lis;   
	}
	private void postOrden (ListaGenerica<T>lis){
		if (this.tieneHijos()){
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos(); 
			hijos.comenzar();
			while (! hijos.fin()) {
				hijos.proximo().postOrden(lis); 
			}		 	
		}
		lis.agregarFinal(this.getDato());
	}

	public ListaEnlazadaGenerica<T> inOrden() {
        ListaEnlazadaGenerica<T> lis = new ListaEnlazadaGenerica<T>();
        this.inOrden(lis);
        return lis;
    }
    private void inOrden(ListaGenerica<T> l) {
        if (this.tieneHijos()) {
            ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();
            lHijos.comenzar();
            lHijos.proximo().inOrden(l);
        }
        l.agregarFinal(this.getDato());

        if (this.tieneHijos()) {
            ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();
            while (!lHijos.fin()) {
                (lHijos.proximo()).inOrden(l);
            }
        }
    }

	public ListaGenerica<T> porNiveles (){
		ListaGenerica<T> result = new ListaEnlazadaGenerica<T>();
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
	  	ArbolGeneral<T> arbol_aux;
		cola.encolar(this);
	    while (!cola.esVacia()){
			arbol_aux = cola.desencolar();
			result.agregarFinal(arbol_aux.getDato());
			if (arbol_aux.tieneHijos ()){
				ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos ();
				hijos.comenzar();
				while (!hijos.fin()){
					cola.encolar (hijos.proximo());
				}
			}
		}
		return result;
	}	

	public int altura (){
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>(); 
		ArbolGeneral<T> arbol_aux; 
		cola.encolar(this);
		cola.encolar(null);
		int altura = -1; 
		while (!cola.esVacia()){
			arbol_aux = cola.desencolar();
			if (arbol_aux != null){
				if (arbol_aux.tieneHijos()){
					ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos ();
					hijos.comenzar();
					while (!hijos.fin()){
						cola.encolar (hijos.proximo());
					}
				}
			}else {
				if (!cola.esVacia()){
					cola.encolar(null);  
				}
				altura++;
			}
		}
		return altura; 
	}
	// public Integer altura() {
	// 	int i = -1; 
	// 	if (this.esHoja()){
	// 		return 0; 
	// 	}
	// 	else{
	// 		if(this.tieneHijos()){
	// 			ListaGenerica<ArbolGeneral<T>> hijos  = this.getHijos(); 
	// 			hijos.comenzar();
	// 			while (!hijos.fin()){
	// 				i = Math.max(i,hijos.proximo().altura()); 
	// 			}
	// 		}
	// 	}
	// 	return i + 1; 
	// }

	public int nivel (T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>(); 
		ArbolGeneral<T> arbol_aux; 
		cola.encolar(this);
		cola.encolar(null);
		int nivel = 0; 
		while (!cola.esVacia()){
			arbol_aux = cola.desencolar(); 
			if (arbol_aux != null){
				if (arbol_aux.getDato() == dato){
					return nivel; 
				}else{
					if (arbol_aux.tieneHijos()){
						ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos(); 
						hijos.comenzar();
						while (!hijos.fin()){
							cola.encolar(hijos.proximo());
						}
					}
				}
			}
			else{
				if (!cola.esVacia()){
					cola.encolar(null);
					nivel ++; 
				}
			}
		}
		return nivel; 
	}

	public Integer ancho() {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>(); 
		ArbolGeneral<T> arbol_aux; 
		cola.encolar(this);
		cola.encolar(null);
		int ancho = 0; 
		int anchoNivel = 0; 
		while (!cola.esVacia()){
			arbol_aux = cola.desencolar();
			if (arbol_aux != null){
				anchoNivel += 1; 
				if (arbol_aux.tieneHijos()){
					ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos(); 
					hijos.comenzar();
					while (!hijos.fin()){
						cola.encolar(hijos.proximo());
					}
				}
			}else{
				if (!cola.esVacia()){
					cola.encolar(null);
				}
				if (anchoNivel > ancho){
					ancho = anchoNivel; 
				}
				anchoNivel = 0; 
			}
		}
		return ancho; 
	}

	public Boolean esAncestro(T a, T b){
		return encontar(a, b) == null; 
	}
	private T encontar (T a, T b){
		if (this.getDato() == b ){
			return b; 
		}
		if (this.esHoja()){
			return this.getDato(); 
		}
		if (this.tieneHijos()){
			ListaGenerica<ArbolGeneral <T>> hijos = this.getHijos ();
			hijos.comenzar();
			while (!hijos.fin()){
				T dato = hijos.proximo().encontar(a, b); 
				if (dato == b){
					if (this.getDato() == a){
						return null; 
					}
					return b; 
				}
				if (dato == null)
					return null;   
			}
		}
		return this.getDato(); 
	}
	
	private ArbolGeneral<T> buscarNodo(T n) {
        if (this.getDato()== n) {
            return this;
        }
        if (!this.tieneHijos()) {
            return null;
        }
		if (this.tieneHijos()){}
        ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
        hijos.comenzar();
        while (!hijos.fin()) {
			ArbolGeneral<T> a = hijos.proximo().buscarNodo(n);
			if (a != null && a.getDato() == n) 
				return a;
        }
        return null;
    }

    public Boolean esAncestre(T a, T b) {
        ArbolGeneral<T> esA = this.buscarNodo(a);
        if (esA == null) return false;
        ArbolGeneral<T> esB = esA.buscarNodo(b);
        return esB != null;
    }
    public Boolean esDescendiente(T a, T b) {
        ArbolGeneral<T> esB = this.buscarNodo(b);
        if (esB == null) return false;
        ArbolGeneral<T> esA = esB.buscarNodo(a);
        return esA != null;
    }
	// public ListaEnlazadaGenerica<T> preOrden (){
	//     ListaEnlazadaGenerica<T> lis = new ListaEnlazadaGenerica<T>();
	//     this.preOrden(lis);
	//     return lis;
	// }
	// private void preOrden(ListaGenerica<T> lis){
	//     lis.agregarFinal(this.getDato());
	//     if (this.tieneHijos()){
	// 		ListaGenerica<ArbolGeneral <T>> lHijos = this.getHijos ();
	// 		lHijos.comenzar();
	//     	while (!lHijos.fin()){
	//         	lHijos.proximo().preOrden(lis);
	//     	}
	// 	}
	// }
	
}