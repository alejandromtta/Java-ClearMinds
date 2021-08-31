
public class Rectangulo {
int base;
int altura;

public int calcularArea(){
	int resultado = base * altura;
	return resultado;
}

public int calcularPerimetro(){
	int resultado = (2 * base)+(2 * altura);
	return resultado;
}
}
