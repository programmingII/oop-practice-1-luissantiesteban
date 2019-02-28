//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 11:51 pm

 public class exercise67{//inicio de la clase
 public static void main(String[] args){// inicio del main

	StringBuffer palabra = new StringBuffer("Python 3.0");//creo un objeto de tipo stringbuffer 
	palabra.insert(6, " Tutorial ");// utilizo el metodo insert para poder insertar esa palabra y le doy la posicion que quiero que ocupe

	System.out.println(palabra.toString());//impresion de la palabra final
	}
}
