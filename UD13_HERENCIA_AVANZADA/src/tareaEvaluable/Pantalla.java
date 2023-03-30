package tareaEvaluable;

import java.util.ArrayList;

public class Pantalla {
	private ArrayList<Figura>figuras;
	public Pantalla() {
		this.figuras= new ArrayList<>();
	}
	//Metodo que me añade uuna figura
	public void anadeFigura(Figura figura) {
		figuras.add(figura);
	}
	
	//Metodo que me cambia el caracter de las figuras
	public void modificarFigura(char character) {
		for (Figura figura : figuras) {
			figura.setCharacter(character);
		}
	}
	
	//Metodo que me muestra el nombre de la figura
	public void listaFigura() {
		for(Figura figura: figuras) {
			System.out.println(figura.nombre());
		}
	}
	
	//Metodo que me devuelve el area total de las figuras en pantalla
	public int areaPantalla() {
		int area=0;
		for(Figura figura : figuras) {
			area+=figura.area();
		}
		return area;
	}
	
	//Metodo que me dibuja las figuras en pantalla
	public void muestraPantalla() {
		if(figuras.size()==0) {//Si no hay figuras me muestra un mensaje de no hay figuras
			System.out.println("No tienes figuras para dibujar");
		}else {
			System.out.println("Las figuras que has añadido son: ");
			for(Figura figura : figuras) {
				figura.dibujar();
				System.out.println();
			}
		}
	}
	
}
