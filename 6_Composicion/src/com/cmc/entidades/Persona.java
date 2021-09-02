package com.cmc.entidades;

public class Persona {
	private int edad;
	private String name;
	private Direccion direccion;
public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


} 
