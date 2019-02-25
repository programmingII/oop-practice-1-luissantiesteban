//Nombre: Luis Santiesteban
//Dia: 25/02/2019
//Hora: 3:15 pm
 
 import java.util.Scanner; //Importacion del Scanner
 
 public class exercise35{ //Inicio de la clase
 public static void main(String[]args){ //Inicio del main

	Scanner in = new Scanner(System.in);//creacion del scanner

	System.out.println("Input the numbers of sides on the polygono ");//mensaje en pantalla
	int L = in.nextInt();//lectura de un dato int

	System.out.println("Input the length of one of the sides: ");// mensaje en pantalla
	double S= in.nextDouble(); //lectura de un dato double

	double Area = (L*(S*S))/(4.0*Math.tan((Math.PI/L))); //operacion para obtener el area del poligono (uso de la clase math)

	System.out.println("The area is: " +Area); //impresion del resultado
	}
}