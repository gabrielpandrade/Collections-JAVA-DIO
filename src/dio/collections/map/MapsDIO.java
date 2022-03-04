package dio.collections.map;

import java.util.*;

public class MapsDIO {
    public void exercitandoMaps(){
        Map<String, Double> carros = new HashMap<>(){{
            put("Gol", 14.4d);
            put("Uno", 15.6d);
            put("MOBI", 16.1d);
            put("hb20", 14.5d);
            put("Kwid", 15.6d);
        }};
        System.out.println(carros.toString());
        System.out.println("Substituindo o consumo do gol...");
        carros.put("Gol", 15.2);
        System.out.println(carros);
        System.out.println("O Tucson está no dicionário? "+carros.containsKey("Tucson"));
        System.out.println("Consumo do Uno: "+carros.get("Uno"));
        System.out.println("Não é possivel verificar a ordem de inserção no hashmap...");
        System.out.println("Carros: "+carros.keySet());
        System.out.println("Consumo dos Carros:"+carros.values());
        System.out.println("O modelo mais econômico faz: "+ Collections.max(carros.values()));
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloEco = "";
        for (Map.Entry<String, Double> entry:
            entries){
            if (entry.getValue().equals(Collections.max(carros.values())))
                modeloEco = entry.getKey();
        }
        System.out.println("O modelo mais econômico é: "+modeloEco);
        Double menorEcoValor = Collections.min(carros.values());
        String menosEco="";
        for (Map.Entry<String, Double> entry :
                entries) {
            if (entry.getValue().equals(menorEcoValor))
                menosEco = entry.getKey();
        }
        System.out.println("O modelo menos eficiente é "+menosEco+" fazendo "+menorEcoValor);
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext())
            soma += iterator.next();
        System.out.println("A soma dos consumos é "+soma);
        System.out.println("A média dos consumos é: "+soma/carros.size());
        carros.values().removeIf(aDouble -> aDouble.equals(15.6));
        System.out.println(carros);
        Map<String, Double> carrosLinked = new LinkedHashMap<>(){{
            put("Gol", 14.4d);
            put("Uno", 15.6d);
            put("MOBI", 16.1d);
            put("Hb20", 14.5d);
            put("Kwid", 15.6d);
        }};
        System.out.println(carrosLinked);
        Map<String, Double> carrosTree = new TreeMap<>(carrosLinked);
        System.out.println(carrosTree);
        carros.clear();
        carros.isEmpty();
    }
}
