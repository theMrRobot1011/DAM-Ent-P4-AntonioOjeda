package main.java.liceosorolla;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
	private String nombre;
	private String apellidos;
	private LocalDate fecha;
	private int ident;
	
	
	
	public Usuario(String nombre, String apellidos, LocalDate fecha, int ident ) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.ident = ident;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getident() {
		return ident;
	}

	public void setident(int ident) {
		this.ident = ident;
	}
	
	public boolean mayoriaEdad() {
		boolean bool=true;
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fecha, ahora);
		bool=18<periodo.getYears();
		return bool;
	}
	public String nombreApellidosMayus() {
		return (this.nombre.toUpperCase()+" "+this.apellidos.toUpperCase());
	}
	
	public String nombreApellidosMinus() {
		return (this.nombre.toLowerCase()+" "+this.apellidos.toLowerCase());
	}
}

	


