import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraAnotaciones {
	@BeforeEach
public void init(CalculadoraAnotaciones anotaciones) {
	anotaciones = new CalculadoraAnotaciones();
}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test

	public void testSuma(Calculadora calculadora) {

		
		assertEquals(7, calculadora.suma());
		}
	
	
	public void testResta(Calculadora calculadora) {
		
		assertEquals(6, calculadora.resta());
		}
	
	
	public void testDivision(Calculadora calculadora) {
		
		assertEquals(3, calculadora.divide());
		}
	
	
	public void testMultiplicacion(Calculadora calculadora) {

		
		assertEquals(20, calculadora.multiplicacion());
		}
	
	
	public void testResta2(Calculadora calculadora) {
		
		assertEquals(8, calculadora.resta2());
		}
	
	
	}