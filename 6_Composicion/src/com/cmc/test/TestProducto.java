package com.cmc.test;

import com.cmc.admin.AdminProducto;
import com.cmc.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  AdminProducto admin =new AdminProducto();
  Producto uno = new Producto("uwu",0.65);
  Producto dos = new Producto("owo", 0.50);

  Producto productCaro =   admin.comparar(uno, dos);
  System.out.println("mas caro:" + productCaro.getNombre());
		  
	}

}
