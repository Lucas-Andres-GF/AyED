package ejercicio1;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

//import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class Ejercicio1_6 {
    public ListaDeEnterosEnlazada getSecuencia (int n){ 
        if (n == 1){
            ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada(); 
            lista.agregarInicio(n); 
            return lista;
        }
        else{
            int act = n; 
            if (n % 2 == 0){
                n = n / 2;
            }
            else {
                n = (3 * n) + 1; 
            }
            ListaDeEnterosEnlazada lista = getSecuencia(n);
            lista.agregarInicio(act); 
            return lista;  
        }
    }

    public static void main(String[] args) {
        Ejercicio1_6 f = new Ejercicio1_6(); 
        ListaDeEnterosEnlazada lista = f.getSecuencia(6); 
        lista.comenzar();
		while (! lista.fin()) {
			System.out.print(lista.proximo() + " ");  
		} 
    }   
}
