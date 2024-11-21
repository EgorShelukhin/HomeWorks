package homework2.Collections;

import java.util.*;

public class Task7 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 7, 2, 3, 3, 3, 7, 1));

        duplicates(list);

    }

    public static void duplicates(ArrayList<Integer> list) {

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (Integer i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Integer, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        }
    }