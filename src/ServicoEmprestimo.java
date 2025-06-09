import java.util.ArrayList;
import java.util.List;

// Controle

public class ServicoEmprestimo {
    private ServicoVerificacaoAluno servicoAluno;
    private ServicoVerificacaoDebito servicoDebito;
    private CalculadoraDataDevolucao calculadora;

    public ServicoEmprestimo(
            ServicoVerificacaoAluno servicoAluno,
            ServicoVerificacaoDebito servicoDebito,
            VerificadorExemplarLivro verificadorLivro,
            CalculadoraDataDevolucao calculadora) {
        this.servicoAluno = servicoAluno;
        this.servicoDebito = servicoDebito;
        this.calculadora = calculadora;
    }

    public boolean emprestar(String raAluno, int[] codigos, int numLivros) {
        Aluno aluno = new Aluno(raAluno);

        if (!servicoAluno.alunoExiste(aluno)) {
            System.out.println("Aluno Inexistente");
            return false;
        }

        if (servicoDebito.alunoTemDebito(aluno)) {
            System.out.println("Aluno em Débito");
            return false;
        }

        List<Livro> livros = new ArrayList<>();
        for (int i = 0; i < numLivros; i++) {
            Livro livro = new Livro(codigos[i]);
            livros.add(livro);
        }

        Emprestimo emprestimo = new Emprestimo();
        return emprestimo.emprestar(livros, calculadora);
    }
}
