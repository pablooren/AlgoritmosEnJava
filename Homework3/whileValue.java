/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int valorActual = 0;
		int valor;
		valor = Integer.parseInt(args[0].toString());
	if(valor>valorActual){
		System.out.println("el valor actual es: "+valorActual);
		for(int c=1;c<valor;c++){
			System.out.println("el valor actual es: "+c);	
	}}else{
		System.out.println("numero menor que 0");
	}	
				      
   }

}