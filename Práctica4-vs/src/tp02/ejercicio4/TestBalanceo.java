package tp02.ejercicio4;

import tp02.ejercicio3.ColaGenerica;

public class TestBalanceo {

    public String determinarBalanceo (String s) {
        ColaGenerica<Character> cola = new ColaGenerica<Character>(); 
        if (s.equals(null)){
            return "S es un String de longitud cero "; 
        }
        Character elem; 
        for (int i = 0 ; i < s.length(); i++){
            elem = s.charAt(i); 
            cola.encolar(elem);
        }
        return "El String se encuentra balanceado"; 

        
    }

}
