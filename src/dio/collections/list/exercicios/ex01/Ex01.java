package dio.collections.list.exercicios.ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex01 {
    List<TemperaturaMedia> mediasMensais = new ArrayList<>(){{
        add(new TemperaturaMedia("Janeiro", 27d));
        add(new TemperaturaMedia("Fevereiro", 32d));
        add(new TemperaturaMedia("Março", 25d));
        add(new TemperaturaMedia("Abril", 28d));
        add(new TemperaturaMedia("Maio", 19d));
        add(new TemperaturaMedia("Junho", 16d));
    }};

    public Ex01() {
        acimaDaMedia(this.mediasMensais);
    }

    public void acimaDaMedia(List<TemperaturaMedia> mediasMensais){
        double somaTotal = 0;
        for (TemperaturaMedia mediaMensal:
             mediasMensais) {
            somaTotal += mediaMensal.getMedia();
        }
        double mediaSemestral = somaTotal / mediasMensais.size();
        for (TemperaturaMedia mes:
             mediasMensais) {
            if (mes.getMedia()>mediaSemestral){
                System.out.printf("O mês de %s teve uma média de %.1f°C estando %.1f°C acima da média semestral de %.1f°C\n",
                        mes.getMes(), mes.getMedia(), (mes.getMedia()-mediaSemestral), mediaSemestral);
            }
        }
    }
}

class TemperaturaMedia{
    private String mes;
    private Double media;

    public TemperaturaMedia(String mes, Double media) {
        this.mes = mes;
        this.media = media;
    }

    public String getMes() {
        return mes;
    }

    public Double getMedia() {
        return media;
    }
}
