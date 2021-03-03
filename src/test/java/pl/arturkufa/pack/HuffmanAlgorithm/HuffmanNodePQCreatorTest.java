package pl.arturkufa.pack.HuffmanAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;
import java.util.stream.Collectors;

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
        assertThat(q.poll().getC()).isEqualTo('a');
        assertThat(q.poll().getC()).isEqualTo('c');
        assertThat(q.poll().getC()).isEqualTo('b');
        assertThat(q.poll().getC()).isEqualTo('d');
    }

    @Test
    void shouldReturnQueue() {
        List<String> strings = Arrays.asList("stare", "kurwy", "jebac", "prondem", "HEHE");
        String connected = "";
        for (String s : strings) {
            if(s.length() == 5){
                String upperCased = s.toUpperCase();
                connected += upperCased + " ";
            }
        }
        System.out.println(connected);
    }

    @Test
    void shouldReturnQueue2() {
        List<String> strings = Arrays.asList("stare", "kurwy", "jebac", "prondem", "HEHE");
        String result = strings.stream().filter(s -> s.length() == 5).map(String::toUpperCase).collect(Collectors.joining(" "));
        System.out.println(result);
    }

//dla słowa któego długość = 5 podnieś go do upperCase, a następnie wszystko złącz w jeden string złączony spacjami

}