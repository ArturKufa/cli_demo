package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.HashMap;

public class HuffmanCharToMapImpl implements HuffmanCharToMap {
    @Override
    public HashMap<Character, Integer> charToMap(String source) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
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
