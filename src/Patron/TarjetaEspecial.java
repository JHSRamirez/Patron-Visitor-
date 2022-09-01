package Patron;

public class TarjetaEspecial extends Producto{

	public TarjetaEspecial(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double aceptaVisitante(Visitor visitante) {
		// TODO Auto-generated method stub
		return visitante.visit(this);
	}
	
	
	

}
