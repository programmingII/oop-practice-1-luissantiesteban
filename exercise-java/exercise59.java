//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 5:13 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise59{//inicio de la clase
 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a sentences: ");//impresion de mensaje
	String text= in.nextLine();//lectura del dato

	text = text.toLowerCase();//se hace una igualacion de la variable pero utilizamos .tolowerCase para coonvertir todo a minusculas

	System.out.println(text); //impresion del resultado en minusculas
	}			
}

