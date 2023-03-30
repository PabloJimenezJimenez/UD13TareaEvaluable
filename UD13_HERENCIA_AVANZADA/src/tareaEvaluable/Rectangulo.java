package tareaEvaluable;

public class Rectangulo implements Figura{
	private int base;
	private int altura;
	private char character;
	public Rectangulo(int base, int altura, char character) {
		this.base = base;
		this.altura = altura;
		this.character = character;
	}
	@Override
	public String nombre() {
		return "Rectangulo";
	}
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
	@Override
	public int area() {
		return base*altura;
	}
	@Override
	public void setCharacter(char a) {
		this.character=a;
		
	}
	@Override
	public char getCharacter() {
		return character;
	}
	
}
