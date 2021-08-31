package com.clearminds.cuentas;

public class Cuenta {
private String id;
private String tipo = "A";
private double saldo;
public Cuenta (String id){
	this.id =id;
}
public Cuenta(String id, String tipo, double saldo){
	this.id = id;
	this.tipo = tipo;
	this.saldo = saldo;
}
public double  getSaldo(){
	return this.saldo;
}
public String getTipo(){
	return this.tipo;
}
public String getId(){
	return this.id;
}
public void setTipo(String tipo){
	this.tipo = tipo;
}
public void setSaldo(double saldo){
	this.saldo = saldo;
}
public void imprimir(){
	System.out.println("**********");
	System.out.println("CUENTA");
	System.out.println("********");
	System.out.println("Numero de cuenta: " + this.id);
	System.out.println("Tipo: " + this.tipo);
	System.out.println("Saldo: USD " + this.saldo );
	System.out.println("********");
}
}
