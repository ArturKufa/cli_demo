package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.Map;
import java.util.PriorityQueue;

public interface HuffmanNodePQCreator {
     PriorityQueue<HuffmanNode> createPQ (Map<Character, Integer> charMap);
}
