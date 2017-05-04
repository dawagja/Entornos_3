package testMiPersona;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona implements Serializable {
	/**
	 * Uso de la clase Serializable, perteneciente a la clase java.io
	 */

	private String nombre;
	
	private String apellidos;
	
	private Date fechaNacimiento;	
	
	public Persona(String n, String a, int anno, int mes, int dia){
		
		nombre=n;
		
		apellidos=a;
		
		GregorianCalendar calendario=new GregorianCalendar(anno, mes-1,dia);
		
		fechaNacimiento=calendario.getTime();
		
	}
		
	
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	
	
	public String toString(){
		
		return "El Nombre y sus Apellidos es " + nombre + " " + apellidos + ", su fecha de Nacimiento " + fechaNacimiento;
		
	}

	
}
