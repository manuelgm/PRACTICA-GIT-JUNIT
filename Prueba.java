import static org.junit.Assert.*;

import org.junit.*;

public class Prueba {

	private BinaryString bitset1, bitset2, bitset3, bitset4, bitset5;
	private String pruebaString2 = "1010101010", pruebaString3 = "100101",
			pruebaString4 = "0110101", pruebaString5 = "1111000";

	// Para cada Test inicializamos antes su correspondiente bitset con su
	// String asociado.

	@Before
	public void antesDelTest() {
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(pruebaString2);
		bitset3 = new BinaryString(pruebaString3);
		bitset4 = new BinaryString(pruebaString4);
		bitset5 = new BinaryString(pruebaString5);
	}

	// Comprobamos si al inicializar el bitset (con los dos constructores) el
	// tama�o es el esperado.
	@Test
	public void testLength() {
		assertEquals(10, bitset1.length());
		assertEquals(10, bitset2.length());
	}

	// Comprobamos si al cambiar una posicion del bitset a un '1' el cambio se
	// hace efectivo.
	@Test
	public void testSetBit() {
		bitset3.set(1, '1');
		assertEquals('1', bitset3.get(1));
	}

	// Comprobamos si al acceder fuera de los limites del array nos lanza una
	// exception tipo BinaryStringExcepcion.
	@Test(expected = BinaryStringExcepcion.class)
	public void testGetOutOfLimitBit() {
		bitset4.get(56);
	}

}