package com.okta.rest.springboot;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("seila", "valor1");
        map.put("seila2", "valor2");
        map.put("seila4", "valor4");
        map.put("seila3", "valor3");
        List<String> values = new ArrayList<>(map.values());
        System.out.println(values);
    }

}
