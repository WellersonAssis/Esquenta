import java.util.ArrayList;
public class Genero {

    private String nome;

    private ArrayList<Filme> filmes = new ArrayList<Filme>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Filme> getFilmes() {
        return filmes;
    }
    public ArrayList<Filme> setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
        return filmes;
    }
}
