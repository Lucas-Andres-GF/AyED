package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class TestRedBinaria {
    public static void main(String[] args) {
        ArbolBinario <Integer> ab = new ArbolBinario <Integer>((10)); 
        ArbolBinario <Integer> hi = new ArbolBinario <Integer>(25); 
        ArbolBinario <Integer> hd = new ArbolBinario <Integer>(33); 
        hi.agregarHijoIzquierdo(new ArbolBinario<Integer>(40));
        hi.agregarHijoDerecho(new ArbolBinario<Integer>(55));
        hd.agregarHijoIzquierdo(new ArbolBinario<Integer>(77));
        hd.agregarHijoDerecho(new ArbolBinario<Integer>(12));
        ab.agregarHijoIzquierdo(hi);
        ab.agregarHijoDerecho(hd);
        RedBinariaLlena red = new RedBinariaLlena (ab); 
        System.out.println(red.retardoReenvio());
    }
}
