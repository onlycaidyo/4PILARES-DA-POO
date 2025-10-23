package POO;

// CLASSE PRINCIPAL
public class Main {

	public static void main(String[] args) {
	
		// Criando vários objetos diferentes
		Polimorfismo cachorro = new Cachorro();
		Polimorfismo gato = new Gato();
		Polimorfismo vaca = new Vaca();
		
		// Chamando o mesmo método 'falar' em todos os objetos
		// Cada objeto executa de forma diferente
		cachorro.falar();
		gato.falar();
		vaca.falar();
		
		System.out.println(" --- - --- ");
		
		// EXEMPLO COM VETOR DE OBJETOS POLIMÓRFICOS
		Polimorfismo[] animais = { new Cachorro(), new Gato(), new Vaca() };
		
		for (Polimorfismo animal : animais) {
			animal.falar(); // Mesmo método, comportamentos diferentes
		}
	}

}
