package model;


public class Cristal extends Material implements Mezclar {
	public TipoCristal tipo;

	public Cristal(String nombre, int masa, int capacidadQuemarse, int capacidadDiluirse, boolean movible,
			TipoCristal tipo) {
		super(nombre, masa, capacidadQuemarse, capacidadDiluirse, movible);
		this.tipo = tipo;
		
	}

	@Override
	public void mezclarConMaterial(Material material) {
		if (material instanceof Cristal) {
			Cristal cristal = (Cristal) material;
			if (cristal.tipo == this.tipo) {
				System.out.println("Cristal de " + this.tipo.toString().toLowerCase() + " fusionado.");
			} else {
				System.out.println("No se puede fusionar cristales de distinto tipo.");
			}
		} else {
			System.out.println("No se puede fusionar cristal con " + material.getNombre() + ".");
		}
	}

	@Override
	public String toString() {
		return "Cristal " + tipo.toString().toLowerCase() + ": " + super.toString();
	}
}
