//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 2:34 pm
 
 import java.util.Scanner;//Importacion del scanner

 public class exercise51{//inicio de la clase
 public static void main(String[] args){// inicio del main

	Scanner in= new Scanner(System.in);//creacion del Scanner

	System.out.println("Input a number (String): ");//impresion de mensaje
	String Snum=in.nextLine();//lectura del string

	int Num= Integer.parseInt(Snum);//Parse de la variable Snum a int

	System.out.println("The integer values is: "+Num);//impresion del resultado
 }

}


