package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.*;

public class HuffmanNodePQCreatorImpl implements HuffmanNodePQCreator {

    @Override
    public PriorityQueue<HuffmanNode> createPQ(Map<Character, Integer> charMap) {
        PriorityQueue<HuffmanNode> temp = new PriorityQueue<>(charMap.size());
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {

            char character = entry.getKey();
            int frequency = entry.getValue();
            temp.add(new HuffmanNode(character, frequency, null, null));
        }

        return temp;
    }
}

