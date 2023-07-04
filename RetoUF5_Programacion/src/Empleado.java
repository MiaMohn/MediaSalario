
public class Empleado {
	
	//Declaración de variables
	
	protected String nombre;
	protected float salario;
	
	
	//Constructores
	
	public Empleado()
	{
		this.nombre = "";
		this.salario = 0.0f;
	}
	
	public Empleado(String nombre, float salario)
	{
		this.nombre = nombre;
		this.salario = salario;
	}
	
	
	//Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	

}
