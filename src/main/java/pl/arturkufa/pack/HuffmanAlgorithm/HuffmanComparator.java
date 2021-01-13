package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.Comparator;
import java.util.Map;

public class HuffmanComparator implements Comparator<Map.Entry<Character, Integer>> {
    public int compare(Map.Entry<Character, Integer> x, Map.Entry<Character, Integer> y) {
        return y.getValue().compareTo(x.getValue());
    }
}

