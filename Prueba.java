import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Prueba {
	private static final int N = 5;
	private BinaryString prueba1, prueba2, prueba3, prueba4;
	private String pruebas2 = "10110", pruebas3 = "100101", pruebas4 = "0110101";
	
	@Before
	public void iniciar() {
		prueba1 = new BinaryString(N);
		prueba2 = new BinaryString(pruebas2);
		prueba3 = new BinaryString(pruebas3);
		prueba4 = new BinaryString(pruebas4);
	}
	
	@Test
	public void testLength() {
		assertEquals(N, prueba1.length());
		assertEquals(N, prueba2.length());
	}
	
	@Test
	public void testSetBit() {
		prueba3.set(1, '1');
		assertEquals('1', prueba3.get(1));
	}
	
	@Test(expected = BinaryStringException.class)
	public void testGetOutOfLimitBit() {
		prueba4.get(56);
	}
	
	@Test(expected = BinaryStringException.class)
	public void testSetOutOfLimitBit() {
		prueba4.set(56, '0');
	}
	
	@Test
	public void testSetOutOfLimitV2() {
		try {
			prueba4.set(56, '0');
			fail("Se esperaba que se lanzara una excepcion del tipo BinaryStringException");
		} catch (BinaryStringException e) {}
	}

}
