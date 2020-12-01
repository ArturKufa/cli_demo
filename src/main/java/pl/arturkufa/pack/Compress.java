package pl.arturkufa.pack;

import picocli.CommandLine;

import java.io.File;

@CommandLine.Command(name = "compress", version = "1.0")
public class Compress implements Runnable{

    @CommandLine.Option(names = {"-t", "--timestamp"},
                        description = "Adding timestamp to name of compressed file." +
                        " Preventing of overriding files because of same the file name. ",
                        defaultValue = "false")
    private boolean addTimestamp; //todo przetestowac czy koniecxne jest dopisywanie =false

    @CommandLine.Option(names = {"-a", "--algorithm"},
            description = "Choosing algorithm to compress file. ",
            defaultValue = "TR")
    private Algorithm algorithm;

    @CommandLine.Parameters(arity = "1..*", paramLabel = "<file>",
            description = "file(s) to be compressed")
    File[] files;

    @Override
    public void run() {
        System.out.println("Implement me!");
    }
}
