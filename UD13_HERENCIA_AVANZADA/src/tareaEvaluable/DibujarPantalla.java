package tareaEvaluable;

import java.util.Scanner;

public class DibujarPantalla {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		Pantalla pantalla= new Pantalla();
		String opc="";
		while(!opc.equalsIgnoreCase("f")) {
			menuCondicional();
			opc=sc.next();
			condicional(pantalla, opc);
		}
	}
	public static void menuCondicional() {
		System.out.println("Seleccione una opción: [a-f]"); 
		System.out.println("a- Añadir una figura");
		System.out.println("b - Modificar figuras");
		System.out.println("c - Mostrar la pantalla");
		System.out.println("d - Área de la pantalla");
		System.out.println("e - Listar Figuras");
		System.out.println("f - Salir");
	}
	public static void condicional(Pantalla pantalla, String caracter) {
		switch(caracter.toLowerCase()) {
		case "a":{
			menuFigura();
			String opc=sc.next();
			while(!opc.equals("r") && !opc.equals("t")) {
				menuFigura();
				opc=sc.next();
			}
			condicionalFigura(pantalla, opc);
			break;
		}
		case "b":{
			System.out.println("Introduzca el nuevo caracter");
			char letra=sc.next().charAt(0);
			pantalla.modificarFigura(letra);
			break;
		}
		case "c":{
			pantalla.muestraPantalla();
			break;
		}
		case "d":{
			System.out.println(pantalla.areaPantalla()+" m2");
			break;
		}
		case "e":{
			pantalla.listaFigura();
			break;
		}
		case "f":break;
		default: System.out.println("Opcion no valida");
		}
	}
	
	public static void menuFigura() {
		System.out.println("*****FIGURA*****");
		System.out.println("Rectangulo (r)");
		System.out.println("Triangulo (t)");
	}
	
	public static void condicionalFigura(Pantalla pantalla, String caracter) {
		switch(caracter) {
		case "r":{
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
			System.out.println("Introduzca el lado");
			int lado=sc.nextInt();
			String tipo="";
			while(!tipo.equals("a")&&!tipo.equals("b")&&!tipo.equals("c")&&!tipo.equals("d")) {
				System.out.println("introduzca el tipo a,b,c,d");
				tipo=sc.next();
			}
			System.out.println("Indica el caracter");
			char letra=sc.next().charAt(0);
			pantalla.anadeFigura(new Triangulo(lado, tipo, letra));
			break;	
		}
		default:System.out.println("opcion no valida");
		}
	}
}
