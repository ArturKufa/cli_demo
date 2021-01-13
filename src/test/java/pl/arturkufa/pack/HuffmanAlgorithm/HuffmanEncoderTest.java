package pl.arturkufa.pack.HuffmanAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class HuffmanEncoderTest {

    private final HuffmanEncoder huffmanEncoder = new HuffmanEncoderImpl();

    @Test
    void shouldReturnMapOfEncodedCharacters() {
        String testString = "ziemniaki";

        Map<Character, String> result = huffmanEncoder.encode(testString);

        assertThat(result.get('z')).isEqualTo("000");
    }
}