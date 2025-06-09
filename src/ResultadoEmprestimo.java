import java.util.Date;

public class ResultadoEmprestimo {
    private int quantidadeLivros;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public ResultadoEmprestimo(int quantidadeLivros, Date dataEmprestimo, Date dataDevolucao) {
        this.quantidadeLivros = quantidadeLivros;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
}
