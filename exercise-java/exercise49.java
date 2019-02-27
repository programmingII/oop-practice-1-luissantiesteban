//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 2:00 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise49{//inicio de la clase
 public static void main(String[] args){// inicio del main

	Scanner in = new Scanner(System.in);//creacion del objeto 

	System.out.println("Input a number: ");//impresion de mensaje
	int Num=in.nextInt();//lectura del numero

	if(Num%2==0){//condicion para saber si su numero es par
	System.out.println("your number is even: 1");//impresion
	}

	if(Num%2!=0){//condicion para saber si su numero es impar
	System.out.println("Your number is odd: 0");//impresion
	}
 }

}
