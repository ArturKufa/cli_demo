package pl.arturkufa.pack.HuffmanAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)

class HuffmanStringReplacerImplTest {

    private final HuffmanStringReplacer huffmanStringReplacer = new HuffmanStringReplacerImpl();
    @Test
    void shouldReplaceStringWithGivenMap() {
        String source = "ABCDeF5";
        Map<Character, String> encodedTree = new HashMap<>();
        encodedTree.put('A', "0");
        encodedTree.put('B', "01");
        encodedTree.put('C', "10");
        encodedTree.put('D', "11");
        encodedTree.put('e', "100");
        encodedTree.put('F', "101");
        encodedTree.put('5', "111");

        String encodedString = huffmanStringReplacer.replaceStringAccordingToTree(source, encodedTree);

        assertThat(encodedString).isEqualTo("0011011100101111");
    }
}