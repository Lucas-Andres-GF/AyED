package tp04.ejercicio2;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class TestArbolGenerales {
    public static void main(String[] args) {
        ArbolGeneral <Integer> a1 = new ArbolGeneral<Integer>(10); 
        ArbolGeneral <Integer> a2 = new ArbolGeneral<Integer>(7); 
        ArbolGeneral <Integer> a3 = new ArbolGeneral<Integer>(13); 
        ListaGenerica <ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>(); 
        hijos.agregarFinal(a1); 
        hijos.agregarFinal(a2); 
        hijos.agregarFinal(a3);
        hijos.comenzar();
        hijos.proximo().agregarHijo(new ArbolGeneral<Integer>(19));
        hijos.comenzar();
        ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(5, hijos);  
        System.out.println(arbol.preOrden());
        System.out.println(arbol.postOrden());
        System.out.println(arbol.inOrden());
        System.out.println(arbol.porNiveles());
        if (arbol.esDescendiente(19, 7)){
            System.out.println("Siiiiiiiii");
        }else{
            System.out.println("Nooooooooooo");
        }
    }
}
