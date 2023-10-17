package ezprojCLI;

import picocli.CommandLine;

public class EzProj {

  public static void main(String[] args) {
    int exitCode = new CommandLine(new EzprojCommand()).execute(args);
    System.exit(exitCode);
  }
}
