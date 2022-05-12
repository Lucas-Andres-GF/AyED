package tp03.ejercicio1;

public class Main {
    public static void main (String[] args) { 
        ArbolBinario <Integer> ab = new ArbolBinario <Integer>((10)); 
        ArbolBinario <Integer> hi = new ArbolBinario <Integer>(25); 
        hi.agregarHijoIzquierdo(new ArbolBinario<Integer>(40));
        hi.agregarHijoDerecho(new ArbolBinario<Integer>(33));
        hi.getHijoIzquierdo().agregarHijoIzquierdo(new ArbolBinario<Integer>(99));
        hi.getHijoIzquierdo().agregarHijoDerecho(new ArbolBinario<Integer>(105));
        ArbolBinario <Integer> hd = new ArbolBinario<Integer>(78); 
        hd.agregarHijoIzquierdo(new ArbolBinario<Integer>(66));
        hd.agregarHijoDerecho(new ArbolBinario<Integer>(50));
        ab.agregarHijoIzquierdo(hi);
        ab.agregarHijoDerecho(hd);

        // System.out.println("PreOrden");
        // ab.printPreorden();

        // System.out.println("PosOrden");
        // ab.printPosorden();

        // System.out.println("InOrden");
        // ab.printInorden();

        System.out.println("En niveles");
        ab.printPorNiveles();

        // System.out.println();
        // System.out.println("Es lleno?: "  + ab.lleno());

        // System.out.println("Hojas: " + ab.contarHojas());
        
        // System.out.println();
        // System.out.println("Arbol Espejo");
        // ab.espejo().printPorNiveles();; 
    }

}
