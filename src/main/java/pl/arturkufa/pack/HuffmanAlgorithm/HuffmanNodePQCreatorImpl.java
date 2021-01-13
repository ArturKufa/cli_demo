package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.*;

public class HuffmanNodePQCreatorImpl implements HuffmanNodePQCreator {

    @Override
    public PriorityQueue<HuffmanNode> createPQ(Map<Character, Integer> charMap) {

            int charMapSize = charMap.size();
            PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>(charMapSize, new HuffmanComparator());

            for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
                q.add(entry);
            }
        PriorityQueue<HuffmanNode> temp = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> e : q) {

            char character = e.getKey();
            int frequency = e.getValue();

            temp.add(new HuffmanNode(character, frequency, null, null));
        }
        return temp;
    }
}

