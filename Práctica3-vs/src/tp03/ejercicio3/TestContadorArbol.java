package tp03.ejercicio3;
import tp03.ejercicio1.ArbolBinario;
public class TestContadorArbol {
    public static void main(String[] args) {
        ArbolBinario <Integer> ab = new ArbolBinario <Integer>((10)); 
        ArbolBinario <Integer> hi = new ArbolBinario <Integer>(25); 
        hi.agregarHijoIzquierdo(new ArbolBinario<Integer>(40));
        hi.agregarHijoDerecho(new ArbolBinario<Integer>(33));
        ArbolBinario <Integer> hd = new ArbolBinario <Integer>(66); 
        hd.agregarHijoDerecho(new ArbolBinario<Integer>(88));
        hd.getHijoDerecho().agregarHijoIzquierdo(new ArbolBinario<Integer>(100));
        ab.agregarHijoIzquierdo(hi);
        ab.agregarHijoDerecho(hd);

        ContadorArbol arbolPares = new ContadorArbol(ab); 
        arbolPares.numerosParesPosOrden();
        System.out.println();
        arbolPares.numerosParesInOrden();
    }   
}
