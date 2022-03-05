package dio.collections.stream.StremsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StreamsAPI {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprimir todos os elementos: ");
        System.out.println("Com classe anônima: ");
        numeros.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("Com lambda: ");
        numeros.forEach(s -> System.out.println(s));
        System.out.println("Com Reference Method: ");
        numeros.forEach(System.out::println);

        System.out.println("5 primeiros números para um Set: ");
        Set<String> collectSet = numeros.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(collectSet);

        System.out.println("Transformando uma lista de Strings para uma lista de Inteiros: ");
        List<Integer> numerosInteger = numeros.stream()
                .map(Integer::parseInt)
                .toList();
        System.out.println(numerosInteger);

        System.out.println("Colocando números pares e maiores que 2 em uma lista: ");
        List<Integer> paresMaiores2 = numeros.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .toList();
        System.out.println(paresMaiores2);

        System.out.println("A média dos números é: ");
        numeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Removendo os ímpares: ");
        List<Integer> emInteiros = numeros.stream()
                .map(Integer::parseInt)
                .toList();

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);
    }
}
