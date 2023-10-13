package ezprojCLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "ezproj", version = "ezproj 1.0.0", description = "Makes it easy to start new programming projects.", 
header = "Welcome to ezproj - the easy project starter.")
public class EzprojCommand implements Runnable {
  
  @Option(names = {"-v", "--version"}, description = "Print version information and exit.")
  private boolean versionRequested;

  @Option(names = {"-h", "--help"}, description = "Print this help message and exit.")
  private boolean helpRequested;

  @Override
  public void run() {
    if (versionRequested) {
      System.out.println("ezproj 1.0.0");
      return;
    }

    if (helpRequested) {
      System.out.println("To create a Java project: ezproj -t Java --name <project-name>");
      System.out.println("To create a JavaScript project: ezproj -t JavaScript --name <project-name>");
      return;
    }
  }
}
