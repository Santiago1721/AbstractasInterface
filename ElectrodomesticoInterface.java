package abstractasinterfaz;

class Electrodomesticosinterface implements ProductosInterface {
	
	private String marca;
	private String nombre;
	private String descripcion;
	private double precio;
	
	public Electrodomesticosinterface(String nombre,String descripcion,double precio,String marca) {
		this.marca = marca;
	}
	

   
	public void MostrarInformacion() {
		System.out.println("el nombre es " +nombre);
		System.out.println("la descripcion es " +descripcion);
		System.out.println("el precio es " +precio);
		System.out.println("su autor es " +marca);
		
	}
	
	
	

}
	
	
	
      
