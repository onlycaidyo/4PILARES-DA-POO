package POO;

// Outra subclasse que herda da classe "Heranca"
public class Estudante extends Heranca {
	
	// Atributo exclusivo da classe filha
	private String curso;
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Curso: " + curso);
	}

}
