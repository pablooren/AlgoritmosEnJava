/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   
		
   public static void main(String[] args) {
		int a,b;
		a = Integer.parseInt(args[0].toString());
		b = Integer.parseInt(args[1].toString());

		System.out.println("limites: "+args[0]+" "+args[1]);
	if(a<b){	
		for(int c= a+1;c < b;c++){
			System.out.println("numero actual es: " +c);		
			

}}
	if(a>b){
		for(int d= a-1;d >b ;d--){	
			System.out.println("numero actual es: " +d);
}}
}
}
					
				

      
        
     

