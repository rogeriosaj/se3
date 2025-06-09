public class Livro {
	private Titulo titulo;
	private int codigo;

	public Livro(int codigo) {
		this.codigo = codigo;
		this.titulo = new Titulo(codigo);
	}

	public int verPrazo() {
		return titulo.getPrazo();
	}

	public int getCodigo() {
		return codigo;
	}
}
