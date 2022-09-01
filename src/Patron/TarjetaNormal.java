package Patron;

public class TarjetaNormal extends Producto{

	public TarjetaNormal(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double aceptaVisitante(Visitor visitante) {
		// TODO Auto-generated method stub
		return visitante.visit(this);
	}

}
