package test;

import carros.CarroBase;
import carros.Pickup;
import carros.Sedan;
import carros.Suv;
import motores.MotorDiesel;
import motores.MotorGasolina;

public class Test {
	
	
	

	public static void main(String[] args) {
	 
	       
		MotorGasolina motorGasolina = new MotorGasolina();//composicion
		MotorDiesel motorDiesel = new MotorDiesel();
		
		Sedan carro1 = new Sedan(motorDiesel);//polimorfismo
		Pickup carro2 = new Pickup(motorGasolina);
		Crossover carro3 = new Crossover(motorGasolina);
		
		carro1.imprimirCategoria();
		carro2.imprimirCategoria();
		carro3.imprimirCategoria();
	}
	
}
