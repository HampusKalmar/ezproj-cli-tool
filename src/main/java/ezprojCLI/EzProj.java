package ezprojCLI;

import java.util.Arrays;

import picocli.CommandLine;

public class EzProj {

  public static void main(String[] args) {
    if (args.length == 0 || !"ezproj".equals(args[0])) {
      System.out.println("Error: the ezproj command is required");
      System.exit(1);
    }

    args = Arrays.copyOfRange(args, 1, args.length);

    int exitCode = new CommandLine(new EzprojCommand()).execute(args);
    System.exit(exitCode);
  }
}
