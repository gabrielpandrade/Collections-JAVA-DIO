package dio.collections.list.ordenando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoLists {
    List<Gato> gatos = new ArrayList<>(){{
        add(new Gato("Jon", 18, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
        add(new Gato("Jon", 12, "amarelo"));
    }};

    public void ordenacaoList(){
        System.out.println("Pela ordem de inserção: ");
        System.out.println(gatos);
        System.out.println("Pela ordem aleatória: ");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("Pela ordem natural (Comparable): ");
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println("Pela ordem da idade: ");
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);
        System.out.println("Pela ordem de cor: ");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);
        System.out.println("Pela ordem Nome/idade/Cor: ");
        gatos.sort(new ComparatorNomeCoridade());
        System.out.println(gatos);
    }
}

class Gato implements Comparable<Gato> {

    private String nome;
    private Integer idade;
    private String cor;

    //Contrutor

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    //Setters e Getters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //toString


    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCoridade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
