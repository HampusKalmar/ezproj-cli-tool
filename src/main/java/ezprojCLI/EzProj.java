package ezprojCLI;

import picocli.CommandLine;

public class EzProj {

  public static void main(String[] args) {
    CommandLine commandLine = new CommandLine(new EzprojCommand());
    commandLine.execute(args);
  }
}
