//Nombre: Luis Santiesteban
//Dia: 25/02/2019
//Hora: 1:29 am

import java.nio.charset.Charset; //importacion del charset

public class exercise40 {//inicio del class
  public static void main(String[] args) {//inicio del main

	System.out.println("List of available character sets: "); //impresion del mensaje en consola

    for (String string : Charset.availableCharsets().keySet()) {//ciclo para imprimir todos los encodings disponibles
      System.out.println(string);//impresion de cada uno de los encodings
    }
  }
}