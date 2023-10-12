package ezprojCLI;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "ezproj", version = "ezproj 1.0.0", description = "Make it easy to start new programming projects.")
public class EzprojCommand implements Runnable {
  
  @Option(names = {"-v", "--version"}, description = "Print version information and exit.")
  private boolean versionRequested;

  @Option(names = {"-h", "--help"}, description = "Print this help message and exit.")
  private boolean helpRequested;

  @Ovveride
  public void run() {
    if (versionRequested) {
      CommandLine.usage(this, System.out);
      return;
    }

    if (helpRequested) {
      CommandLine.usage(this, System.out);
      return;
    }
  }
}
