//Nombre: Luis Santiesteban
//Dia: 25/02/2019
//Hora: 3:00 pm
 
 import java.util.Scanner; //Importacion del Scanner
 
 public class exercise34{ //Inicio de la clase
 public static void main(String[]args){ //Inicio del main

 Scanner in = new Scanner(System.in); // creacion del scanner

	System.out.println("Input the length of a side of the hexagon: ");
	double S= in.nextDouble();//lectura de un double

	double Area=(6*(S*S))/(4*Math.tan(Math.PI/6));//Operacion matematica para encontrar el area del hexagono(uso de la clase math) 

	System.out.println("The area of the exagon is: " +Area); //impresion del area del hexagono
	}

}
	
