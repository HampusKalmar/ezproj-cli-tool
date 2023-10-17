package ezprojCLI;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import projectCreation.CreateJavaProj;
import projectCreation.CreateJavaScriptProj;

@Command(name = "ezproj", description = "Makes it easy to start new programming projects.", 
header = "Welcome to ezproj - the easy project starter.")
public class EzprojCommand implements Runnable {
  private CreateJavaScriptProj createJsProj;
  private CreateJavaProj createJavaProj;
  
  @Option(names = {"-v", "--version"}, description = "Print version info and exit.")
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

    if ("JavaScript".equals(projectType) && projectName != null) {
      createJsProj = new CreateJavaScriptProj(projectName);
      createJsProj.jsGenerator();
    }

    if ("Java".equals(projectType) && projectName != null) {
      createJavaProj = new CreateJavaProj(projectName);
      createJavaProj.javaGenerator();
    }
  }
}
