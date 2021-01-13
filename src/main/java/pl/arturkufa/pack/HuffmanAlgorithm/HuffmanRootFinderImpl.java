package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.PriorityQueue;

public class HuffmanRootFinderImpl implements HuffmanRootFinder {
    @Override
    public HuffmanNode findRoot(PriorityQueue<HuffmanNode> q) {
        HuffmanNode root = null;
        while (q.size() > 1) {

            HuffmanNode x = q.peek();
            q.poll();
            HuffmanNode y = q.peek();
            q.poll();

            int xFreq = x.getFrequency();
            int yFreq = y.getFrequency();
            int newNodeFreq = xFreq + yFreq;

            HuffmanNode f = new HuffmanNode('-', newNodeFreq, x, y);
            root = f;
            q.add(f);

        }
        return root;
    }
}
