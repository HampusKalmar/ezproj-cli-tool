package ezprojCLI;

import picocli.CommandLine;

/**
 * The main class that runs the program.
 */
public class EzProj {

  /**
   * The main method that runs the program.
   *
   * @param args The arguments passed in by the user.
   */
  public static void main(String[] args) {
    int exitCode = new CommandLine(new EzprojCommand()).execute(args);
    System.exit(exitCode);
  }
}
