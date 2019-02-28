//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 5:50 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise62{//inicio de la clase
 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a first Number: ");//Impresion de mensaje
	int A=in.nextInt();//lectura del numero

	System.out.println("input a second Number: ");//Impresion de mensaje
	int B=in.nextInt();//lectura del numero
 
	System.out.println("input a third Number: ");//Impresion de mensaje
	int C=in.nextInt();//lectura del numero

	System.out.println((Math.abs(A - B) >= 20 || Math.abs(B - C) >= 20 || Math.abs(C - A) >= 20)); //math.abs nos ayuda a obtener valores absolutos.Si alguna de las operaciones se cumple es true y si no es false

	}

 }
