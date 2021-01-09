package pl.arturkufa.pack.HuffmanAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanEncoder {

HuffmanCharToMap huffmanCharToMap = new HuffmanCharToMap();

    public String buildTree(String source) {

        HashMap<Character, Integer> charMap = huffmanCharToMap.charToMap(source);
        int mapSize = charMap.size();
        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(mapSize, new ImplementComparator());
        HuffmanNode root = null;

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            HuffmanNode hn = new HuffmanNode();

            hn.setC(entry.getKey());
            hn.setFrequency(entry.getValue());
            hn.setLeft(null);
            hn.setRight(null);
            q.add(hn);
        }

        while (q.size() > 1) {

            HuffmanNode x = q.peek();
            q.poll();
            HuffmanNode y = q.peek();
            q.poll();

            HuffmanNode f = new HuffmanNode();

            f.setFrequency(x.getFrequency() + y.getFrequency());;
            f.setC('-');
            f.setLeft(x);
            f.setRight(y);
            root = f;

            q.add(f);
        }
        //utworzyć mapę, która za klucz ma unikalną wartość a za wartość ma node
        return null;
    }
}
//serializable - do wykorzystania przy dołączenia drzewa do pliku