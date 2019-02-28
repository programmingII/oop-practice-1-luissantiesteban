//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 8:14 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise63{//inicio de la clase
 public static int Operacion(int X, int Y)
     {  //creacion de una funcion
	if(X == Y)//condicion
		return 0; // retorna valor
	    if(X % 6 == Y%6 ) //segunda condicion
		    return (X < Y) ? X : Y; //retorna  valor
	    return (X > Y) ? X : Y; //retorno de valor
     }
	

 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a first Number: ");//Impresion de mensaje
	int A=in.nextInt();//lectura del numero

	System.out.println("input a second Number: ");//Impresion de mensaje
	int B=in.nextInt();//lectura del numero

	System.out.print("Result: "+Operacion(A,B));//impresion llamando a la funcion operacion
	}

}
 
