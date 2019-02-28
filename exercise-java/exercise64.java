//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 8:30 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise64{//inicio de la clase
 public static boolean Operacion(int X, int Y)//creacion de la clase
     {  
	   if (X<25 || Y>75) //condicion que se dee cumplir
		   return false;//si se cumple la condicion retorna un valor
	   int A = X % 10; //se realiza la operacion y el resultado a partir del modulo se mete en una variable
	   int B = Y % 10; //se realiza la operacion y el resultado a partir del modulo se mete en una variable
	   X /= 10;
	   Y /= 10;
	   return (X == Y || X == B || A == Y || A == B);//retorno de un valor
     }
	

 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a first Number: ");//Impresion de mensaje
	int A=in.nextInt();//lectura del numero

	System.out.println("input a second Number: ");//Impresion de mensaje
	int B=in.nextInt();//lectura del numero	
	
	System.out.println("Result: "+Operacion(A, B));//impresion del resultado haciendo uso de la funcion

	}

}