package dio.collections.set;

import java.util.*;

public class SetsDIO {
    public void exercitandoSets(){
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Exibindo a posição da nota 5.0...");
        System.out.println("Naõ é possível encontrar a posição no Set...");
        System.out.println("Adincinando a nota 8.0 na posição 4...");
        System.out.println("Naõ é possível encontrar a posição no Set...");
        System.out.println("Substituindo a nota 5.0 pela nota 6.0..");
        System.out.println("Naõ é possível substituir elementos no Set...");
        System.out.println("Conferindo se o Set contém 5.0...");
        System.out.println("O set tem 5.0? "+notas.contains(5d));
        System.out.println("Exibindo a terceira nota adicionada...");
        System.out.println("Naõ é possível encontrar a posição no Set...");
        System.out.println("Exibindo a menor nota: "+ Collections.min(notas));
        System.out.println("Exibindo a maior nota: "+Collections.max(notas));
        System.out.println("Calculando a soma dos elementos");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: "+soma);
        System.out.println("A média das notas foi de: "+soma/notas.size());
        System.out.println("Removendo a nota 0...");
        notas.remove(0d);
        System.out.println("Nota removida: "+notas);
        System.out.println("Removendo a nota na posição 0...");
        System.out.println("Naõ é possível encontrar a posição no Set...");
        System.out.println("Removendo as notas menores que 7...");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator1.next();
            if (next<7)
                iterator.remove();
        }
        System.out.println("Exibindo as notas na ordem que foram informadas (LinkedHashSet)...");
        Set<Double> notasLinked= new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notasLinked);
        Set<Double> notasTree = new TreeSet<>(notasLinked);
        System.out.println("Exibindo na ordem crescente (TreeSet): "+notasTree);
        System.out.println("Apagando o primeiro conjunto...");
        notas.clear();
        System.out.println("Notas (Set): "+notas);
        System.out.println("O primeiro conjunto está vazio? "+notas.isEmpty());
    }
}
