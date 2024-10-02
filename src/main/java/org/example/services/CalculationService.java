package org.example.services;

import java.util.List;

public class CalculationService {
    //Fazendo o metódo receber um tipo "T" qualquer, extendendo da interface Comparable seus metódos, assim
    //dando continuidade ao código
    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
