
import java.util.ArrayList;
public class Ator extends Pessoa {

    private String registro;
    private ArrayList<Filme> filmes = new ArrayList<Filme>();


    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public ArrayList<Filme> setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
        return filmes;
    }
}
