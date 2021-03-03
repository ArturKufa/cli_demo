package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.Map;

public class HuffmanStringReplacerImpl implements HuffmanStringReplacer {
    @Override
    public String replaceStringAccordingToTree(String source, Map<Character, String> encodedTree) {
        StringBuilder encoder = new StringBuilder(source.length());

        for (int i = 0; i < source.length(); i++) {
            Character charToEncode = source.charAt(i);
            String encodedChar = encodedTree.get(charToEncode);
            encoder.append(encodedChar);
        }

        return encoder.toString();
    }
}
