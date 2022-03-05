package dio.collections.stream.functionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterface {
    private List<Gato> gatos = new ArrayList<>(){{
        add(new Gato("Jon", 12, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
        add(new Gato("Jon", 18, "amarelo"));
    }};


    public void interfaceFuncional(){
        /* CLASSE ANÔNIMA
        gatos.sort(Comparator.comparing(new Function<Gato, String>() {
            @Override
            public String apply(Gato gato){
                return gato.getNome();
            }
        }));
        */

        //LAMBDA -> gatos.sort(Comparator.comparing((Gato gato)->gato.getNome()));

        gatos.sort(Comparator.comparing((Gato::getNome))); //<-- Reference Method
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

    public String getNome(){
        return nome;
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
