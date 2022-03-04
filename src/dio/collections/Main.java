package dio.collections;

import dio.collections.list.ListsDIO;
import dio.collections.list.exercicios.ex01.Ex01;
import dio.collections.list.ordenando.OrdenandoLists;
import dio.collections.map.MapsDIO;
import dio.collections.set.SetsDIO;
import dio.collections.set.ordenando.OrdenandoSets;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MapsDIO maps = new MapsDIO();
        SetsDIO sets = new SetsDIO();
        ListsDIO lists = new ListsDIO();
        OrdenandoSets setsOrdenados = new OrdenandoSets();
        OrdenandoLists listsOrdenadas = new OrdenandoLists();
        //lists.exercitandoLists();
        //listsOrdenadas.ordenacaoList();
        //sets.exercitandoSets();
        //setsOrdenados.ordenacaoSets();
        maps.exercitandoMaps();

        //Ex01 exercicio1 = new Ex01();
    }
}
