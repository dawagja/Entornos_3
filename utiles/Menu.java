package utiles;

public class Menu {
	private String titulo;
	private String[] opciones;
	private int numOpciones;
	
	public Menu(String titulo, String[] opciones) {
		setTitulo(titulo);
		setOpciones(opciones);
		setNumOpciones(opciones);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String[] getOpciones() {
		return opciones;
	}

	public void setOpciones(String[] opciones) {
		int i = 0;
		this.opciones = new String[opciones.length+1];
		for (String opcion : opciones) {
			this.opciones[i++] = opcion;
		}
		this.opciones[i] = "Salir";
	}

	public int getNumOpciones() {
		return numOpciones;
	}

	public void setNumOpciones(String [] opciones) {
		this.numOpciones = opciones.length+1;
	}
 
	
	public int gestionar(){
		mostrar();
		return recogerOpcion();
	}
	
	void mostrar(){
		System.out.println(titulo + "\n");
		for (int i = 0; i < numOpciones; i++) {
			System.out.println("(" + (i+1) + ") " + opciones[i]);
		}
	}
	
	int recogerOpcion(){
		int opcion;
		do {
			opcion = Teclado.leerEntero("\nIntroduce una opcion: ");
			if (opcion<1 || opcion>numOpciones) {
				System.out.println("Opcion incorrecta");
			}
		} while (opcion<1 || opcion>numOpciones);
		return opcion;
	}
	
}
