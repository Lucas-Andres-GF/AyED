package tp03.ejercicio5;

import tp03.ejercicio1.*;

public class TestProfundidad {
    public static void main(String[] args) {
        ArbolBinario <Integer> ab = new ArbolBinario <Integer>((10)); 
        ArbolBinario <Integer> hi = new ArbolBinario <Integer>(25); 
        ArbolBinario <Integer> hd = new ArbolBinario <Integer>(33); 
        hi.agregarHijoIzquierdo(new ArbolBinario<Integer>(40));
        hi.agregarHijoDerecho(new ArbolBinario<Integer>(55));
        hd.agregarHijoIzquierdo(new ArbolBinario<Integer>(77));
        hd.agregarHijoDerecho(new ArbolBinario<Integer>(12));
        hi.getHijoIzquierdo().agregarHijoIzquierdo(new ArbolBinario<Integer>(39));
        hi.getHijoIzquierdo().agregarHijoDerecho(new ArbolBinario<Integer>(27));
        ab.agregarHijoIzquierdo(hi);
        ab.agregarHijoDerecho(hd);
        
        ProfundidaDeArbolBinario prof = new ProfundidaDeArbolBinario(ab); 
        System.out.println(prof.sumaElementosProfundidad(4));

    }
}
