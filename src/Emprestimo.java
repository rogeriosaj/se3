import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {
    private Date dataEmprestimo = new Date();
    private Date dataPrevista;
    private List<Item> itens = new ArrayList<>();

    public boolean emprestar(List<Livro> livros, CalculadoraDataDevolucao calculadora) {
        for (Livro livro : livros)
            itens.add(new Item(livro));

        dataPrevista = calculadora.calcularData(itens, dataEmprestimo);

        System.out.println("\nNúmero de Livros Emprestados: " + livros.size());
        System.out.println("Data de Empréstimo: " + dataEmprestimo);
        System.out.println("Data de Devolução: " + dataPrevista);

        return true;
    }
}
