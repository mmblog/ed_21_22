import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaCalculadora {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	
	//modificador devuelve nombreMetodo(lista_argumetos){
	public void testSuma() {
		
		//codigo para probar que la suma funcione
		
		Calculadora calculadora = new Calculadora(5, 2);
		
		assertEquals(7, calculadora.suma());
		}
	
	public void testResta() {
		Calculadora calculadora = new Calculadora(8, 2);
		
		assertEquals(6, calculadora.resta());
		}
	
	public void testDivision() {
		Calculadora calculadora = new Calculadora(6, 2);
		
		assertEquals(3, calculadora.divide());
		}
	
	public void testMultiplicacion() {
		Calculadora calculadora = new Calculadora(10, 2);
		
		assertEquals(20, calculadora.multiplicacion());
		}
	
	public void testResta2() {
		Calculadora calculadora = new Calculadora(10, 2);
		
		assertEquals(8, calculadora.resta2());
		}
	
	}
	

