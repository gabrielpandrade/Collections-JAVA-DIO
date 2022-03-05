package dio.collections.stream.classeAnonima;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Anonima {

    private List<Gato> gatos = new ArrayList<>(){{
        add(new Gato("Jon", 12, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
        add(new Gato("Jon", 18, "amarelo"));
    }};

    public void classeAnonima(){
        //Classe Comparator é anônima

        gatos.sort(new Comparator<Gato>() {
            @Override
            public int compare(Gato o1, Gato o2) {
                return Integer.compare(o1.getIdade(), o2.getIdade());
            }
        });
        System.out.println(gatos);
    }

}

class Gato{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}
