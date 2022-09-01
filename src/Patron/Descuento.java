package Patron;

public class Descuento implements Visitor{
	
	private final double sinDescuento = 1.00;
	private final double conDescuento = 0.30;
	
	
	@Override
	public double visit(TarjetaNormal normal) {
		return normal.getPrecio()*sinDescuento;
		
		
		
	}
	@Override
	public double visit(TarjetaEspecial descuento) {
		
		return descuento.getPrecio()-(descuento.getPrecio()*conDescuento);
		// TODO Auto-generated method stub
		
	}
	
	

}
