package pl.arturkufa.pack;

import picocli.CommandLine;

@CommandLine.Command(name = "CompressUtility",  mixinStandardHelpOptions = true,
        subcommands = { Compress.class,
                        Decompress.class,
                        CommandLine.HelpCommand.class },
        description = "Compressing / decompressing utility tool",
        version = "1.0")
public class CompressUtilityCommand implements Runnable{
    @CommandLine.Option(names = {"-d", "--debug"}, defaultValue = "false", description = "Print debug info",
                        scope = CommandLine.ScopeType.INHERIT)
    boolean printDebug;
    @Override
    public void run() {

    }
}
