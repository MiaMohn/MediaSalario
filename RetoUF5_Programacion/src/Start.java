/*
 * @author Maria Gaio a.k.a. Mia Mohn
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int numEmpleados = 0;
		String nombre = "";
		float salario = 0.0f;
		float media = 0.0f;
		
		Scanner dataInput = new Scanner(System.in);
		
		ArrayList<Empleado> salarioEmpleados = new ArrayList<Empleado>();
		
		System.out.print("Introduzca el número de empleados: ");
		numEmpleados = dataInput.nextInt();
		
		for(i=0; i<numEmpleados; i++)
		{
			System.out.print("Introduzca el nombre del empleado " + (i+1) + ": ");
			nombre = dataInput.next();
			
			System.out.print("Introduzca el salario del empleado " + (i+1) + ": ");
			salario = dataInput.nextFloat();
			
			Empleado e = new Empleado();
			e.setNombre(nombre);
			e.setSalario(salario);
			
			salarioEmpleados.add(e);
		}
		
		for(i=0; i<numEmpleados; i++)
		{
			media += salarioEmpleados.get(i).getSalario();
		}
		media = media/numEmpleados;
		
		System.out.print("La media de salarios es " + media);

	}

}
