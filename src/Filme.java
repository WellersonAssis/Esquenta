
import java.util.ArrayList;
 public class Filme {
   private String nome;

   private Integer anoLancamento;

   private Integer nota;

   private ArrayList<Ator> atores = new ArrayList<Ator>();


   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

     public Integer getAnoLancamento() {
         return anoLancamento;
     }

     public void setAnoLancamento(Integer anoLancamento) {
         this.anoLancamento = anoLancamento;
     }

     public Integer getNota() {
         return nota;
     }

     public void setNota(Integer nota) {
         this.nota = nota;
     }
     public ArrayList<Ator> getAtores() {
         return atores;
     }
     public ArrayList<Ator> setAtores(ArrayList<Ator> atores) {
         this.atores = atores;
         return atores;
     }

 }
