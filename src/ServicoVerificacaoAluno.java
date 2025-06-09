public class ServicoVerificacaoAluno {
    public boolean alunoExiste(Aluno aluno) {
        return !aluno.getRA().equals("10");
    }
}
