package pl.arturkufa.pack.HuffmanAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)

class HuffmanTreeBuilderImplTest {

    private final HuffmanTreeBuilder huffmanTreeBuilder = new HuffmanTreeBuilderImpl();
    private final HuffmanRootFinder huffmanRootFinder = new HuffmanRootFinderImpl();

    @Test
    void shouldBuildTree(){
        PriorityQueue<HuffmanNode> testQ = new PriorityQueue<>();
        testQ.add(new HuffmanNode('z', 1, null, null));
        testQ.add(new HuffmanNode('i', 2, null, null));
        testQ.add(new HuffmanNode('e', 1, null, null));
        testQ.add(new HuffmanNode('m', 1, null, null));
        testQ.add(new HuffmanNode('n', 1, null, null));
        testQ.add(new HuffmanNode('a', 1, null, null));
        testQ.add(new HuffmanNode('k', 1, null, null));
        HuffmanNode rootNode = huffmanRootFinder.findRoot(testQ);


        Map<Character, String> table = huffmanTreeBuilder.buildTable(rootNode);

        assertThat(table.get('z')).isEqualTo("110");
        assertThat(table.get('i')).isEqualTo("00");
        assertThat(table.get('e')).isEqualTo("011");
        assertThat(table.get('m')).isEqualTo("101");
        assertThat(table.get('n')).isEqualTo("010");
        assertThat(table.get('a')).isEqualTo("100");
        assertThat(table.get('k')).isEqualTo("111");
    }
}