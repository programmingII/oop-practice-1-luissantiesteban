//Nombre: Luis Santiesteban
//Dia: 27/02/2019
//Hora: 4:30 pm

 import java.util.Scanner;//importacion del scanner

 public class exercise57{//inicio de la clase

public static int operacion(int X) {//creacion de la clase
	int acum = 0;//declaracion e inicializacion del acumulador
        for(int i=1; i<=(int)Math.sqrt(X); i++) { // ciclo para repetir operaciones
         if(X%i==0 && i*i!=X) {//condicion para hacer operacion
            acum+=2;//operacion
        } else if (i*i==X) {//si no sucede la condicion anterior se hara la operacion siguiente
          acum++;//operacion
        }
        }
        return acum;//retorno del valor
}
 public static void main(String[] args){// inicio del main

	Scanner in=new Scanner(System.in);//creacion del scanner

	System.out.println("input Number: ");//Impresion de mensaje
	int A=in.nextInt();//lectura del numero

	System.out.println(operacion(A)); //impresion del resultado
 }

}