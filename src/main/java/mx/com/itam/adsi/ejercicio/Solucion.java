package mx.com.itam.adsi.ejercicio; 
 
	import org.apache.log4j.Logger; 
	 
	

	/**
	  *Clase Solucion
	  *
	  *Determina si la cadena es la repetición de subcadenas
	  *@author Mónica E. Alba Glez. 160502
	*/ 
	public class Solucion{ 

	  
		Solucion(){
		}
			

	  public static void main(String...argv) { 
	    System.out.println(gus("holaholahola"));

	  } 
	  
	  /**
	    *Verifica si la cadena entregada es se puede describir como repeticiones de subcadenas
	    *@param s cadena
	    *
	  */ 
	  public static boolean gus(String str){
	    
	      String s = str + str;
		
		return s.substring(1,s.length() - 1).contains(str);	
			

	  } 
/*
los resultados de las pruebas unitarias fueron exitosas excepto la quinta, que dice que el índice del string se salió del rango, regresando un -2.
El método le quita la primera y la última letra a la cadena (multiplicada por dos) y verifica que se contenga la cadena principal.

*/

		
	}
