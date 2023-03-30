package tareaEvaluable;

import java.util.ArrayList;

public class Pantalla {
	private ArrayList<Figura>figuras= new ArrayList<>();
	public Pantalla() {
		// TODO Auto-generated constructor stub
	}
	public void anadeFigura(Figura figura) {
		figuras.add(figura);
	}
	public void modificarFigura(char character) {
		for (Figura figura : figuras) {
			figura.setCharacter(character);
		}
	}
	public void listaFigura() {
		for(Figura figura: figuras) {
			System.out.println(figura.nombre());
		}
	}
	public int areaPantalla() {
		int area=0;
		for(Figura figura : figuras) {
			area+=figura.area();
		}
		return area;
	}
	
	public void muestraPantalla() {
		if(figuras.size()==0) {
			System.out.println("No tienes figuras para dibujar");
		}else {
			for(Figura figura : figuras) {
				figura.dibujar();
				System.out.println();
			}
		}
	}
	
}
