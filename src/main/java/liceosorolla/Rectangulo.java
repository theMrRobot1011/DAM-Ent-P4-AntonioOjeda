package main.java.liceosorolla;

public class Rectangulo {
	private int lado1;
	private int lado2;
	
	public Rectangulo(int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
	
	public boolean esCuadrado() {
		boolean bool=false;
		bool=lado1==lado2;
		return bool;
	}
	
	
	public int perimetro() {
		int perimetro=lado1*2+lado2*2;
		return perimetro;
	}
	
	
	public int area() {
		int area=lado1*lado2;
		return area;
	}
	
	public int hipotenusa() {
		int hipo=(int) Math.sqrt((Math.pow(lado1, 2)+Math.pow(lado2, 2)));
		return hipo;
	}
	
	public int radioCircunferencia() {
		int ladoMenor=lado1;
		if(lado2<lado1) {
			ladoMenor=lado2;
		}
		int radio=ladoMenor/2;
		return radio;
	}
	
}
	


