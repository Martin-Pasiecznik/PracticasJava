package tp.ejercio6.ejercicio6;

import java.time.*;

public class Mamifero{
	
	private String identificador;
	private String especie;
	private LocalDate fechaNaciomiento;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abueloMaterno;
	private Mamifero abuelaMaterna;
	private Mamifero abueloPaterno;
	private Mamifero abuelaPaterna;
	public Mamifero() {
		
	}
	
	public Mamifero(String identificador) {
		this.identificador=identificador;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if(this.padre == unMamifero || this.madre == unMamifero || this.abueloMaterno == unMamifero || this.abuelaMaterna == unMamifero) return true;
		else return false;
	}
	
	////getter | setters
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNaciomiento() {
		return fechaNaciomiento;
	}
	public void setFechaNaciomiento(LocalDate fechaNaciomiento) {
		this.fechaNaciomiento = fechaNaciomiento;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getAbueloMaterno() {
		return this.abueloMaterno;
	}

	public void setAbueloMaterno() {
		this.abueloMaterno = this.madre.getPadre();
	}

	public Mamifero getAbuelaMaterna() {
		return this.abuelaMaterna;
	}

	public void setAbuelaMaterna() {
		this.abuelaMaterna = this.madre.getMadre();
	}

	public Mamifero getAbueloPaterno() {
		return this.abueloPaterno;
	}

	public void setAbueloPaterno(Mamifero abueloPaterno) {
		this.abueloPaterno = abueloPaterno;
	}

	public Mamifero getAbuelaPaterna() {
		return this.abuelaPaterna;
	}

	public void setAbuelaPaterna() {
		this.abuelaPaterna = this.padre.getMadre();
	}

	
	
}