package ezprojCLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import projectCreation.CreateJavaProj;
import projectCreation.CreateJavaScriptProj;

/**
 * The `EzprojCommand` class provides command-line options for starting new programming projects
 * easily using the 'ezproj' command.
 *
 * @author Hampus Tuisku
 * @version 1.0.0
 */
@Command(name = "ezproj", description = "Makes it easy to start new programming projects.", 
header = "Welcome to ezproj - the easy project starter.")
public class EzprojCommand implements Runnable {
  private CreateJavaScriptProj createJsProj;
  private CreateJavaProj createJavaProj;
  
  @Option(names = {"-v", "--version"}, description = "Print version info and exit.")
  private boolean isVersionRequested;

  @Option(names = {"-h", "--help"}, description = "Print this help message and exit.")
  private boolean isHelpRequested;

  @Option(names = {"-t", "--type"}, description = "The type of project to create.")
  private String projectType;

  @Option(names = {"-n", "--name"}, description = "The name of the project.")
  private String projectName;

  /**
   * Executes the 'ezproj' command based on the provided options.
   */
  @Override
  public void run() {
    if (isVersionRequested) {
      System.out.println("ezproj 1.0.0");
      return;
    }

    if (isHelpRequested) {
      System.out.println("To create a Java project: ezproj -t Java --name <project-name>");
      System.out.println("To create a JavaScript project: ezproj -t JavaScript --name <project-name>");
      return;
    }

    if ("javascript".equals(projectType) && projectName != null) {
      createJsProj = new CreateJavaScriptProj(projectName);
      createJsProj.jsGenerator();
    }

    if ("java".equals(projectType) && projectName != null) {
      createJavaProj = new CreateJavaProj(projectName);
      createJavaProj.javaGenerator();
    }
  }
}
