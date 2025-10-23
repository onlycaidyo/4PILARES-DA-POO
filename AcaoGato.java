package POO;

//Outra classe concreta que herda de Abstracao
public class AcaoGato extends Abstracao {
	
		
		@Override
		public void executarAcao() {
			System.out.println("O gato faz: Miau! ");
		}

}