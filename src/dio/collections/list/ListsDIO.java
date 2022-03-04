package dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListsDIO {
    private List<Double> notas = new ArrayList<>();

    public void exercitandoLists(){
        System.out.println("Lista criada...");
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println("Itens adicionados...");
        System.out.println("Lista: "+notas);
        System.out.println("Posição da nota 5.0: "+notas.indexOf(5d));
        System.out.println("Adicinando 8.0 ma posição 4...");
        notas.add(4, 8d);
        System.out.println("Adicionado...");
        System.out.println("Lista: "+notas);
        System.out.println("Substituindo a nota 5.0 por 6.0...");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println("Substituído...");
        System.out.println("Lista: "+notas);
        System.out.println("Conferindo se contém 5.0 ...");
        System.out.println("A lista contém 5.0? "+notas.contains(5d));
        System.out.println("Imprimento a lista na ordem em que as notas foram colocadas... ");
        System.out.println("Lista: "+notas.toString());
        System.out.println("Exibindo o terceiro elemento...");
        System.out.println("Terceiro elemento: "+notas.get(2));
        System.out.println("Exibindo a menor nota...");
        System.out.println("Menor nota: "+ Collections.min(notas));
        System.out.println("Exibindo a maior nota...");
        System.out.println("Maior nota: "+Collections.max(notas));
        System.out.println("Exibindo a soma dos valores...");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores da lista: "+soma);
        System.out.println("exibindo a média das notas...");
        System.out.println("Média: "+(soma/notas.size()));
        System.out.println("Removendo a nota 0.0 ...");
        notas.remove(0d);
        System.out.println("Removida, Lista: "+notas.toString());
        System.out.println("Removendo as notas menores que 7...");
        notas.removeIf(next -> next < 7d);
        System.out.println("Removidas, Lista: "+notas);
        System.out.println("Apagando toda a lista...");
        notas.clear();
        System.out.println("Apagada, Lista: "+notas);
        System.out.println("A lista está vazia? "+notas.isEmpty());
    }
}
