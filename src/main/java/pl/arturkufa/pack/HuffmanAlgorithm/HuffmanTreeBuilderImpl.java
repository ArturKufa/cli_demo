package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class HuffmanTreeBuilderImpl implements HuffmanTreeBuilder {


    @Override
    public Map<Character, String> buildTable(HuffmanNode root) {
        final Map<Character, String> huffmanTree = new HashMap<>();
        codeChar(root, "", huffmanTree);

        return huffmanTree;
    }

    private static void codeChar(HuffmanNode root, String str, Map<Character, String> huffmanTree) {

        if (root == null) {
            return;
        }

        if (isLeaf(root)) {
            huffmanTree.put(root.getC(), str.length() > 0 ? str : "1");
        }

        codeChar(root.getLeft(), str + '0', huffmanTree);
        codeChar(root.getRight(), str + '1', huffmanTree);
    }

    private static boolean isLeaf(HuffmanNode root) {
        return root.getLeft() == null && root.getRight() == null;
    }
}
