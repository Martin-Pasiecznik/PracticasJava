package tp.ejercio3.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Presupuesto{
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	
	public Presupuesto(String cliente) {
		this.cliente=cliente;
		this.fecha=LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item unItem){
		this.items.add(unItem);
	}
	
	public double calcularTotal() {
		double total=0.0;
		for(Item item : items ) {
			total += item.costo();
		}
		return total;
	}

	public String getCliente() {
		return cliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}


	
	
}