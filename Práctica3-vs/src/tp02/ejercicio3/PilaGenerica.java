package tp02.ejercicio3;
import tp02.ejercicio2.*;

public class PilaGenerica <T> {
    private ListaGenerica <T> datos; 

    public PilaGenerica (){
        datos = new ListaEnlazadaGenerica<T>(); 
    }
    
    public void apilar (T elem){
        datos.agregarFinal(elem); 
    }

    public T desapilar(){
        T elem = tope();  
        datos.eliminarEn(datos.tamanio()); 
        return elem;
    }

    public T tope(){
        T elem = datos.elemento(datos.tamanio());
        return elem; 
    }

    public boolean esVacia(){
        return datos.esVacia(); 
    }

}
