package pl.arturkufa.pack;


import picocli.CommandLine;

import java.io.File;

@CommandLine.Command(name = "decompress", version = "1.0", mixinStandardHelpOptions = true)
public class Decompress implements Runnable {

    @CommandLine.Parameters(arity = "1..*", paramLabel = "<file>",
            description = "file(s) to be decompressed")
    File[] files;

    @Override
    public void run() {
        System.out.println("Implement me!");
    }
}
