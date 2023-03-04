import java.util.ArrayList;

public class Diretor extends Pessoa {

    private Integer quantidadePremios;
    private ArrayList<Filme> filmes = new ArrayList<Filme>();


    public Integer getQuantidadePremios() {
        return quantidadePremios;
    }

    public void setQuantidadePremios(Integer quantidadePremios) {
        this.quantidadePremios = quantidadePremios;

    }
    public ArrayList<Filme> getFilmes() {
        return filmes;
    }
    public ArrayList<Filme> setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
        return filmes;
    }


}