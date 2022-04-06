import org.junit.Test;

@SuppressWarnings("unused")
public class CalculadoraTest {
	

	private int numero1;
	private int numero2;
	
	// Source con 2 con valor si es distinto no hace falta this
public CalculadoraTest(int numero1, int numero2 )	{
super();
this.numero1= numero1;
this.numero2= numero2;
}

// Source con 0 sin valor
public CalculadoraTest()	{
super();
}

// modificador, devolucion, nombremetodo (listaargumento){
// minusMayus
public int suma () {
	
	int resultado;
	
	resultado = numero1 + numero2;
	
	return resultado;
	
	// También se puede poner return numero1 + numero2;
	
}

// multiplicacion


	
	public int multiplicacion(){
		
		
		int resultado;
		if(multiplicacion2()){
				resultado = numero1 - numero2;
		}else{
				resultado = numero2 - numero1;
		}
		return resultado;
	}
	public boolean multiplicacion2(){
		if (numero1 >= numero2){
				return true;
		}else{
				return false;
		}
	}
	public Integer multiplica2(){
		if(numero2==0){
				return null;
		}
		return numero1*numero2;
	}

	
	// resta
public int resta(){
	
	
	int resultado;
	if(resta2()){
			resultado = numero1 - numero2;
	}else{
			resultado = numero2 - numero1;
	}
	return resultado;
}
public boolean resta2(){
	if (numero1 >= numero2){
			return true;
	}else{
			return false;
	}
}
//public Integer divide(){
//	if(numero2==0){
//			return null;
//	}
//	return numero1/numero2;
//}
}
