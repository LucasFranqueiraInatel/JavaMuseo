package Model;

import Model.Tema.Tema;
import java.util.ArrayList;

public class Museo {
    ArrayList<Tema> temas = new ArrayList<Tema>();

    public void addTema(Tema tema){
        temas.add(tema);
    }

    public ArrayList<Tema> getTemas() {
        return temas;
    }

}
