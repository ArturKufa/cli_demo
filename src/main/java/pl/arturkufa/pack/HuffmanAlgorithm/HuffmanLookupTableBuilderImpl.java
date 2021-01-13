package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class HuffmanLookupTableBuilderImpl implements HuffmanLookupTableBuilder {

    @Override
    public Map<Character, String> buildTable(HuffmanNode root) {
        final Map<Character, String> lookupTable = new HashMap<>();

        buildTableImpl(root, "", lookupTable);

        return lookupTable;
    }

    private void buildTableImpl(HuffmanNode root,
                                String s,
                                Map<Character, String> lookupTable) {

        if (root.getLeft() != null && root.getRight() != null) {
            buildTableImpl(root.getLeft(), s + '0', lookupTable);
            buildTableImpl(root.getRight(), s + '1', lookupTable);
        } else {
            lookupTable.put(root.getC(), s);
        }
    }
}
