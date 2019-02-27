//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 3:35 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise54{//inicio de la clase

	public static boolean Condicion(int N1, int N2, int N3, boolean ABC)//Funcion para trabajar con las condiciones de los numeros
     	{
	return (N1 % 10 == N2 % 10) || (N1 % 10 == N3 % 10) || (N2 % 10 == N3 % 10);//condiciones para obtener el resultado y se hace un return
     	}

 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a first Number: ");//Impresion de mensaje
	int A=in.nextInt();//lectura del numero

	System.out.println("input a second Number: ");//Impresion de mensaje
	int B=in.nextInt();//lectura del numero
 
	System.out.println("input a third Number: ");//Impresion de mensaje
	int C=in.nextInt();//lectura del numero

	System.out.println("The result is: "+Condicion(A,B,C,true));//impresion del resultado

 }

}