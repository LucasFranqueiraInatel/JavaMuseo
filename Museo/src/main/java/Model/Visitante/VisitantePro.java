package Model.Visitante;
import Model.Museo;

public class VisitantePro extends Visitante {

    public VisitantePro(String nome, String cpf, int ano, int mes, int dia, int codTema) {
        super(nome, cpf, ano, mes, dia, codTema);
    }

    @Override
    public void temaVisitado(Museo museo) {
        super.temaVisitado(museo);
    }

    @Override
    public void itensContados(Museo museo) {
        super.itensContados(museo);
    }



}
