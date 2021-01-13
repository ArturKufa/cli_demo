package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.Map;

public interface HuffmanLookupTableBuilder {
    Map<Character, String> buildTable (HuffmanNode root);
}
