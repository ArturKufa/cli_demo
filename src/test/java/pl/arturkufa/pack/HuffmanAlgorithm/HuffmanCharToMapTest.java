package pl.arturkufa.pack.HuffmanAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)

class HuffmanCharToMapTest {

    private final HuffmanCharToMapImpl huffmanCharToMap = new HuffmanCharToMapImpl();

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

    @Test
    void shouldReturnNullWhenCharNotFound() {
        final String testString = "ziemniak";

        HashMap<Character, Integer> charMap = huffmanCharToMap.charToMap(testString);

        assertThat(charMap.get('f')).isEqualTo(null);
    }

    @Test
    void shouldDistinctBetweenUpperAndLowerCase(){
        final String testString = "zIemniak";

        HashMap<Character, Integer> charMap = huffmanCharToMap.charToMap(testString);

        assertThat(charMap.get('I')).isEqualTo(1);
        assertThat(charMap.get('i')).isEqualTo(1);
    }

    @Test
    void shouldCountSpaceAsChar() {
        final String testString = "ziem niak";

        HashMap<Character, Integer> charMap = huffmanCharToMap.charToMap(testString);

        assertThat(charMap.get(' ')).isEqualTo(1);
    }

    //napisać test na liczbę
}