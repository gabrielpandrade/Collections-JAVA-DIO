package dio.collections.set.ordenando;

import java.util.*;

public class OrdenandoSets {
    public void ordenacaoSets(){
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("GOT", "Dark Fantasy", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s Show", "Comédia", 25));
        }};
        System.out.println("Ordem Aleatória: ");
        for (Serie serie :
                series) {
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoEp());
        }
        System.out.println("Ordem de Inserção (LinkedHashSet): ");
        Set<Serie> seriesLinked = new LinkedHashSet<>(){{
            add(new Serie("GOT", "Dark Fantasy", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s Show", "Comédia", 25));
        }};
        for (Serie serie :
                seriesLinked) {
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoEp());
        }
        System.out.println("Ordem Natural (Tempo de episódio): ");
        Set<Serie> seriesTree = new TreeSet<>(seriesLinked);
        for (Serie serie :
                seriesTree) {
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoEp());
        }
        System.out.println("Ordem Nome/Gênero/TempoEpisódio: ");
        Set<Serie> seriesTreeOrdenada = new TreeSet<>(new ComparatorNomeGeneroTempo());
        seriesTreeOrdenada.addAll(series);
        for (Serie serie :
                seriesTreeOrdenada) {
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempoEp());
        }
    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEp;

    public Serie(String nome, String genero, Integer tempoEp) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEp = tempoEp;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEp() {
        return tempoEp;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEp=" + tempoEp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEp.equals(serie.tempoEp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEp);
    }

    @Override
    public int compareTo(Serie o) {
        int tempoEp = Integer.compare(this.getTempoEp(), o.getTempoEp());
        if (tempoEp != 0)
            return tempoEp;
        return this.getGenero().compareToIgnoreCase(o.getGenero());
    }
}

class ComparatorNomeGeneroTempo implements Comparator<Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome!=0)
            return nome;
        int genero = o1.getGenero().compareToIgnoreCase(o2.getGenero());
        if (genero!=0)
            return genero;
        return Integer.compare(o1.getTempoEp(), o2.getTempoEp());
    }
}
