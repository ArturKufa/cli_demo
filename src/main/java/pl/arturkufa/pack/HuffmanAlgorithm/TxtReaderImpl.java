package pl.arturkufa.pack.HuffmanAlgorithm;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class TxtReaderImpl implements TxtReader {
    @Override
    public String readFile(String pathFile) {
        File f = new File(pathFile);
        try {
            byte[] bytes = Files.readAllBytes(f.toPath());
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
