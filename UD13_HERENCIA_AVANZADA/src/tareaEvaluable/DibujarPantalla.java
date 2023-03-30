package tareaEvaluable;

import java.util.Scanner;

public class DibujarPantalla {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		//Creo un objeto pantalla
		Pantalla pantalla= new Pantalla();
		//Inicializo un String que me guarde la opcion que elige el usuario
		String opc="";
		while(!opc.equalsIgnoreCase("f")) {
			//Llamo al procedimiento menuCodiciona
			menuCondicional();
			opc=sc.next();
			//Llamo al procedimiento condicional y le paso como argumentos el
			//objeto pantalla y el String con la opcion elegida
			condicional(pantalla, opc);
		}
	}
	
	//Procedimiento que me muestra las distintas opciones.
	public static void menuCondicional() {
		System.out.println("Seleccione una opción: [a-f]"); 
		System.out.println("a- Añadir una figura");
		System.out.println("b - Modificar figuras");
		System.out.println("c - Mostrar la pantalla");
		System.out.println("d - Área de la pantalla");
		System.out.println("e - Listar Figuras");
		System.out.println("f - Salir");
	}
	
	//Procedimiento que me sirve para realizar las acciones del menu condicional
	public static void condicional(Pantalla pantalla, String caracter) {
		//Switch para elegir la opcion 
		switch(caracter.toLowerCase()) {
		case "a":{
			//Llamo al procedimiento menuFigura
			menuFigura();
			String opc=sc.next();
			//Hago un while que se repita hasta elegir r o t
			while(!opc.equals("r") && !opc.equals("t")) {
				menuFigura();
				opc=sc.next();
			}
			//Llamo al procedimiento condicionalFIgura
			condicionalFigura(pantalla, opc);
			break;
		}
		case "b":{
			//Pido al usuario que introduzca el caracter con el que quiere mostrar las figuras
			System.out.println("Introduzca el nuevo caracter");
			char letra=sc.next().charAt(0);
			//Modifico el caracter
			pantalla.modificarFigura(letra);
			break;
		}
		case "c":{
			//Muestro las figuras en pantalla
			pantalla.muestraPantalla();
			break;
		}
		case "d":{
			//Muestro el area en pantalla
			System.out.println(pantalla.areaPantalla()+" m2");
			break;
		}
		case "e":{
			//Muestro la lista de figuras en pantalla
			pantalla.listaFigura();
			break;
		}
		case "f":break;
		default: System.out.println("Opcion no valida");//Si no me introduce una opcion correcta
		}
	}
	
	//Procedimiento que me muestra el menu de las figuras
	public static void menuFigura() {
		System.out.println("*****FIGURA*****");
		System.out.println("Rectangulo (r)");
		System.out.println("Triangulo (t)");
	}
	
	//Procedimiento que me sirve para realizar las acciones del menuFigura
	public static void condicionalFigura(Pantalla pantalla, String caracter) {
		switch(caracter) {
		case "r":{
			//Creo un rectngulo
			System.out.println("Introduzca la base");
			int base=sc.nextInt();
			System.out.println("introduzca la altura");
			int altura=sc.nextInt();
			System.out.println("Indica el caracter");
			char letra=sc.next().charAt(0);
			pantalla.anadeFigura(new Rectangulo(base, altura, letra));
			break;	
		}
		case "t":{
			//Creo unn triangulo
			System.out.println("Introduzca el lado");
			int lado=sc.nextInt();
			String tipo="";
			//Pido el tipo hasta que me introduzca un tipo valido
			while(!tipo.equals("a")&&!tipo.equals("b")&&!tipo.equals("c")&&!tipo.equals("d")) {
				System.out.println("introduzca el tipo a,b,c,d");
				tipo=sc.next();
			}
			System.out.println("Indica el caracter");
			char letra=sc.next().charAt(0);
			pantalla.anadeFigura(new Triangulo(lado, tipo, letra));
			break;	
		}
		default:System.out.println("opcion no valida");//Si no me introduce una opcion correcta
		}
	}
}
