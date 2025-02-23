package one123;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class LetterCount {
    public static void main(String[] args){
        String str = "khsodrkirge";
        Map<Character, Integer> hashmap = str.chars().mapToObj(c -> (char)c).collect(Collectors.toMap(e -> e, e -> 1, (old, latest) -> old + latest));
        System.out.println(hashmap);
        LinkedHashMap<Character, Integer> link = str.chars().mapToObj(c -> (char)c).collect(Collectors.toMap(e -> e, e -> 1, (old, latest) -> old +latest, LinkedHashMap::new));
        System.out.println(link);
        TreeMap<Character, Integer> tree = str.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(e -> e, e -> 1, (old, latest) -> old + latest, TreeMap::new));
        System.out.println(tree);
    }
}
