package abstractasinterfaz;

public class Libro extends Productos{
	
	private String autor;
	
	public Libro(String nombre,String descripcion,double precio,String autor) {
		super(nombre,descripcion,precio);
		this.autor=autor;
	}
	

	@Override
	public void MostrarInformacion() {
		System.out.println("el nombre es " +getNombre());
		System.out.println("la descripcion es " +getDescripcion());
		System.out.println("el precio es " +getPrecio());
		System.out.println("su autor es " +autor);
		
	}
	
	
	

}
