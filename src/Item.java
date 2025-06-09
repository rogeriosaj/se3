import java.util.Calendar;
import java.util.Date;

public class Item {
	private Livro livro;
	private Date dataDevolucao;

	public Item(Livro livro) {
		this.livro = livro;
	}

	public Date calculaDataDevolucao(Date data) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.DATE, livro.verPrazo());
		this.dataDevolucao = calendar.getTime();
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
}
