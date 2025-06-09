import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] codigos = new int[10];

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite o RA do Aluno: ");
            String aluno = entrada.nextLine();

            System.out.print("Digite o número de Livros a ser Emprestado: ");
            int num = entrada.nextInt();

            for (int i = 0; i < num; i++) {
                System.out.print("Digite o código do livro " + (i + 1) + ": ");
                codigos[i] = entrada.nextInt();
            }

            ServicoEmprestimo servico = new ServicoEmprestimo(
                    new ServicoVerificacaoAluno(),
                    new ServicoVerificacaoDebitoPadrao(),
                    new VerificadorExemplarBibliotecaPadrao(),
                    new CalculadoraDataDevolucao());

            servico.emprestar(aluno, codigos, num);
        }
    }
}
