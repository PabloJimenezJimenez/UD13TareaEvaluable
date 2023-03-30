package tareaEvaluable;

public class Rectangulo implements Figura{//Implemento la interfaz Figura
	private int base;
	private int altura;
	private char character;
	public Rectangulo(int base, int altura, char character) {
		this.base = base;
		this.altura = altura;
		this.character = character;
	}
	
	//Devuelvo el nombre de la figura
	@Override
	public String nombre() {
		return "Rectangulo";
	}
	
	//Dibujo la figura en pantalla dependiendo del tipo
	@Override
	public void dibujar() {
		int matriz[][]=new int [altura][base];
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(character);
			}
			System.out.println();
		}
		
	}
	
	//Devuelvo el area de la figura
	@Override
	public int area() {
		return base*altura;
	}
	
	//Cambio el caracter con el que se dibuja la figura
	@Override
	public void setCharacter(char a) {
		this.character=a;
		
	}
	
	//Obtengo el caracter de la figura
	@Override
	public char getCharacter() {
		return character;
	}
	
}
