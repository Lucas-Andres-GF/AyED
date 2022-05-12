package tp04.ejercicio7;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RedDeAguaPotable{ 
    private ArbolGeneral<String> arbol; 

    public RedDeAguaPotable (ArbolGeneral<String>arbol){
        this.arbol = arbol; 
    }

    public double minimo (double caudal){
        double min = caudal;  
        double minTemp = 0; 
        if (arbol.tieneHijos()){
            ListaGenerica <ArbolGeneral<String>> hijos = arbol.getHijos();
            hijos.comenzar();
            while (!hijos.fin()){
                RedDeAguaPotable red = new RedDeAguaPotable(hijos.proximo());    
                minTemp = red.minimo(caudal / hijos.tamanio()); 
                if ( minTemp < min){
                    min = minTemp; 
                }
            }
        }
        return min; 
    } 
}
