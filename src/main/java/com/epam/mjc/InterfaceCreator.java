package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            List<Integer> list = new ArrayList<>();
            for (Integer i : x) {
                list.add(i / divider);
            }
            return list;

        };
    }
}
