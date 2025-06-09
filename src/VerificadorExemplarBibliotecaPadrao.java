public class VerificadorExemplarBibliotecaPadrao implements VerificadorExemplarLivro {
    @Override
    public boolean ehExemplarBiblioteca(Livro livro) {
        return livro.getCodigo() == 3;
    }
}
