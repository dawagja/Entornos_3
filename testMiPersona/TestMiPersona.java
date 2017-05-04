package testMiPersona;

import java.io.*;

public class TestMiPersona {

	public static void main(String[] args) {
		
		Persona persona=new Persona("Jose","Aguilar Granados", 1998, 4, 9);
		
		try {
			
			ObjectOutputStream escribirFichero = new ObjectOutputStream(new FileOutputStream("C:/Users/F-society/Desktop/persona.txt"));

			
			escribirFichero.writeObject(persona);
			escribirFichero.close();

			ObjectInputStream recuperarFichero = new ObjectInputStream(new FileInputStream("C:/Users/F-society/Desktop/persona.txt"));
			
			Persona personaRecuperada;
			
			personaRecuperada = (Persona) recuperarFichero.readObject();
			recuperarFichero.close();
			
				System.out.println(personaRecuperada);
			
		} catch (IOException | ClassNotFoundException e) {}
		
	
	}

}