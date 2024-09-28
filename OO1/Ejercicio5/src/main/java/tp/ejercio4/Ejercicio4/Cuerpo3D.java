package tp.ejercio4.Ejercicio4;

public class Cuerpo3D{
	private double altura;
	private Figura cara;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Figura cara) {
		this.cara=cara;
	}

	public double getVolumen() {
		return this.cara.getArea()*this.altura;
	}
	
	public double getSuperficieExterior() {
		return (2* this.cara.getArea()) + (this.cara.getPerimetro() * this.altura);
	}
	
}