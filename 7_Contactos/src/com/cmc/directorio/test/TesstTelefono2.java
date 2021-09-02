package com.cmc.directorio.test;

import com.cmc.directorio.admin.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TesstTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Telefono telf = new Telefono  ("movi","098234234", 20);
     Telefono telfb = new Telefono  ("claro","098234234", 20);
     Telefono telfc = new Telefono  ("movi","098234234", 20);
     Telefono telfd = new Telefono  ("movi","098234234", 20);
     AdminTelefono at = new AdminTelefono();
     at.activarMensajeria(telf);
     System.out.println(telf.isTieneWhatsapp());
    int asd = at.contarClaro(telf, telfb, telfc, telfd);
    System.out.println(asd);
    
	}

}
