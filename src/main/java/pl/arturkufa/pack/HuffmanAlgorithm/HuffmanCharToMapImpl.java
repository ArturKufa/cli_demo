package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.LinkedHashMap;

public class HuffmanCharToMapImpl implements HuffmanCharToMap {
    @Override
    public LinkedHashMap<Character, Integer> charToMap(String source) {
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();
        char[] strArray = source.toCharArray();

        for (char c : strArray) {

            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }
}
