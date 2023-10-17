package projectCreation;

import com.projectgenerator.api.ProjectGeneratorAPI;
import java.lang.ProcessBuilder;

public class CreateJavaScriptProj {
  private ProjectGeneratorAPI projectGenerator = new ProjectGeneratorAPI();
  private final String BASE_DIRECTORY = System.getProperty("user.dir");
  private ProcessBuilder process;
  private String projectName;

  public CreateJavaScriptProj(String projectName) {
    if (projectName == null) {
      throw new IllegalArgumentException("Project name cannot be null.");
    }
    this.projectName = projectName;
  }

  public void jsGenerator() {
    createJavaScriptDirectories();
    createJavaScriptFiles();
    buildProject();
  }

  private void createJavaScriptDirectories() {
    projectGenerator.createDirectory(BASE_DIRECTORY, projectName);
    String[] directories = {"src", "src/js", "src/css"};
    for (String directory : directories) {
      projectGenerator.createDirectory(BASE_DIRECTORY + "/" + projectName, directory);
    }
  }

  private void createJavaScriptFiles() {
    String[] files = {"README.md", ".gitignore", "src/index.html", "src/js/index.js", "src/css/style.css"};
    for (String file : files) {
      projectGenerator.createFileWithContent(BASE_DIRECTORY + "/" + projectName, file, "// Automatic file creation by ezproj.");
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
}
