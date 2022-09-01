package Patron;

public class Consola {
	
	public static void main(String[] args) {
	
		
		Producto tarjetaEspecial = new TarjetaEspecial("Tarjeta Especial" , "Tiene mas detalles");
		tarjetaEspecial.setPrecio(200);
		Producto tarjetaNormal = new TarjetaNormal("Normal" , "clasica");
		tarjetaNormal.setPrecio(300);
		
		Descuento descuento = new Descuento();
		double resultado = tarjetaEspecial.aceptaVisitante(descuento);
		double resultado2 = tarjetaNormal.aceptaVisitante(descuento);
		
		
		
		System.out.println(resultado + " Producto :" + tarjetaEspecial.getNombre() +" "+tarjetaEspecial.getDescripcion());
		System.out.println(resultado2 + " Producto :" + tarjetaNormal.getNombre() +" "+tarjetaNormal.getDescripcion());
		
	}

}
