package Model.Visitante;

import Model.Museo;
import Model.Tema.Tema;

import java.util.ArrayList;
import java.util.Date;

public class Visitante {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private int codTema;


    public Visitante(String nome, String cpf, int ano, int mes, int dia, int codTema) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = new Date(ano, mes, dia);
        this.codTema = codTema;
    }

    public void temaVisitado(Museo museu) {
        ArrayList<Tema> temas = museu.getTemas();
        int i;
        for (i = 0; i < Tema.id; i++) {
            if (i + 1 == this.codTema) {
                System.out.println(this.nome + " ira vitar a exposição " + temas.get(i).getNome());
            }
        }

    }

    public void itensContados(Museo museu) {
        ArrayList<Tema> temas = museu.getTemas();
        int i;
        for (i = 0; i < Tema.id; i++) {
            if (i+1 == this.codTema){
                System.out.println(this.nome + " contou "+ temas.get(i).getItens_expostos());
            }
        }
    }
}
