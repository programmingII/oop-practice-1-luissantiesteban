//Nombre: Luis Santiesteban
//Dia: 28/02/2019
//Hora: 1:42 

 import java.util.Scanner;//importacion de scanner
 import java.lang.*;//importacion libreria lang

 public class exercise70{//inicio de la clase
 public static void main(String[] args){// inicio del main

 	Scanner in=new Scanner(System.in);//creacion del objeto

	System.out.println("Input String: ");//impresion
	String P1 = in.nextLine(); //lectura de dato

	System.out.println("Input String: "); //impresion
	String P2 = in.nextLine(); //lectura del segundo dato
	
	if(P1.length() >= P2.length())//condicion para comparar cadenas
		System.out.println(P2+P1+P2);//si la condicion se cumple se imprime lo siguiente
	else
	System.out.println(P1+P2+P1);// si no se cumple se imprime lo siguiente

}

}