package ezprojCLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "type", description = "Sets the type of the project.")
public class TypeCommand implements Runnable {

    @Option(names = {"-t", "--type"}, description = "Sets the type of the project.")
    private String projectType;


    @Override
    public void run() {
        System.out.println("Creating a project of type " + projectType + "...");
    }
}
