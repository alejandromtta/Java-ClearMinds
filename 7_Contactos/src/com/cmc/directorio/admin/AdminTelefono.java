package com.cmc.directorio.admin;

import com.cmc.directorio.entidades.Telefono;

public class AdminTelefono {
public void  activarMensajeria (Telefono tel){
	if(tel.getOperadora() == "movi"){
		tel.setTieneWhatsapp(true);
	} 
}

public int contarMovi (Telefono a, Telefono b, Telefono c){
	String[] Operadores = new String[3];
	int contador = 0;
	Operadores[0] = a.getOperadora();
	Operadores[1] = b.getOperadora();
	Operadores[2] = c.getOperadora();
  if(Operadores[0] == "movi"){
	  contador = contador + 1;
	  if(Operadores[1]  == "movi" ){
		  contador = contador + 1;
		  if(Operadores[2] == "movi") {
			  contador = contador + 1;
			  return contador;
		  } else {
			  return contador;
		  }
	  } else if (Operadores[2] == "movi"){
		  contador = contador + 1;
		  return contador;
	  } else {
		  return contador;
	  }
  }  else if(Operadores[1] == "movi"){
	  contador = contador + 1;
	  if(Operadores[0]  == "movi" ){
		  contador = contador + 1;
		  if(Operadores[2] == "movi") {
			  contador = contador + 1;
			  return contador;
		  } else {
			  return contador;
		  }
	  } else if (Operadores[2] == "movi"){
		  contador = contador + 1;
		  return contador;
	  } else {
		  return contador;
	  }
  } else if(Operadores[2] == "movi"){
	  contador = contador + 1;
	  if(Operadores[1]  == "movi" ){
		  contador = contador + 1;
		  if(Operadores[0] == "movi") {
			  contador = contador + 1;
			  return contador;
		  } else {
			  return contador;
		  }
	  } else if (Operadores[0] == "movi"){
		  contador = contador + 1;
		  return contador;
	  } else {
		  return contador;
	  }
  } else {
	  return 0;
  }
	
} 

public int contarClaro(Telefono a, Telefono b, Telefono c, Telefono d) {
	String[] Operadores = new String[4];
	int contador = 0;
	Operadores[0] = a.getOperadora();
	Operadores[1] = b.getOperadora();
	Operadores[2] = c.getOperadora();
	Operadores[3] = d.getOperadora();
	
	for (int i = 0; i < Operadores.length; i++) {
		if(Operadores[i] == "claro"){
			contador = contador + 1;
		} else {
			contador = contador;
		}
	}
	return contador;
}
	
}