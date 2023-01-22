import Model.Museo;
import Model.Tema.Tema;
import Model.Visitante.Visitante;
import Model.Visitante.VisitantePro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Museo museo = new Museo();
        declarandoTemas(museo);
        ArrayList<Visitante> visitantes = new ArrayList<Visitante>();
        Visitante visitante1 = new Visitante("Lucas","001",2002,01,21,1);
        visitantes.add(visitante1);
        Visitante visitante2 = new Visitante("Pedro","002",2011,1,11,2);
        visitantes.add(visitante2);
        Visitante visitante3 = new Visitante("Flavio","003",1999,01,30,3);
        visitantes.add(visitante3);
        VisitantePro visitante4 = new VisitantePro("Vinicios","004",1995,04,2,4);
        visitantes.add(visitante4);
        VisitantePro visitante5 = new VisitantePro("Jao","005",1500,01,01,5);
        visitantes.add(visitante5);

       for (Visitante visitante : visitantes) {
           visitante.temaVisitado(museo);
           visitante.itensContados(museo);
        }

    }
    public static void declarandoTemas(Museo museo){
        Tema temaNumismatica = new Tema("Numismatica",300);
        museo.addTema(temaNumismatica);
        Tema temaVintage = new Tema("Vintage",135);
        museo.addTema(temaVintage);
        Tema temaPinturas = new Tema("Pinturas",72);
        museo.addTema(temaPinturas);
        Tema temaHistoriaDaMuisica = new Tema("Historia da Muisica",67);
        museo.addTema(temaHistoriaDaMuisica);
        Tema temaEsculturas = new Tema("Esculturas",46);
        museo.addTema(temaEsculturas);
    }

}
