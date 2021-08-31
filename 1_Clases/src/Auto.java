
public class Auto {
	
		private String marca;
		private double precio;
		private int anio;
		
		public Auto (String marca, double precio, int anio){
			this.marca = marca;
			this.precio = precio;
			this.anio = anio;
		}
     public void setMarca(String a){
    	 this.marca = a;
    	 
     }
     
     public void setPrecio (double a){
    	 this.precio = a;
    	
     }
     
     public void setAnio (int a){
    	 this.anio = a;
    	
     }
     
     public String getMarca(){
    	 return this.marca;
     }
     public double getPrecio(){
    	 return this.precio;
     }
     public int getAnio(){
    	 return this.anio;
     }
}
