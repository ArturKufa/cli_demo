package pl.arturkufa.pack.HuffmanAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Map;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class HuffmanComparatorTest {

    private final HuffmanComparator<Character,Integer> huffmanComparator = new HuffmanComparator<>();

    @Test
    void shouldReturnOneWithBiggerInteger() {

        Map.Entry<Character,Integer> entry1 = mock(Map.Entry.class);
        Map.Entry<Character,Integer> entry2 = mock(Map.Entry.class);

        when(entry1.getValue()).thenReturn(12);
        when(entry2.getValue()).thenReturn(20);

        int endValue = huffmanComparator.compare(entry1, entry2);
        assertThat(endValue).isEqualTo(1);
    }

    @Test
    void shouldReturnZeroWithSameInteger() {

        Map.Entry<Character,Integer> entry3 = mock(Map.Entry.class);
        Map.Entry<Character,Integer> entry4 = mock(Map.Entry.class);

        when(entry3.getValue()).thenReturn(12);
        when(entry4.getValue()).thenReturn(12);

        int endValue = huffmanComparator.compare(entry3, entry4);
        assertThat(endValue).isEqualTo(0);
    }

    @Test
    void shouldReturnMinusWithLesserInteger() {

        Map.Entry<Character,Integer> entry5 = mock(Map.Entry.class);
        Map.Entry<Character,Integer> entry6 = mock(Map.Entry.class);

        when(entry5.getValue()).thenReturn(20);
        when(entry6.getValue()).thenReturn(12);

        int endValue = huffmanComparator.compare(entry5, entry6);
        assertThat(endValue).isEqualTo(-1);
    }
}