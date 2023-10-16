package projectCreation;

import com.projectgenerator.api.ProjectGeneratorAPI;
import java.lang.ProcessBuilder;

public class CreateJavaScriptProj {
  private ProjectGeneratorAPI projectGenerator = new ProjectGeneratorAPI();
  private ProcessBuilder process = new ProcessBuilder();

  private void createJavaScriptDirectories() {
    try {
      String[] directories = {"src", "src/.js", "src/css"};
      for (String directory : directories) {
        projectGenerator.createDirectory("/", directory);
      }
    } catch (Exception e) {
      System.out.println("Error creating directories: " + e);
    }
  }

  private void createJavaScriptFiles() {
    try {
      String[] files = {"README.md", "index.html", "index.js"};
      for (String file : files) {
        projectGenerator.createFileWithContent("/", file, "Automatic file creation by ezproj " + file);
      }
    } catch (Exception e) {
      System.out.println("Error creating files: " + e);
    }
  }

  private void runNpm(String rootDirectory) {
    String os = System.getProperty("os.name").toLowerCase();
    if (os.contains("win")) {
      process.command(rootDirectory, "cmd.exe", "/c", "npm init -y");
    } else {
      process.command(rootDirectory, "sh", "-c", "npm init -y");
    }
  }

  private void buildProject() {
    runNpm("/");
  }

  public void jsGenerator() {
    createJavaScriptDirectories();
    createJavaScriptFiles();
    buildProject();
  }
}
