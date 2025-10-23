package POO;

	// 1 dos pilares da POO: ABSTRAÇÃO, mostra só o que é essencial e esconde detalhes desnecessários
   // A ABSTRAÇÃO mostra como uma classe abstrata define O QUE deve ser feito, mas deixa para as subclasses decidirem COMO será feito
  // Uma classe ABSTRATA não pode ser INSTANCIADA diretamente 
	abstract class Abstracao {

		// Método abstrato: define O QUE deve ser feito, mas não COMO
		public abstract void executarAcao();
		
		// Método concreto: já tem uma implementação padrão
		public void mensagemPadrao() {
			System.out.println(" ");
		}
		
	}

