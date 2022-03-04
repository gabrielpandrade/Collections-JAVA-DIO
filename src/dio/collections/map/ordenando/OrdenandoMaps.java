package dio.collections.map.ordenando;

import java.util.*;

public class OrdenandoMaps {
    public void ordenacaoMap(){
        Map<String, Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Hsitória do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};
        System.out.println("Ordem Aleatória: ");
        for (Map.Entry<String, Livro> livro :
                livros.entrySet()) {
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }
        System.out.println("Ordem de Inserção: ");
        Map<String, Livro> livrosLinked = new LinkedHashMap<>(livros);
        for (Map.Entry<String, Livro> livro :
                livrosLinked.entrySet()) {
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }
        System.out.println("Ordem Alfabética dos Autores: ");
        Map<String, Livro> livrosTree = new TreeMap<>(livros);
        for (Map.Entry<String, Livro> livro :
                livrosTree.entrySet()) {
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }
        Set<Map.Entry<String, Livro>> livrosSet = new TreeSet<>(new ComparatorNome());
        livrosSet.addAll(livros.entrySet());
        System.out.println("Ordem Alfabética (Livro): ");
        for (Map.Entry<String, Livro> livro :
                livrosSet) {
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }
    }
}

class Livro{
    private String nome;
    private Integer pag;

    public Livro(String nome, Integer pag) {
        this.nome = nome;
        this.pag = pag;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPag() {
        return pag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && pag.equals(livro.pag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, pag);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", pag=" + pag +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}
