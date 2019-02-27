//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 2:49 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise56{//inicio de la clase

	public static int solucion(int A, int B, int C) {//creacion de la funcion	
	if (A%C == 0)//condicion para realizar opereciones
	return( B/C - A/C + 1);//operecion que retorna un valor
	return(B/C - A/C);//operacion que retorna un valor
	}	

 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a first Number: ");//Impresion de mensaje
	int A=in.nextInt();//lectura del numero

	System.out.println("input a second Number: ");//Impresion de mensaje
	int B=in.nextInt();//lectura del numero
 
	System.out.println("input a third Number: ");//Impresion de mensaje
	int C=in.nextInt();//lectura del numero

	System.out.println(solucion(A,B,C));//impresion del resultado

 }

}

	