import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalculadoraDataDevolucao {

    public Date calcularData(List<Item> itens, Date dataBase) {
        Date dataPrevista = dataBase;
        Date dataAux;

        for (Item item : itens) {
            dataAux = item.calculaDataDevolucao(dataBase);
            if (dataPrevista.compareTo(dataAux) < 0)
                dataPrevista = dataAux;
        }

        if (itens.size() > 2) {
            int diasExtra = (itens.size() - 2) * 2;
            Calendar cal = Calendar.getInstance();
            cal.setTime(dataPrevista);
            cal.add(Calendar.DATE, diasExtra);
            dataPrevista = cal.getTime();
        }

        for (Item item : itens) {
            item.setDataDevolucao(dataPrevista);
        }

        return dataPrevista;
    }
}
