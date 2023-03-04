import java.util.ArrayList;


 public class Filme {

     ArrayList<String> filme = new ArrayList<>();


   private String nome;

   private Integer anoLancamento;

   private Integer nota;


   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }
}
