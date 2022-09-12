package ejercicioLenguaje;

import java.util.Scanner;

public class Menu {
	
	static Scanner leer = new Scanner(System.in);
	int op = 0;
	
	String[] menu = {"OPCIONES: ", 
			"1.- Ver lenguaje", 
			"2.- Crear palabra", 
			"3.- Crear lenguaje",
			"4.- Salir"};
	
	String[] menu02 = {"SELECCIONE LENGUAJE: ", 
			"1.- Lenguaje A",
			"2.- Lenguaje B",};
	
	String[] menu03 = {"SELECCIONE UNA OPCION: ", 
			"1.- Manual", 
			"2.- En base a ya existente"};
	
	String[] menu04 = {"SELECCIONE OPCIÓN", 
			"1.- Concatenación",
			"2.- Potenciación", 
			"3.- Reflexión"};
	
	String[] menu05 = {"SELECCIONE OPCIÓN", 
			"1.- Union",
			"2.- Concatenación",
			"3.- Potenciación", 
			"4.- Reflexión"};
	
	Lista la = new Lista();
	Lenguaje aa = new Lenguaje();
	Lista lb = new Lista();
	Lenguaje ab = new Lenguaje();
	Lista lc = new Lista();
	Lenguaje ac = new Lenguaje();
	
	public void inicializarLenguaje() 
	{
		la.agregandoAlFinal("aa");
		la.agregandoAlFinal("ae");
		la.agregandoAlFinal("ai");
		la.agregandoAlFinal("ao");
		la.agregandoAlFinal("au");
		
		lb.agregandoAlFinal("11");
		lb.agregandoAlFinal("12");
		lb.agregandoAlFinal("13");
		lb.agregandoAlFinal("14");
		lb.agregandoAlFinal("15");
	}
	
	public void presentarmenu() 
	{
		do {
			for (int i=0; i<menu.length ; i++) { System.out.println(menu[i]); }
			op = leer.nextInt();
			switch (op) //LEER, CREAR PALABRA, LEER LENGUAJE
			{
				case 1: //VER LENGUAJE
					switch (presentarmenu02()) //LENGUAJE A, LENGUAJE B
					{
						case 1: la.mostrarListaYLongitud(); presentarmenu(); break;
						case 2: lb.mostrarListaYLongitud(); presentarmenu(); break;
						default: System.out.println("Opcion invalida, seleccione otra"); op= leer.nextInt(); break;
					};
				break;
				case 2: //CREAR PALABRA
					switch (presentarmenu02()) //LENGUAJE A, LENGUAJE B
					{
	     				case 1: //LENGUAJE A
	     				switch (presentarmenu03()) //MANUAL, YA EXISTENTE
	     				{
	     					case 1: la.agregandoAlFinal(aa.recibirA()); break;
	     					case 2: 
	     							switch (presentarmenu04()) //CONCATENAR, POTENCIAR, REFLEXIONAR
	     							{
	     								case 1: la.agregandoAlFinal(aa.concatenar(la)); la.mostrarLista(); break;
	     								case 2: la.agregandoAlFinal(aa.potenciar(la)); la.mostrarLista(); break;
	     								case 3: la.agregandoAlFinal(aa.reflexionar(la)); la.mostrarLista(); break;
	     							}
	     					break;
	     				}; 
	     				break;
	     				case 2: //LENGUAJE B
	         				switch (presentarmenu03()) //MANUAL, YA EXISTENTE
	         				{
	         					case 1: lb.agregandoAlFinal(ab.recibirA()); break;
	         					case 2: 
	         							switch (presentarmenu04()) //CONCATENAR, POTENCIAR, REFLEXIONAR
	         							{
	         								case 1: lb.agregandoAlFinal(ab.concatenar(lb)); lb.mostrarLista(); break;
	         								case 2: lb.agregandoAlFinal(ab.potenciar(lb)); lb.mostrarLista(); break;
	         								case 3: lb.agregandoAlFinal(ab.reflexionar(lb)); lb.mostrarLista(); break;
	         							}
	         					break;
	         				};
	     				break;
	     				default: System.out.println("Opcion invalida, seleccione otra"); op= leer.nextInt(); break;
					};				
				break;
				case 3: //CREAR LENGUAJE
					switch(presentarmenu05()) //UNION, CONCATENAR, POTENCIAR, REFLEXIONAR
					{
						case 1: lc.unir(lc, la, lb); lc.mostrarLista(); break;
						case 2: lc.concatenar(lc, la, lb); lc.mostrarLista(); break;
						case 3: 
							if(presentarmenu02()==1) //LENGUAJE A, LENGUAJE B
							{
								lc.potenciar(lc, la, capturarpotencia());
							} 
							else if (presentarmenu02()==2) 
							{
								lc.potenciar(lc, lb, capturarpotencia());
							} 
							else 
							{
								System.out.println("ERROR");
							}
							lc.mostrarLista();
						break;
						case 4:
							if(presentarmenu02()==1) 
							{
								lc.reflexionar(lc, la);
							} 
							else if(presentarmenu02()==2) 
							{
								lc.reflexionar(lc, lb);
							}
							lc.mostrarLista();
						break;
						case 5: presentarmenu(); break;
						default: System.out.println("Opcion invalida, seleccione otra"); op= leer.nextInt(); break;
					};
				break;
				case 4: //SALIR
				break;
				default: 
					System.out.println("Opcion no valida, seleccione otra");
					op= leer.nextInt();
				break;
			};
		}while(op!=4);
	}	
	
	public int capturarpotencia() 
	{
		System.out.println("Seleccione el numero a potenciar");
		return leer.nextInt();
	}
	
	public int presentarmenu02() 
	{
		for (int i=0; i<menu02.length ; i++) { System.out.println(menu02[i]); }
		return leer.nextInt();
	}
	
	public int presentarmenu03() 
	{
		for (int i=0; i<menu03.length ; i++) { System.out.println(menu03[i]); }
		return leer.nextInt();
	}
	
	public int presentarmenu04() 
	{
		for (int i=0; i<menu04.length ; i++) { System.out.println(menu04[i]); }
		return leer.nextInt();
	}
	
	public int presentarmenu05() 
	{
		for (int i=0; i<menu05.length ; i++) { System.out.println(menu05[i]); }
		return leer.nextInt();
	}

}
