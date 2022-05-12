package tp04.ejercicio7;
import tp04.ejercicio1.ArbolGeneral;
public class Main {
    public static void main(String[] args) {
		ArbolGeneral<String> a = new ArbolGeneral<String>("a");
		ArbolGeneral<String> b = new ArbolGeneral<String>("b");
		ArbolGeneral<String> c = new ArbolGeneral<String>("c");
		ArbolGeneral<String> d = new ArbolGeneral<String>("d");
		ArbolGeneral<String> e = new ArbolGeneral<String>("e");
		ArbolGeneral<String> f = new ArbolGeneral<String>("f");
		ArbolGeneral<String> g = new ArbolGeneral<String>("g");
		ArbolGeneral<String> h = new ArbolGeneral<String>("h");
		ArbolGeneral<String> i = new ArbolGeneral<String>("i");
		ArbolGeneral<String> j = new ArbolGeneral<String>("j");
		ArbolGeneral<String> k = new ArbolGeneral<String>("k");
		ArbolGeneral<String> l = new ArbolGeneral<String>("l");
		ArbolGeneral<String> m = new ArbolGeneral<String>("m");
		ArbolGeneral<String> n = new ArbolGeneral<String>("n");
		ArbolGeneral<String> o = new ArbolGeneral<String>("o");

		a.agregarHijo(b);
		a.agregarHijo(c);
		a.agregarHijo(d);
		a.agregarHijo(e);
		
		c.agregarHijo(f);
		c.agregarHijo(g);
		
		d.agregarHijo(h);
		d.agregarHijo(i);
		d.agregarHijo(j);
		d.agregarHijo(k);
		d.agregarHijo(o);
		
		j.agregarHijo(m);
		j.agregarHijo(n);

        g.agregarHijo(l);

        RedDeAguaPotable red = new RedDeAguaPotable(a); 
        System.out.println(red.minimo(2000));
    }    
}
