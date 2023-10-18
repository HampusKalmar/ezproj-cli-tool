package projectCreation;

import com.projectgenerator.api.ProjectGeneratorAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creates a JavaScript project.
 */
public class CreateJavaScriptProj {
  private ProjectGeneratorAPI projectGenerator = new ProjectGeneratorAPI();
  private final String BASE_DIRECTORY = System.getProperty("user.dir");
  private String projectName;

  /**
   * Constructor for the CreateJavaScriptProj class.
   *
   * @param projectName The name of the project.
   * @throws IllegalArgumentException if the project name is null.
   */
  public CreateJavaScriptProj(String projectName) {
    if (projectName == null) {
      throw new IllegalArgumentException("Project name cannot be null.");
    }
    this.projectName = projectName;
  }

  /**
   * Instantiates the generation of the JavaScript project.
   */
  public void jsGenerator() {
    createJavaScriptDirectories();
    createJavaScriptFiles();
    runNpm(BASE_DIRECTORY + "/" + projectName);
  }

  /**
   * Creates the JavaScript directories.
   */
  private void createJavaScriptDirectories() {
    projectGenerator.createDirectory(BASE_DIRECTORY, projectName);
    String[] directories = {"src", "src/js", "src/css"};
    for (String directory : directories) {
      projectGenerator.createDirectory(BASE_DIRECTORY + "/" + projectName, directory);
    }
  }

  /**
   * Creates the JavaScript files.
   */
  private void createJavaScriptFiles() {
    String[] files = {"README.md", ".gitignore", "src/index.html", "src/js/index.js", "src/css/style.css"};
    for (String file : files) {
      projectGenerator.createFileWithContent(BASE_DIRECTORY + "/" + projectName, file, "// Automatic file creation by ezproj.");
    }
  }

  /**
   * Executes npm insitialization in the root directory of the project.
   *
   * @param rootDirectory The root directory of the project.
   */
  private void runNpm(String rootDirectory) {
    List<String> command = getNpmCommandForOS();
    ProcessBuilder processBuilder = new ProcessBuilder(command);
    processBuilder.directory(new File(rootDirectory));

    try {
      Process process = processBuilder.start();
      printProcessOutput(process);
      handleExitCode(process.waitFor());
    } catch (IOException e) {
      handleIOException(e);
    } catch (InterruptedException e) {
      System.err.println("NPM initialization process was interrupted.");
      Thread.currentThread().interrupt();
    }
  }

  /**
   * Determines the correct npm command to run based on the operating system.
   *
   * @return List of strings containing the npm command to run.
   */
  private List<String> getNpmCommandForOS() {
    List<String> command = new ArrayList<>();
    String os = System.getProperty("os.name").toLowerCase();

    if (os.contains("win")) {
      command.addAll(Arrays.asList("cmd.exe", "/c", "npm init -y"));
    } else {
      command.addAll(Arrays.asList("sh", "-c", "npm init -y"));
    }
    return command;
  }

  /**
   * Prints the output and errors of the process.
   *
   * @param process The process to print the output and errors of.
   * @throws IOException if an I/O error occurs.
   */
  private void printProcessOutput(Process process) throws IOException {
    try (BufferedReader outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
         BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
        
      String line;
      while ((line = outputReader.readLine()) != null) {
        System.out.println(line);
      }

      while ((line = errorReader.readLine()) != null) {
        System.err.println(line);
      }
    }
  }

  /**
   * Handles the exit code of the process.
   *
   * @param exitCode The exit code of the process.
   */
  private void handleExitCode(int exitCode) {
    if (exitCode != 0) {
      System.err.println("NPM initialization failed with exit code: " + exitCode);
    }
  }

  /**
   * Handles the IOException that may occur during npm initialization.
   *
   * @param e The IOException instance.
   */
  private void handleIOException(IOException e) {
    System.err.println("NPM initialization failed with exception:");
    e.printStackTrace();
  }
}
