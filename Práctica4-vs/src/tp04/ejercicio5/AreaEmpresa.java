package tp04.ejercicio5;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.ArbolGeneral;
public class AreaEmpresa {
    private String id; 
    private int tardanza; 
    
    public AreaEmpresa (String id,int tardanza){
        this.setId(id);
        this.setTardanza(tardanza);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTardanza() {
        return tardanza;
    }

    public void setTardanza(int tardanza) {
        this.tardanza = tardanza;
    }


    public int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa>arbol){
        ColaGenerica <ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>(); 
        ArbolGeneral<AreaEmpresa> arbol_aux; 
        cola.encolar(arbol);
        cola.encolar(null);
        int cantNodos = 0; 
        int suma = 0; 
        int prom = 0; 
        int promN = 0; 
        while (!cola.esVacia()){
            arbol_aux = cola.desencolar(); 
            if (arbol_aux != null){ 
                suma += arbol_aux.getDato().getTardanza();  
                cantNodos ++; 
                if (arbol_aux.tieneHijos()){
                    ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = arbol_aux.getHijos(); 
                    hijos.comenzar();
                    while (!hijos.fin()){
                        cola.encolar(hijos.proximo());
                    }
                }
            }else{
                promN = (int)(suma / cantNodos);  
                if (promN > prom)
                    prom = promN; 
                if (!cola.esVacia()){
                    cola.encolar(null);
                    suma = 0; 
                    cantNodos = 0; 
                    promN = 0; 
                }
            }
        }
        return prom; 
    }
}
