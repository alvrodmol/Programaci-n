package model;

public class Electrodomestico {

	public enum ConsumoEnergetico {
		A, B, C, D, E, F;
	}

	public enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS;
	}

	private double precioBase;
	private Color color;
	private ConsumoEnergetico consumoEnergetico;
	private double peso;

	public Electrodomestico() {
		this(100, Color.BLANCO, ConsumoEnergetico.F, 5);
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, Color.BLANCO, ConsumoEnergetico.F, peso);

	}

	public Electrodomestico(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso) {
		super();
		setPrecioBase(precioBase);
		setColor(color);
		setConsumoEnergetico(consumoEnergetico);
		setPeso(peso);
	}

	public double getPrecioFinal() {
		double resultado = getPrecioBase();
		switch (consumoEnergetico) {
		case A:
			resultado += 100;
			break;
		case B:
			resultado += 80;
			break;
		case C:
			resultado += 60;
			break;
		case D:
			resultado += 40;
			break;
		case E:
			resultado += 20;
			break;
		case F:
			resultado += 10;
			break;
		}
		if (getPeso() >= 80)
			resultado += 100;
		else {
			if (getPeso() >= 50)
				resultado += 80;
			else {
				if (getPeso() >= 30)
					resultado += 60;
				else {
					if (getPeso() >= 0)
						resultado += 10;
				}
			}
		}
		return resultado;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	private void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		this.color = color;
	}

	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	private void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [getPrecioFinal()=" + getPrecioFinal() + ", getPrecioBase()=" + getPrecioBase()
				+ ", getColor()=" + getColor() + ", getConsumoEnergetico()=" + getConsumoEnergetico() + ", getPeso()="
				+ getPeso() + "]";
	}

}
