package tp04.ejercicio5;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class TestAreaEmpresa {
    public static void main(String[] args) { 
        ListaGenerica<ArbolGeneral<AreaEmpresa>>hijos = new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>( ); 
        hijos.agregarFinal(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("J", 13))); 
        hijos.agregarFinal(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("K", 25))); 
        hijos.agregarFinal(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("L", 10)));
        hijos.comenzar();
        ArbolGeneral<AreaEmpresa> h; 
        h = hijos.proximo(); 
        h.agregarHijo(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("A", 4)));
        h.agregarHijo(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("B", 7)));
        h.agregarHijo(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("C", 5)));
        h = hijos.proximo(); 
        h.agregarHijo(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("D", 6)));
        h.agregarHijo(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("E", 10)));
        h.agregarHijo(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("F", 18)));
        h = hijos.proximo(); 
        h.agregarHijo(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("G", 9)));
        h.agregarHijo(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("H", 12)));
        h.agregarHijo(new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("I", 19)));
        AreaEmpresa empresa = new AreaEmpresa("M", 14); 
        ArbolGeneral<AreaEmpresa> arbol = new ArbolGeneral<AreaEmpresa>(empresa,hijos);
        System.out.println(arbol.getDato().devolverMaximoPromedio(arbol)); 
    }
}