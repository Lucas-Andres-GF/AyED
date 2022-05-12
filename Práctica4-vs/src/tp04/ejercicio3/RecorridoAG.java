package tp04.ejercicio3;

import tp02.ejercicio2.*;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.*;

public class RecorridoAG {

    public ListaGenerica <Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral<Integer> a, Integer n){     
        ListaEnlazadaGenerica <Integer> lista = new ListaEnlazadaGenerica<Integer>();
        numerosImparesMayoresQuePreOrden(a,lista,n);
        return lista; 
    }   
    private void numerosImparesMayoresQuePreOrden (ArbolGeneral<Integer>a,ListaGenerica<Integer> lista,int n){
        if ((a.getDato()%2 != 0) && (a.getDato() > n)){
            lista.agregarFinal(a.getDato());  
        }
        if  (a.tieneHijos()){
            ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos(); 
            hijos.comenzar();
            while (!hijos.fin()){
                numerosImparesMayoresQuePreOrden(hijos.proximo(), lista, n); 
            }
        }
    }

    public ListaGenerica <Integer> numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer> a, Integer n){     
        ListaEnlazadaGenerica <Integer> lista = new ListaEnlazadaGenerica<Integer>();
        numerosImparesMayoresQuePostOrden(a,lista,n);
        return lista; 
    }   
    private void numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer>a,ListaGenerica<Integer> lista,int n){
        if  (a.tieneHijos()){
            ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos(); 
            hijos.comenzar();
            while (!hijos.fin()){
                numerosImparesMayoresQuePostOrden(hijos.proximo(), lista, n); 
            }
        }
        if ((a.getDato()%2 != 0) && (a.getDato() > n)){
            lista.agregarFinal(a.getDato());  
        }
    }

    public ListaGenerica <Integer> numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){     
        ListaEnlazadaGenerica <Integer> lista = new ListaEnlazadaGenerica<Integer>();
        numerosImparesMayoresQueInOrden(a,lista,n);
        return lista; 
    }   
    private void numerosImparesMayoresQueInOrden (ArbolGeneral<Integer>a,ListaGenerica<Integer> lista,int n){
        if  (a.tieneHijos()){
            ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos(); 
            hijos.comenzar();
            numerosImparesMayoresQueInOrden(hijos.proximo(), lista, n);
        }
        if ((a.getDato()%2 != 0) && (a.getDato() > n)){
            lista.agregarFinal(a.getDato());  
        }
        if (a.tieneHijos()){
            ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos(); 
            while (!hijos.fin()){
                numerosImparesMayoresQueInOrden(hijos.proximo(), lista, n); 
            }    
        }
    }
    public ListaGenerica <Integer> numerosImparesMayoresQuePorNiveles (ArbolGeneral<Integer> a, Integer n){     
        ListaEnlazadaGenerica <Integer> lista = new ListaEnlazadaGenerica<Integer>();
        ColaGenerica <ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>(); 
        ArbolGeneral<Integer> arbol_aux; 
        cola.encolar(a);
            while (!cola.esVacia()){
                arbol_aux = cola.desencolar(); 
                if ((arbol_aux.getDato() % 2 != 0)&&(arbol_aux.getDato()>n)){
                    lista.agregarFinal(arbol_aux.getDato()); 
                }
                if(arbol_aux.tieneHijos()){
                    ListaGenerica<ArbolGeneral<Integer>> hijos = arbol_aux.getHijos(); 
                    hijos.comenzar();
                    while (!hijos.fin()){
                        cola.encolar(hijos.proximo());
                    }
                }
            }
        return lista; 
    }   

}
    