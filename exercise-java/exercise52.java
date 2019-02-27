//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 2:49 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise52{//inicio de la clase
 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a first Number: ");//Impresion de mensaje
	int A=in.nextInt();//lectura del numero

	System.out.println("input a second Number: ");//Impresion de mensaje
	int B=in.nextInt();//lectura del numero
 
	System.out.println("input a third Number: ");//Impresion de mensaje
	int C=in.nextInt();//lectura del numero
	
	int r1=A+B;
	int r2=B+C;
	int r3=C+A;


	if(r2==A){//si la suma de alguno de los numeros es igual al 3 numero se imprime el siguiente mensaje
	System.out.println("The result is: true");}//impresion del mensaje

        if(r1==C ){//si la suma de alguno de los numeros es igual al 3 numero se imprime el siguiente mensaje
	System.out.println("The result is: true");}//impresion del mensaje

	if(r3==B){//si la suma de alguno de los numeros es igual al 3 numero se imprime el siguiente mensaje
	System.out.println("The result is: true");}//impresion del mensaje
 }

}