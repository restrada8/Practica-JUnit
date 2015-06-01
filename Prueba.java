import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Prueba {
	private static final int N = 5;
	private BinaryString prueba1, prueba2, prueba3;
	private String pruebas2 = "10110", pruebas3 = "100101";
	
	@Before
	public void iniciar() {
		prueba1 = new BinaryString(N);
		prueba2 = new BinaryString(pruebas2);
		prueba3 = new BinaryString(pruebas3);
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

}
