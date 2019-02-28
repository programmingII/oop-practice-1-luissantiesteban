//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 4:48 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise58{//inicio de la clase
 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input a sentences: ");//impresion de mensaje
	String text= in.nextLine();//lectura del dato

	String Mayuscula = ""; // declaracion de variable string
       
	Scanner line = new Scanner(text); // se crea un objeto scanner
        
	while(line.hasNext()){// repeticion de lectura
             String let = line.next(); // delaracion de variable string para contener lo del scanner
             Mayuscula += Character.toUpperCase(let.charAt(0)) + let.substring(1) + " ";//utilizacion del metodo .toUpperCase para convertir las mayusculas que necesitemos
        }
      	System.out.println(Mayuscula.trim()); // impresion de la cadena
    }
}