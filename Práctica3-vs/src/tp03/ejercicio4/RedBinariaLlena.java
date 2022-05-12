package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;
import java.lang.Math;

public class RedBinariaLlena {
    private ArbolBinario <Integer> arbol; 

    public RedBinariaLlena ( ArbolBinario <Integer> arbol){
        this.arbol = arbol; 
    }

    public int retardoReenvio() {
        int retardoIzquierdo = 0;
        int retardoDerecho = 0;

        if (arbol.tieneHijoIzquierdo()) {
            RedBinariaLlena redIzquierda = new RedBinariaLlena(arbol.getHijoIzquierdo());
            retardoIzquierdo = redIzquierda.retardoReenvio();
        }

        if (arbol.tieneHijoDerecho()) {
            RedBinariaLlena redDerecha = new RedBinariaLlena(arbol.getHijoDerecho());
            retardoDerecho = redDerecha.retardoReenvio();
        }

        int max = Math.max(retardoIzquierdo, retardoDerecho);
        return arbol.getDato() + max;
    }
    
}

