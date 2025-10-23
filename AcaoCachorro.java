package POO;

	// Classe concreta que herda de Abstracao
	public class AcaoCachorro extends Abstracao {
		
		@Override
		public void executarAcao() {
			System.out.println("O cachorro faz: Au Au! ");
		}

	}

