package pl.arturkufa.pack.HuffmanAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.PriorityQueue;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)

class HuffmanNodePQCreatorTest {

    private final HuffmanNodePQCreator huffmanNodePQCreator = new HuffmanNodePQCreatorImpl();

    @Test
    void shouldReturnQueueInAscendingOrder() {
        HashMap<Character, Integer> testMap = new HashMap<>();
        testMap.put('a', 1);
        testMap.put('b', 3);
        testMap.put('c', 2);
        testMap.put('d', 4);

        PriorityQueue<HuffmanNode> q = huffmanNodePQCreator.createPQ(testMap);

        assertThat(q.size()).isEqualTo(4);
        assertThat(q.peek().getC()).isEqualTo('a');
        q.poll();
        assertThat(q.peek().getC()).isEqualTo('c');
        q.poll();
        assertThat(q.peek().getC()).isEqualTo('b');
        q.poll();
        assertThat(q.peek().getC()).isEqualTo('d');
    }



}