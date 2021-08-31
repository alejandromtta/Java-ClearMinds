
public class TestRectangulo {
public static void main(String[] args){
	Rectangulo rec;
	rec = new Rectangulo();
	rec.altura = 2;
    rec.base = 6;
    int result = rec.calcularArea();
    System.out.println("Area " + result);
    
     result = rec.calcularPerimetro();
     System.out.println("perimetro " + result);
}
}
