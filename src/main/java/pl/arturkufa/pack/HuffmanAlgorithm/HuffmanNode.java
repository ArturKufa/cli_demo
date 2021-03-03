package pl.arturkufa.pack.HuffmanAlgorithm;

public class HuffmanNode implements Comparable<HuffmanNode> {
    private Integer frequency;
    private Character c;
    private HuffmanNode left, right;

    HuffmanNode (Character c, int frequency, HuffmanNode left, HuffmanNode right) {
        this.c = c;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    HuffmanNode (int frequency, HuffmanNode left, HuffmanNode right) {
        this(null, frequency, left, right);
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Character getC() {
        return c;
    }

    public void setC(Character c) {
        this.c = c;
    }

    public HuffmanNode getLeft() {
        return left;
    }

    public void setLeft(HuffmanNode left) {
        this.left = left;
    }

    public HuffmanNode getRight() {
        return right;
    }

    public void setRight(HuffmanNode right) {
        this.right = right;
    }

    @Override
    public int compareTo(HuffmanNode o) {
        return this.getFrequency().compareTo(o.getFrequency());
    }
}


