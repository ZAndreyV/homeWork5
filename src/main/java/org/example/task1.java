package org.example;

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<String, String> telMap = new HashMap<>();
        telMap.put("2345", "Светлана Петрова");
        telMap.put("6544", "Светлана Петрова");
        telMap.put("3421", "Кристина Белова");
        telMap.put("7565", "Анна Мусина");
        telMap.put("4332", "Анна Мусина");
        telMap.put("6645", "Анна Мусина");
        telMap.put("2342", "Анна Крутова");
        telMap.put("8674", "Иван Юрин");
        telMap.put("5423", "Петр Лыков");
        telMap.put("9956", "Павел Чернов");
        telMap.put("9756", "Петр Чернышов");
        telMap.put("2134", "Петр Чернышов");
        telMap.put("4932", "Мария Федорова");
        for (Map.Entry<String, String> entry : telMap.entrySet()) {
            System.out.printf("%s\t->\t\t%s%n", entry.getKey(), entry.getValue());
        }
        Map<String, Integer> result = sortedAmoutOfRepeat(telMap);
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    private static HashMap<String, Integer> sortedAmoutOfRepeat(Map<String, String> hm) {
        HashMap<String, Integer> sortedAmoutOfRepeat = new HashMap<>();
        for (String name : hm.values()) {
            if (sortedAmoutOfRepeat.containsKey(name)){
                String key = name;
                Integer value = sortedAmoutOfRepeat.get(name);
                sortedAmoutOfRepeat.replace(name, value + 1);

            } else {
                sortedAmoutOfRepeat.put(name, 1);
            }
        }
        return sortedAmoutOfRepeat;
    }
}
