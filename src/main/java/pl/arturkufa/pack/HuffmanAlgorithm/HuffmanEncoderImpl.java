package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanEncoderImpl implements HuffmanEncoder {

    private final HuffmanCharToMap huffmanCharToMap = new HuffmanCharToMapImpl();
    private final HuffmanNodePQCreator huffmanNodePQCreator = new HuffmanNodePQCreatorImpl();
    private final HuffmanRootFinder huffmanRootFinder = new HuffmanRootFinderImpl();
    private final HuffmanLookupTableBuilder huffmanLookupTableBuilder = new HuffmanLookupTableBuilderImpl();

    @Override
    public Map<Character, String> encode(String source) {
        Map<Character, Integer> charMap = huffmanCharToMap.charToMap(source);
        PriorityQueue<HuffmanNode> charQueue = huffmanNodePQCreator.createPQ(charMap);
        HuffmanNode root = huffmanRootFinder.findRoot(charQueue);

        return huffmanLookupTableBuilder.buildTable(root);
        }
}
// do wygenerowania ostatecznego zakodowanego tekstu można użyć StringBuilder
