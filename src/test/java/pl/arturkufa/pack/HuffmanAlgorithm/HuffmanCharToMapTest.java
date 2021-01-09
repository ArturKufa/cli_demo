package pl.arturkufa.pack.HuffmanAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)

class HuffmanCharToMapTest {

    HuffmanCharToMap huffmanCharToMap = new HuffmanCharToMap();

    @Test
    void shouldReturnArrayContainingSevenElements() {
        final String testString = "ziemniak";

        HashMap<Character, Integer> charMap = huffmanCharToMap.charToMap(testString);

        assertThat(charMap.size()).isEqualTo(7);
    }

    @Test
    void shouldReturnCorrectOccurrencesOfCharacter() {
        final String testString = "ziemniak";

        HashMap<Character, Integer> charMap = huffmanCharToMap.charToMap(testString);

        assertThat(charMap.get('i')).isEqualTo(2);
    }
}