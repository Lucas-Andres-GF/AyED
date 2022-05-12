package ejercicio2;
import tp02.ejercicio2.*;
public class TestListaEnlazadaGenerica {
    public static void main(String[] args) {
    ListaEnlazadaGenerica <Estudiante> lista = new ListaEnlazadaGenerica <Estudiante>(); 
    for (int i = 0; i<4; i++){
        Estudiante estu = new Estudiante();    
        lista.agregarFinal(estu);   
    }
    while (!lista.fin()){ 
        System.out.println(lista.proximo().tusDatos());
    }
    Integer [] array = new Integer [4]; 
    for (int i=0; i<4; i++){
        array[i] = new Integer(i + 100);  
    }

    ListaEnlazadaGenerica<Integer> ListaDeNumeros = new ListaEnlazadaGenerica<Integer>(); 
    ListaDeNumeros.agregarArray(array); 

    System.out.println("---------------------");
    System.out.println("Lista de Numeros ");
    while (!ListaDeNumeros.fin()){
        System.out.println(ListaDeNumeros.proximo());
    }

    }
}
