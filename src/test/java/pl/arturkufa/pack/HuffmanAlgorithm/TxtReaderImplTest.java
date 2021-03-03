package pl.arturkufa.pack.HuffmanAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class TxtReaderImplTest {

    private final TxtReader txtReader = new TxtReaderImpl();

    @Test
    void shouldReturnStringFromFile(){
        String testString = txtReader.readFile("C:/Users/dpast//Desktop/Projekty Github/cli_demo/src/test/java/pl/arturkufa/pack/HuffmanAlgorithm/testowyPliczek.txt");

        assertThat(testString).isEqualTo("\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"");
    }
}