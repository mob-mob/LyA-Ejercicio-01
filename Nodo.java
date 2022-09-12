package ejercicioLenguaje;
/* Autora: Nereida V. Roldan
 * Git hub: mob-mob
 * Guías:  https://www.youtube.com/watch?v=bUfl8iF_C7s
 * 			https://www.ciberaula.com/cursos/java/listas_java.php
 * Fecha: 07-09-2022
 * */
public class Nodo 
{
	private String elemento;
	private Nodo siguiente;
	
	public Nodo(String elemento, Nodo siguiente) {
		super();
		this.elemento = elemento;
		this.siguiente = siguiente;
	}
	public Nodo(String e) 
	{
		elemento = e;
		siguiente = null;
	}

	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

}
