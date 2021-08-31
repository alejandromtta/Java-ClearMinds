
public class TestAuto {

	public static void main(String[] args) {
		
		Auto autoUno;
		Auto autoDos;
        autoUno = new Auto("Subaru", 1.500 , 1970);
//        autoUno.setMarca("Subaru");
//		autoUno.setAnio(1970);
//        autoUno.setPrecio(1.500);
        System.out.println("Marca:  " + autoUno.getMarca()+ ", Anio: " + autoUno.getAnio() + ", Precio: " + autoUno.getPrecio());
        
		autoDos = new Auto("Toyota", 1.800, 1990);
//		autoDos.setMarca("Toyota");
//		autoDos.setAnio(1990);
//        autoDos.setPrecio(1.800);
	System.out.println("Marca: " + autoDos.getMarca() + ", Anio: " + autoDos.getAnio() + ", precio: " + autoDos.getPrecio());
	}

}
