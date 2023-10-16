package ezprojCLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import projectCreation.CreateJavaScriptProj;

@Command(name = "ezproj", version = "ezproj 1.0.0", description = "Makes it easy to start new programming projects.", 
header = "Welcome to ezproj - the easy project starter.")
public class EzprojCommand implements Runnable {
  private CreateJavaScriptProj createJsProj = new CreateJavaScriptProj();
  
  @Option(names = {"-v", "--version"}, description = "Print version information and exit.")
  private boolean versionRequested;

  @Option(names = {"-h", "--help"}, description = "Print this help message and exit.")
  private boolean helpRequested;

  @Option(names = {"-t", "--type"}, description = "The type of project to create.")
  private String projectType;

  @Option(names = {"-n", "--name"}, description = "The name of the project.")
  private String projectName;

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

    if (projectType.equals("JavaScript") && (projectName != null && projectName.isEmpty() == false)) {
      createJsProj.jsGenerator();
    } else {
      System.out.println("Invalid project type. Please try again.");
    }
  }
}
