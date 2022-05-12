package tp04.ejercicio3;
import tp04.ejercicio1.*;
import tp02.ejercicio2.*;
public class TestRecorridoAG {
    public static void main(String[] args) {
        ArbolGeneral <Integer> a1 = new ArbolGeneral<Integer>(11); 
        ArbolGeneral <Integer> a2 = new ArbolGeneral<Integer>(7); 
        ArbolGeneral <Integer> a3 = new ArbolGeneral<Integer>(13); 
        ListaGenerica <ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>(); 
        hijos.agregarFinal(a1); 
        hijos.agregarFinal(a2); 
        hijos.agregarFinal(a3);
        ArbolGeneral<Integer> h = hijos.proximo(); 
        h.agregarHijo(new ArbolGeneral<Integer>(19));
        h.agregarHijo(new ArbolGeneral<Integer>(23));
        h.agregarHijo(new ArbolGeneral<Integer>(17));
        hijos.proximo().agregarHijo(new ArbolGeneral<Integer>(12));
        ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(5, hijos);  
        RecorridoAG recorrido = new RecorridoAG();
        System.out.println(recorrido.numerosImparesMayoresQuePreOrden(arbol, 5) );
        System.out.println(recorrido.numerosImparesMayoresQuePostOrden(arbol, 5));
        System.out.println(recorrido.numerosImparesMayoresQueInOrden(arbol, 5));
        System.out.println(recorrido.numerosImparesMayoresQuePorNiveles(arbol, 5));
        System.out.println(arbol.altura());
        System.out.println(arbol.nivel(11));
        System.out.println(arbol.ancho());
    }
}
