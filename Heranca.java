package POO;

// HERENÇA Permite que uma classe (filha) reaproveite atributos e métodos de outra classe (pai)
// Evita repetição de código e facilita a manutenção

// *Classe base (superclasse / classe pai)
public class Heranca {

	// "PROTECTED" permite o acesso pelas classes filhas
	protected String nome;
	protected int idade;
	
	// Método para mostrar informações
	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}
