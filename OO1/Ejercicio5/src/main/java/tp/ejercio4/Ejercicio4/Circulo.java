package tp.ejercio4.Ejercicio4;

public class Circulo implements Figura{
	private double radio;
	
	public Circulo() {
	}

	public double getDiametro() {
		return this.radio*2;
	}

	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro(){
		return (this.getDiametro() * Math.PI);
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
}