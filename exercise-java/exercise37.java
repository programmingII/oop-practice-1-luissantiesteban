//Nombre: Luis Santiesteban
//Dia: 25/02/2019
//Hora: 8:07 pm
 
 import java.util.Scanner; //Importacion del Scanner
 
 public class exercise37{ //Inicio de la clase
 public static void main(String[]args){ //Inicio del main
 
	Scanner in = new Scanner(System.in);//Creacion del scanner

	System.out.println("Input a string"); //Impresion en consola
	String Cadena= in.nextLine(); // lectura de caracteres
	
	StringBuilder builder=new StringBuilder(Cadena);//se carga la cadena en el stringbuilder
	String Cadena2=builder.reverse().toString();//se ejecuta el reverse al stringbuider y se pasa a la variable como un string

	System.out.println("Reverse string: " +Cadena2); //impresion del resultado
	}

}

	
