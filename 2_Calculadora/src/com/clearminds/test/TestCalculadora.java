package com.clearminds.test;

import com.clearminds.utils.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
     Calculadora cal;
     cal = new Calculadora();
     double resultado = 0;
   resultado = cal.sumar(2, 6);
   System.out.println("sumar "+ resultado);
   
   resultado = cal.mutiplicar(2, 6);
   System.out.println("multiplicar " + resultado);
   
   resultado = cal.dividir(2, 6);
   System.out.println("dividir " + resultado);
   
   resultado = cal.restar(2,6);
   System.out.println("restar " + resultado);
	}
 
}
