package abstractasinterfaz;

public class Electrodomestico extends Productos{
	private String marca;
	
	public Electrodomestico(String nombre,String descripcion,double precio,String marca) {
		super(nombre,descripcion,precio);
		this.marca = marca;
	}
	

	@Override
	public void MostrarInformacion() {
		System.out.println("el nombre es " +getNombre());
		System.out.println("la descripcion es " +getDescripcion());
		System.out.println("el precio es " +getPrecio());
		System.out.println("su autor es " +marca);
		
	}
	
	
	

}
	
