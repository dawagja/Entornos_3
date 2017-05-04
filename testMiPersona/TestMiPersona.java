package testMiPersona;

import java.io.*;

public class TestMiPersona {

	public static void main(String[] args) {
		
		Persona persona=new Persona("Jose","Aguilar Granados", 1998, 4, 9);
		
		try {
			/**
			 * ObjectOutputStream escribe datos primitivos en un objeto
			 * FileOutputStream crea un archivo donde escribir
			 */
			ObjectOutputStream escribirFichero = new ObjectOutputStream(new FileOutputStream("C:/Users/F-society/Desktop/persona.txt"));

			/*
			 * writeObject metodo que escribe el objeto especifico en el ObjectOutputStream
			 * close finaliza el flujo
			 */
			escribirFichero.writeObject(persona);
			escribirFichero.close();

			/*
			 * ObjectInputStream lee datos primitivos en un objeto
			 * FileInputStream crea una conexion con el archivo
			 */
			ObjectInputStream recuperarFichero = new ObjectInputStream(new FileInputStream("C:/Users/F-society/Desktop/persona.txt"));
			
			Persona personaRecuperada;
			/*
			 * readObject metodo que lee el objeto especifico en el ObjectInputStream
			 */
			personaRecuperada = (Persona) recuperarFichero.readObject();
			recuperarFichero.close();
			
				System.out.println(personaRecuperada);
			
		} catch (IOException | ClassNotFoundException e) {}
		/*
		 * IOException Error ocurrido en la entrada de datos
		 * ClassNotFoundException Error ocurrido cuando la aplicacion intenta cargar una clase no encontrada
		 */
	
	}

}