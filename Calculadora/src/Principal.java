
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creacion instantania calculadora
				Calculadora cal = new Calculadora (8,5);
				
				//Se ejecuta en run o debug 
				// Run configuracion java aplicacion new busca clase
				// Debug puntos de ruptura en todos los metodos
				// Extension de JUnit
				
				System.out.println("El resultado de la suma es:" + cal.suma());
				System.out.println("El resultado de la suma es:" + cal.multiplicacion());
				System.out.println("El resultado de la suma es:" + cal.divide());
				System.out.println("El resultado de la suma es:" + cal.resta());

	}

}
