package com.cmc.flujo;

public class Validador {
public void validarEdad(int edad){
	if(edad >= 18){
		System.out.println("Eres Mayor De Edad!!");
	} else {
		System.out.println("Eres Menor De Edad!1");
	}
}
public String validarEdadMsg(int edad){
	if(edad >= 18){
		return "Eres Mayor De Edad!!";
	} else {
		return "Eres Menor De Edad!1";
	}
}

public boolean validarEdadBoolean(int edad){
	if(edad >= 18){
		return true;
	} else {
		return false;
	}
}
}
