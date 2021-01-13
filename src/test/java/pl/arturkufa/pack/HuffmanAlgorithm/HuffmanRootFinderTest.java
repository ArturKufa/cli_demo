package pl.arturkufa.pack.HuffmanAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.PriorityQueue;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class HuffmanRootFinderTest {

    private final HuffmanRootFinder huffmanRootFinder = new HuffmanRootFinderImpl();

    @Test
    void shouldAssignCorrectRoot() {

        PriorityQueue<HuffmanNode> testQ = new PriorityQueue<>();
        testQ.add(new HuffmanNode('z', 1, null, null));
        testQ.add(new HuffmanNode('i', 2, null, null));
        testQ.add(new HuffmanNode('e', 1, null, null));
        testQ.add(new HuffmanNode('m', 1, null, null));
        testQ.add(new HuffmanNode('n', 1, null, null));
        testQ.add(new HuffmanNode('a', 1, null, null));
        testQ.add(new HuffmanNode('k', 1, null, null));

        HuffmanNode rootNode = huffmanRootFinder.findRoot(testQ);
        assertThat(rootNode.getC()).isEqualTo('-');
        assertThat(rootNode.getFrequency()).isEqualTo(16);
    }

}