package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanEncoderImpl implements HuffmanEncoder{
    private final TxtReader txtReader = new TxtReaderImpl();
    private final HuffmanCharToMap huffmanCharToMap = new HuffmanCharToMapImpl();
    private final HuffmanNodePQCreator huffmanNodePQCreator = new HuffmanNodePQCreatorImpl();
    private final HuffmanRootFinder huffmanRootFinder = new HuffmanRootFinderImpl();
    private final HuffmanTreeBuilder huffmanTreeBuilder = new HuffmanTreeBuilderImpl();
    private final HuffmanStringReplacer huffmanStringReplacer = new HuffmanStringReplacerImpl();

    @Override
    public String encode(String filePath) {
        String source = txtReader.readFile(filePath);
        Map<Character, Integer> charMap = huffmanCharToMap.charToMap(source);
        PriorityQueue<HuffmanNode> charQueue = huffmanNodePQCreator.createPQ(charMap);
        HuffmanNode root = huffmanRootFinder.findRoot(charQueue);
        Map<Character, String> encodedTree = huffmanTreeBuilder.buildTable(root);

        return huffmanStringReplacer.replaceStringAccordingToTree(source, encodedTree);
        }
}
