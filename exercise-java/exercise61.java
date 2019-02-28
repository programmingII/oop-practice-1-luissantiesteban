//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 5:38 pm
 
 import java.util.Scanner; //Importacion del Scanner
 
 public class exercise61{ //Inicio de la clase
 public static void main(String[]args){ //Inicio del main
 
	Scanner in = new Scanner(System.in);//Creacion del scanner

	System.out.println("Input a word"); //Impresion en consola
	String palabra= in.nextLine(); // lectura de caracteres
	
	StringBuilder builder=new StringBuilder(palabra);//se carga la palabra en el stringbuilder
	String palabrar=builder.reverse().toString();//se ejecuta el reverse  y se pasa a la variable como un string

	System.out.println("Reverse string: " +palabrar); //impresion del resultado
	}

}
