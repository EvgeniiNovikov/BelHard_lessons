//Задание 32
//Имеется текст. Следует составить для него частотный словарь.

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        String text = "Я Колобок, Колобок, я по коробу скребен, По сусеку метен, На сметане мешон";
        Map<String, Integer> map = new HashMap<>();

        String[] words = text.toLowerCase().trim().split("[[,;:.!?\\]\\s]]+");
        List<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, words);
        for (String s : wordList) {
            System.out.print(s + " ");
        }
        System.out.println("\nМАПА: ");

        wordsRep(wordList, map);

        for (Map.Entry<String, Integer> p : map.entrySet()) {
            String key = p.getKey();
            Integer value = p.getValue();
            System.out.println(key + " " + value);
        }
    }

    public static void wordsRep(List<String> list, Map<String, Integer> map) {
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (String s : list) {
                if (list.get(i).equals(s)) {
                    count++;
                }
                map.put(list.get(i), count);
            }
        }
    }
}


//        for (int i = 0; i < wordList.size(); i++) {
//            count = 0;
//            for (int j = 0; j < wordList.size(); j++) {
//                if (wordList.get(i).equals(wordList.get(j))) {
//                    count++;
//                }
//                map.put(wordList.get(i), count);
//            }
//        }
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < wordList.size(); i++) {
//            map.put(wordList.get(i), wordsRep(wordList));
//        }
