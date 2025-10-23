package POO;

 // O ENCAPSULAMENTO protege os dados de uma classe
 // Permite o acesso por meio de métodos controlados (GET e SET)
public class Encapsulamento {
	
	// Atributos privados: só essa classe pode acessar diretamemte
	private String nome;
	private int idade;
	
	// Método público para definir (alterar) o valor do nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Método público para acessar (ler) o valor do nome
	public String getNome() {
		return nome;
	}
	
	// Método para definir a idade (com validação)
	public void setIdade(int idade) {
		if (idade >= 0) { 
		// Impede valores negativos
		this.idade = idade;
	} else {
		System.out.println(" Idade inválida! ");
	}
	 }
	
	//Método público para acessar (ler) a idade
	public int getIdade() {
		return idade;
	}
	
	// Método para exibir as informações
	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}
