package projectCreation;

import com.projectgenerator.api.ProjectGeneratorAPI;
import java.lang.ProcessBuilder;

public class CreateJavaScriptProj {
  private ProjectGeneratorAPI projectGenerator = new ProjectGeneratorAPI();
  private ProcessBuilder process = new ProcessBuilder();

  public void createJavaScriptDirectories() {
    projectGenerator.createDirectory("/", "src");
    projectGenerator.createDirectory("src/", "js");
    projectGenerator.createDirectory("src/", "css");
  }


  public void createJavaScrippFiles() {
    projectGenerator.createFileWithContent("/", "REAMDE.md", "Automatically generated README.md file.");
    projectGenerator.createFileWithContent("src/", "index.html", "Automatically generated index.html file.");
    projectGenerator.createFileWithContent("src/js/", "index.js", "Automatically generated main.js file.");
  }

  public void runNpm(String rootDirectory) {
    String os = System.getProperty("os.name").toLowerCase();
    if (os.contains("win")) {
      process.command(rootDirectory, "cmd.exe", "/c", "npm init -y");
    } else {
      process.command(rootDirectory, "sh", "-c", "npm init -y");
    }
  }

  public void buildProject() {
    
  }
}
