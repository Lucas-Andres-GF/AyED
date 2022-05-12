package ejercicio4;
import tp02.ejercicio3.ColaGenerica;
public class Main {
    public static void main(String[] args) {
        String s = "hola"; 
        ColaGenerica<Character> cola = new ColaGenerica<Character>();    
        Character elem; 
        for (int i = 0 ; i < s.length(); i++){
            elem = s.charAt(i); 
            cola.encolar(elem);
        }
        System.out.println("---Cola---");
        while (!cola.esVacia()){
            System.out.print(cola.desencolar() + "-");
        }
    }
}
