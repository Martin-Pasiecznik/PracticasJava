package ar.edu.info.oo1.ej3_presupuestos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp.ejercio3.ejercicio3.Item;

public class ItemTest {

	private Item item;

	@BeforeEach
	public void setUp() {
		item = new Item("azucar", 2, 60);
	}

	@Test
	public void testCosto() {
		assertEquals(120, item.costo());
	}

	@Test
	public void testCostoUnitario() {
		assertEquals(60, item.getCostoUnitario());
	}
}
