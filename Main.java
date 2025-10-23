package POO;

public class Main {

	public static void main(String[] args) {
		
		// Criando objetos das classes concretas
				Abstracao cachorro = new AcaoCachorro();
				
				Abstracao gato = new AcaoGato();
				
		// Chamando os métodos
				cachorro.executarAcao();
				cachorro.mensagemPadrao();
				
				System.out.println("------------------------------------------- \n");
				
				gato.executarAcao();
				gato.mensagemPadrao();
				
	}

}
