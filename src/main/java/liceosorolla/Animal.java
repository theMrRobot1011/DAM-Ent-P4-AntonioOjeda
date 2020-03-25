package main.java.liceosorolla;

public class Animal {
	private String especie;
	private String raza;
	private int peso;
	private int edad;
	private String colorDePelo;
	private double velocidad;
	private int zancadaXsegundo;
	
	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}


	public int getZancadaXsegundo() {
		return zancadaXsegundo;
	}


	public void setZancadaXsegundo(int zancadaXsegundo) {
		this.zancadaXsegundo = zancadaXsegundo;
	}
	
	
	public Animal(String especie,String raza,int peso,int edad,String colorDePelo,double velocidad,int zancadaXsegundo) {
		this.especie=especie;
		this.raza=raza;
		this.peso=peso;
		this.edad=edad;
		this.colorDePelo=colorDePelo;
		this.velocidad=velocidad;
		this.zancadaXsegundo=zancadaXsegundo;
	}
	
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColorDePelo() {
		return colorDePelo;
	}
	public void setColorDePelo(String colorDePelo) {
		this.colorDePelo = colorDePelo;
	}
}
