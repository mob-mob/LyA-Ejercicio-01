package ejercicioLenguaje;
/* Autora: Nereida V. Roldan
 * Git hub: mob-mob
 * Guías:  https://www.youtube.com/watch?v=bUfl8iF_C7s
 * Fecha: 08-09-2022
 * */
import java.util.Scanner;

public class Lenguaje {
	
	static Scanner leer = new Scanner(System.in);
	int opcion = 0;
	boolean valida = true;
	
	char[] alfabetoA = {'a','e','i','o','u'};
	char[] alfabetoB = {'1','2','3','4','5'};
	
	public String lamba(String palabra) {
		//System.out.println("Metodo lamba: "+palabra);
		for(int i=0; i<palabra.length(); i++) 
		{	
	    	if(palabra.charAt(i) == '*') {
	    		//System.out.println("lamba: "+palabra.charAt(i)+" - "+'*');
	    		palabra = palabra.replace("*", "");
	    		break;
	    		}else{
	    		}
		}
		//System.out.println("Resultado: "+ palabra);
		return palabra;
	}
	
	public String recibirA() 
	{
		System.out.println("Dime una palabra");
		String palabra = leer.nextLine();
		//System.out.println("La palabra tiene un tamaño de: " +palabra.length());
		
	    String letrasInvalidas = "";
	    String letrasValidas = "";
	    String palabraV = "";
	    palabra = lamba(palabra);
	    
	    for(int i=0; i<palabra.length(); i++) {
	    	
	    	char caracter = palabra.charAt(i);
	    	String c = String.valueOf(caracter);

	        for(int j=0; j<alfabetoA.length; j++) {

	            if(palabra.charAt(i) == alfabetoA[j]) {
	                letrasValidas = letrasValidas + c;
	            	//System.out.println("coicide: "+palabra.charAt(i)+" - "+alfabetoA[j]);
	            	valida = true;
	            	break;
	            }else{
	            	//System.out.println("no coicide: "+palabra.charAt(i)+" - "+alfabetoA[j]);
	            	if(j==4) { letrasInvalidas = letrasInvalidas + c; }
		        	valida = false;
	            }
	        }

	    }
	    if(letrasInvalidas == "") 
	    {
		    palabraV = letrasValidas;
		    
			//System.out.println("La palabra es valida: "+ palabraV);
			return palabraV;
	    } 
	    else 
	    {
			//System.out.println("La palabra NO es valida: "+ letrasInvalidas);
			return "ERROR";
	    }
	}
	
	public String recibirB() 
	{
		System.out.println("Dime una palabra");
		String palabra = leer.nextLine();
		//System.out.println("La palabra tiene un tamaño de: " +palabra.length());
		
	    String letrasInvalidas = "";
	    String letrasValidas = "";
	    String palabraV = "";
	    
	    for(int i=0; i<palabra.length(); i++) {
	    	
	    	char caracter = palabra.charAt(i);
	    	String c = String.valueOf(caracter);

	        for(int j=0; j<alfabetoB.length; j++) {

	            if(palabra.charAt(i) == alfabetoB[j]) {
	                letrasValidas = letrasValidas + c;
	            	//System.out.println("coicide: "+palabra.charAt(i)+" - "+alfabetoB[j]);
	            	valida = true;
	            	break;
	            }else{
	            	//System.out.println("no coicide: "+palabra.charAt(i)+" - "+alfabetoB[j]);
	            	if(j==4) { letrasInvalidas = letrasInvalidas + c; }
		        	valida = false;
	            }
	        }

	    }
	    if(letrasInvalidas == "") 
	    {
		    palabraV = letrasValidas;
		    
			//System.out.println("La palabra es valida: "+ palabraV);
			return palabraV;
	    } 
	    else 
	    {
			//System.out.println("La palabra NO es valida: "+ letrasInvalidas);
			return "ERROR";
	    }
	}

	
	public String concatenar(Lista l) 
	{
		System.out.println("CONCATENAR");
		System.out.println("Opciones de palabras: ");
		l.mostrarLista();
		
		String op1 = leer.nextLine();
		if(l.buscarLista(op1).equals("ERROR")) { return "ERROR"; } 
		
		System.out.println("Selecciona la segunda opcion: ");
		
		String op2 = leer.nextLine();
		if(l.buscarLista(op2).equals("ERROR")) { return "ERROR"; }
		
		//l.buscarLista(op1);
		//l.buscarLista(op2);
		String concatenar = l.buscarLista(op1)+l.buscarLista(op2);
		
		return concatenar;
	}
	
	public String potenciar(Lista l) 
	{
		System.out.println("POTENCIAR");
		System.out.println("Opciones de palabras: ");
		l.mostrarLista();
		
		String op = leer.nextLine();
		if(l.buscarLista(op).equals("ERROR")) { return "ERROR"; }
		
		System.out.println("Selecciona numero a potenciar: ");
		int n = leer.nextInt();
		
		String potenciar = "";
		potenciar = potencia(n,op);
		
		return potenciar;
	}
	
	public String potencia(int n, String e) 
	{
		if(n > 1) { return potencia(n-1, (e+e)); }
		return e; 
	}
	
	public String reflexionar(Lista l) 
	{
		System.out.println("REFLEXIONAR");
		System.out.println("Opciones de palabras: ");
		l.mostrarLista();
		
		String op = leer.nextLine();
		if(l.buscarLista(op).equals("ERROR")) { return "ERROR"; }
		
		String reflexionar = "";
		reflexionar = l.buscarLista(op);
		
		StringBuilder st = new StringBuilder(reflexionar);
		reflexionar = st.reverse().toString();
		
		return reflexionar;
	}
	
}
