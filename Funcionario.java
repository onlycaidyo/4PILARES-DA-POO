package POO;

// Classe derivada (subclasse / classe filha)
// Essa classe herda todos os atributos e métodos da classe "Heranca"
public class Funcionario extends Heranca {
	
	// Atributo exclusivo da classe filha
	private double salario;
	
	// Método próprio da classe filha
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Sobrescrita (override): redefinindo o método da classe pai
	
	@Override
	public void mostrarInfo() {
		// Chama o método da classe pai
		super.mostrarInfo();
		// Adiciona informação extra
		System.out.printf("Salário: R$%.2f%n", salario);
	}
}
