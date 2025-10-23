package POO;

// PONTO DE ENTRADA DO PROGRAMA
public class Main {

	public static void main(String[] args) {
	
		// Criando um objeto da classe Encapsulamento
		Encapsulamento pessoa = new Encapsulamento();
		
		// Acessando os atributos de forma controlada pelos métodos get e set
		pessoa.setNome("Caique");
		pessoa.setIdade(24);
		
		// Mostrando as informações
		pessoa.mostrarInfo();
		
		System.out.println("\n ----------------------- \n");
		
		// Tentando definir idade inválida
		pessoa.setIdade(-5);
		// Irá mostrar a mensagem de erro
	}

}
