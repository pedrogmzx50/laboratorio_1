package carros;
import motores.Motor;
public class Crossover extends CarroBase{
	
	public Crossover(Motor motor)
	{
		super(motor)
	}
	
	@Override  //sobreescritura de metodos
	public void imprimirCategoria() {
		System.out.println("Soy Crossover");
		imprimirMotor();
	
	}
	
	//sobrecarga de metodos
	public void imprimirCategoria(String name) {
	  System.out.println(name);
	}
	

}
