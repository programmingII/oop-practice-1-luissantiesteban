//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 1:14 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise69{//inicio de la clase

 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner
	System.out.println("input string: ");//impresion de mensaje
	String palabra=in.nextLine(); //lectura del string

    	System.out.println(palabra.substring(0, palabra.length()/2));// substring toma la mitad de la cadena que se aloja en la variable y la imprime
}

}
	