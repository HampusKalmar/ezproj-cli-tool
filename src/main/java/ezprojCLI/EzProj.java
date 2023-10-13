package ezprojCLI;

import picocli.CommandLine;

public class EzProj {

  public static void main(String[] args) {
    //CommandLine commandLine = new CommandLine(new EzprojCommand());
    //CommandLine commandLine2 = new CommandLine(new NameCommand());
    CommandLine commandLine3 = new CommandLine(new TypeCommand());

    //commandLine.execute("-h");
    //commandLine2.execute("-n", "my-project");
    commandLine3.execute("-t", "Java");
  }
}
