package com.clearminds.test;

import com.clearminds.cuentas.Cuenta;

public class TestCuenta {
	public static void main(String[] args) {
Cuenta cuenta1 = new Cuenta("03476", "B", 675);
cuenta1.imprimir();
cuenta1.setSaldo(675);

	}
}
