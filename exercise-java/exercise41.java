//Nombre: Luis Santiesteban
//Dia: 26/02/2019
//Hora: 12:30

 import java.util.Scanner;//importacion del scanner

 public class exercise41{//inicio de la clase
 public static void main(String[]args){//inicio del main

	Scanner in = new Scanner(System.in);// creacion del scanner
	System.out.println("Input Character");//impresion del mensaje en consola
	char C= in.next().charAt(0);//lectura del char
	
	System.out.println("The ASCII value of " +C+ " is : "+(int) C);//casteo del caracter e impresion del resultado
	}

}
	

	

 
