package ezprojCLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "name", description = "Sets the name of the project.")
public class NameCommand implements Runnable {
    @Option(names = {"-n", "--name"}, description = "Sets the name of the project.")
    private String name;

    @Override
    public void run() {
        System.out.println("Creating a project named " + name + "...");
    }
}
