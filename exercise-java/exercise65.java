//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 8:49 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise65{//inicio de la clase

 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a first Number: ");//Impresion de mensaje
	int A=in.nextInt();//lectura del numero

	System.out.println("input a second Number: ");//Impresion de mensaje
	int B=in.nextInt();//lectura del numero

	int division=A/B;//operacion
	int resultado= A-(division * B);//el resultado anterior lo multiplicas por la variable b y se le resta A para obtener el resultado

	System.out.println(resultado);//impresion de resultado final

	}

}