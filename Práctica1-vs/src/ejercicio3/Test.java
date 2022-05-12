package ejercicio3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Estudiante [] arregloEst = new Estudiante[2]; 
		arregloEst[0] = new Estudiante();
		arregloEst[1] = new Estudiante();
		
		Profesor [] arregloProf = new Profesor [3]; 
		arregloProf[0] = new Profesor();
		arregloProf[1] = new Profesor();
		arregloProf[2] = new Profesor();
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("-Alumnos-");
		for (int i=0; i<2; i++) {
		System.out.print ("Nombre:"); arregloEst[i].setNombre (in.nextLine());
		System.out.print ("Apellido:"); arregloEst[i].setApellido (in.nextLine());
		System.out.print ("Comision:"); arregloEst[i].setComision(in.nextLine());
		System.out.print ("Email:"); arregloEst[i].setEmail (in.nextLine());
		System.out.print ("Direccion:"); arregloEst[i].setDireccion (in.nextLine());
		System.out.println("----------------------------");
		}
		System.out.println("-Profesores-");
		for (int i=0; i<3; i++) {
		System.out.print ("Nombre:"); arregloProf[i].setNombre (in.nextLine());
		System.out.print ("Apellido:"); arregloProf[i].setApellido (in.nextLine());
		System.out.print ("Email:"); arregloProf[i].setEmail (in.nextLine());
		System.out.print ("Catedra:"); arregloProf[i].setCatedra(in.nextLine());
		System.out.print ("Facultad:"); arregloProf[i].setFacultad (in.nextLine());
		System.out.println("----------------------------");
		}
		in.close();
		
		System.out.println("-Alumnos:");
		for (Estudiante e: arregloEst) {
			System.out.println("Datos:" + e.tusDatos()); 
			System.out.println("----------------------------");
		}
		System.out.println("-Profesores:");
		for (Profesor p : arregloProf) {
			System.out.println("Datos:" + p.tusDatos());  
			System.out.println("----------------------------");
		}
		
	}
}
