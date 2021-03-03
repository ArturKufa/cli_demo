package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.Map;

public interface HuffmanStringReplacer {
    String replaceStringAccordingToTree (String source, Map<Character, String> encodedTree);
}
