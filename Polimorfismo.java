package POO;

// POLIMORFISMO permite que métodos com o mesmo nome tenham comportamentos diferentes 
// dependendo do objeto que os executa

// Classe base (superclasse)
public class Polimorfismo {
	
	protected String nome;
	
	// Método que será sobrescrito pelas subclasses
	public void falar() {
		System.out.println("O ser está se comunicando... ");
	}

}
