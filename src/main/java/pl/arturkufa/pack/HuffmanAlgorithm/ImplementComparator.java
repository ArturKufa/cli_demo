package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.Comparator;

public class ImplementComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.getFrequency() - y.getFrequency();
    }
}
