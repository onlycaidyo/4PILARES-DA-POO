package POO;

// CLASSE PRINCIPAL (ponto de entrada do programa)
public class Main {

	public static void main(String[] args) {
		
		// Criando objeto da subclasse Funcionario
		Funcionario f = new Funcionario();
		f.nome = "Caique"; // Atributo herdado da classe pai
		f.idade = 30; // Atributo herdado da classe pai
		f.setSalario(20800.00); // Atributo da classe filha
		
		// Criando objeto da subclasse Estudante
		Estudante e = new Estudante();
		e.nome = "Caique";
		e.idade = 20;
		e.setCurso("Análise e Desenvolvimento de Sistemas");
		
		// Exibindo informações de cada um
		System.out.println("------- FUNCIONÁRIO -------");
		f.mostrarInfo();
		
		System.out.println("\n------- ESTUDANTE -------");
		e.mostrarInfo();
	}

}
