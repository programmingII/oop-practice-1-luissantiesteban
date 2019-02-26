//Nombre: Luis Santiesteban
//Dia: 25/02/2019
//Hora: 12:20 pm
 
 import java.util.Scanner; //Importacion del Scanner
 
 public class exercise38{ //Inicio de la clase
 public static void main(String[]args){ //Inicio del main
 
	Scanner in = new Scanner(System.in);//Creacion del scanner

	System.out.println("input the string: ");//impresion en pantalla
	String Text=in.nextLine();//Lectura del string

	char[]Cadena=Text.toCharArray(); //creacion de una arreglo de tipo char para almacenar el string
	        int letras = 0; //declaracion e inicializacion de la variable
		int espacios = 0;//declaracion e inicializacion de la variable
		int numeros = 0;//declaracion e inicializacion de la variable
		int otros = 0;//declaracion e inicializacion de la variable

		for(int i = 0; i < Text.length(); i++){ //se cra un for para hacer un bucle
			if(Character.isLetter(Cadena[i])){ //lectura de letras en la cadena de texto
				letras ++ ; // incremento en la variable cada que encuentre una letra
			}
			else if(Character.isDigit(Cadena[i])){ //lectura de digitos en la cadena de texto
				numeros ++ ; // incremento en la variable cada que encuentre un numero
			}
			else if(Character.isSpaceChar(Cadena[i])){ //lectura de espacios en la cadena de texto
				espacios ++ ; //incremento en la variable cada que encuentre un espacio
			}
			else{ //lectura de cualquier otro caracter en la cadena de texto
				otros ++; // incremento en la variable cada que se encuentre un caracter distinto
			} 
		} // el ciclo se repite una y otra vez hasta que ya no exista ninguna caracter o espacio por leer

	System.out.println("The string is: "+Text);// impresion del texto original
	System.out.println("letter: " + letras); //impresion del total de letras
	System.out.println("space: " + espacios); //impresion del total de espacios
	System.out.println("num: " + numeros); // impresion del total de numeros
	System.out.println("other: " + otros); //impresion del total de otros caracteres
	}

}
	
