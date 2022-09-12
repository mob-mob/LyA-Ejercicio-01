package ejercicioLenguaje;
import java.util.*;
/* Autora: Nereida V. Roldan
 * Git hub: mob-mob
 * Guías:  https://www.youtube.com/watch?v=bUfl8iF_C7s
 * 			https://www.ciberaula.com/cursos/java/listas_java.php
 * Fecha: 07-09-2022
 * */
public class Lista {
	
	Scanner leer = new Scanner(System.in);
	private Nodo inicio;
	private Nodo fin;
	
	public Lista() 
	{
		inicio = null;
		fin = null;
	}
	
	public boolean estaVacia() { return inicio==null; }
	
	public void agregandoAlInicio(String d) 
	{
		if(estaVacia()) 
		{
			inicio = new Nodo(d, inicio);
			fin = inicio;
		}
		else 
		{
			inicio = new Nodo(d, inicio);
		}
	}
	
	public void agregandoAlFinal(String d) 
	{
		if(d.equals("ERROR")) 
		{ 
			System.out.println("ERROR: PALABRA NO VALIDA");
		} else 
		{
			if(estaVacia()) 
			{
				inicio = new Nodo(d);
				fin = inicio;
			}
			else 
			{
				fin.setSiguiente(new Nodo(d)); 
				fin = fin.getSiguiente();
			}
			//System.out.println("Agragada con exito: "+d);
		}
	}
	
	public void mostrarListaYLongitud() 
	{
		Nodo auxiliar = inicio;
		if(estaVacia()) 
		{
			System.out.println("Esta vacia :(");
		}
		while(auxiliar!=null) 
		{
			System.out.println("["+auxiliar.getElemento()+"]"+ " - ["+auxiliar.getElemento().length()+"]");
			auxiliar = auxiliar.getSiguiente();
		} 
	}
	
	public void mostrarLista() 
	{
		Nodo auxiliar = inicio;
		if(estaVacia()) 
		{
			System.out.println("Esta vacia :(");
		}
		while(auxiliar!=null) 
		{
			System.out.println("["+auxiliar.getElemento()+"]");
			auxiliar = auxiliar.getSiguiente();
		} 
	}
	
	public String buscarLista(String d) 
	{
		Boolean encontrado = false;
		Nodo auxiliar = inicio;
		while(encontrado==false && auxiliar!=fin) 
		{
			if(d.equals(auxiliar.getElemento())) 
			{
				encontrado = true;
				break;
			}
			auxiliar = auxiliar.getSiguiente();
		}
		//System.out.println("Encontrado: "+auxiliar.getElemento());
		if(encontrado == false) 
		{
			//System.out.println("NO ENCONTRADO");
			return "ERROR";
		} 
		else 
		{
			return auxiliar.getElemento();
		}
	}
	
	public int cantLista() 
	{
		int contador = 0;
		Nodo auxiliar = inicio;
		while(auxiliar!=fin) 
		{
			contador ++;
			auxiliar = auxiliar.getSiguiente();
		}
		return contador;
	}
	
	public String buscarNodo(int n) 
	{
		int contador = 0;
        Nodo auxiliar = inicio;
        while (contador < n) {
            auxiliar = auxiliar.getSiguiente();
            contador++;
        }
        return auxiliar.getElemento(); 
	}
	
	public Lista unir(Lista u, Lista a, Lista b) 
	{	
		System.out.println("UNIR");
		
		for(int i=0; i<a.cantLista(); i++) 
		{
			u.agregandoAlFinal(a.buscarNodo(i));
		}
		
		for(int i=0; i<b.cantLista(); i++) 
		{
			u.agregandoAlFinal(b.buscarNodo(i));
		}
		return u;
	}
	
	public Lista concatenar(Lista c, Lista a, Lista b) 
	{
		System.out.println("CONCATENAR"); 
		
		for(int i=0; i<a.cantLista(); i++) 
		{
			for(int j=0; j<b.cantLista(); j++) 
			{
				c.agregandoAlFinal(a.buscarNodo(i)+b.buscarNodo(j));
			}
		}
		
		for(int i=0; i<a.cantLista(); i++) 
		{
			for(int j=0; j<b.cantLista(); j++) 
			{
				c.agregandoAlFinal(b.buscarNodo(i)+a.buscarNodo(j));
			}
		}	
		return c;
	}
	
	public String potencia(int n, String e) 
	{
		if(n > 1) { return potencia(n-1, (e+e)); }
		return e; 
	}
	
	public Lista potenciar(Lista p, Lista l, int n) 
	{
		System.out.println("POTENCIAR");
		String palabra = "";
		for(int i=0; i<=l.cantLista(); i++)
		{
			p.agregandoAlFinal(potencia(n,l.buscarNodo(i)));
		}
		return p;
	}
	
	public Lista reflexionar(Lista r, Lista op) 
	{
		for(int i=0; i<=op.cantLista(); i++) 
		{
			String reflexionar = "";
			reflexionar = op.buscarNodo(i);
			StringBuilder st = new StringBuilder(reflexionar);
			reflexionar = st.reverse().toString();
			r.agregandoAlFinal(reflexionar);
		}
		return r;
	}
	
}
