package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.List;
import java.util.Map;


public interface HuffmanTreeBuilder {
    Map<Character, String> buildTable (HuffmanNode root);
}
