package tareaEvaluable;

public class Triangulo implements Figura{
	private int lado;
	private String tipo;
	private char character;
	
	public Triangulo(int lado, String tipo, char character) {
		this.lado = lado;
		this.tipo = tipo;
		this.character = character;
	}
	@Override
	public String nombre() {
		return "Triangulo";
	}
	@Override
	public void dibujar() {
		int matriz[][]= new int [lado][lado];
		if(tipo.equals("a")) {//TIPO A
			for(int i=0;i<matriz.length;i++) {
				int row=matriz[i].length-i;
				for(int j=0; j<row;j++) {
					System.out.print(character);
				}
				System.out.println();
			}
		}else if(tipo.equals("b")) {
			for(int i=0;i<matriz.length;i++) {//TIPO B
				for(int j=0; j<matriz[i].length;j++) {
					if(j<matriz.length-(matriz.length- i)) {
						System.out.print(" ");
					}else System.out.print(character);
				}
				System.out.println();
			}

		}else if(tipo.equals("c")) {
			for(int i=0;i<matriz.length;i++) {//TIPO C
				for(int j=0; j<matriz[i].length;j++) {
					if(j<(i+1)) {
						System.out.print(character);
					}else System.out.print(" ");
				}
				System.out.println();
			}
		}else if(tipo.equals("d")) {
			for(int i=0;i<matriz.length;i++) {//TIPO D
				for(int j=0; j<matriz[i].length;j++) {
					if(j<matriz.length-(i+1)) {
						System.out.print(" ");
					}else System.out.print(character);
				}
				System.out.println();
			}
		}
		
		
	}
	@Override
	public int area() {
		return (lado*lado)/2;
	}
	@Override
	public void setCharacter(char a) {
		this.character=a;
		
	}
	@Override
	public char getCharacter() {
		return(character);
		
	}
	
	public void setTipo(String tipo) {
		if(tipo.equalsIgnoreCase("a")) {
			this.tipo = "a";
		}else if(tipo.equalsIgnoreCase("b")) {
			this.tipo="b";
		}else if (tipo.equalsIgnoreCase("c")) {
			this.tipo="c";
		}else if (tipo.equalsIgnoreCase("d")) {
			this.tipo="d";
		}else System.out.println("Opción no valida");
		
	}
	
}
