//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 5:24 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise60{//inicio de la clase
 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a string: ");//impresion de mensaje
	String text= in.nextLine();//lectura del dato

	 String[] palabra = text.split("[ ]+"); //declaramos un array, le damos la variable anterior y separamos palabras
	 System.out.println("Penultimate word: "+palabra[palabra.length - 2]);//con .length-2 indicamos que tome la penultima palabra y que la imprima
	 }	
		
}