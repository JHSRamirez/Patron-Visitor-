package Patron;

public interface Visitor {
	double visit(TarjetaNormal normal);
	double visit(TarjetaEspecial descuento);
	

}
