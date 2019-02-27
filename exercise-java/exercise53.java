//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 3:15 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise53{//inicio de la clase
 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a first Number: ");//Impresion de mensaje
	int A=in.nextInt();//lectura del numero

	System.out.println("input a second Number: ");//Impresion de mensaje
	int B=in.nextInt();//lectura del numero
 
	System.out.println("input a third Number: ");//Impresion de mensaje
	int C=in.nextInt();//lectura del numero

	if(C>B)//condicion para saber si el tercer numero es mayor que el segundo
	System.out.print("the result is: "+(true));//impresion del resultado

	else if (B>A && C>B)//condicion para saber si el 2do numero es mayor que el 1ero y el 3ro es mayor que el segundo
 	System.out.println("The result is: " +(true));// impresion del resultado

 }

}
	