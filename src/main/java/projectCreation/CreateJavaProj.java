package projectCreation;

import com.projectgenerator.api.ProjectGeneratorAPI;

/**
 * A class that have methods that builds a Java project.
 */
public class CreateJavaProj {
  private ProjectGeneratorAPI projectGenerator = new ProjectGeneratorAPI();
  private final String BASE_DIRECTORY = System.getProperty("user.dir");
  private String projectName;

  /**
   * Constructor for the CreateJavaProj class.
   *
   * @param projectName The name of the project.
   */
  public CreateJavaProj(String projectName) {
    if (projectName == null) {
      throw new IllegalArgumentException("Project name cannot be null.");
    }
    this.projectName = projectName;
  }

  /**
   * Instantiates the generation of the Java project.
   */
  public void javaGenerator() {
    createJavaDirectories();
    createJavaFiles();
  }

  /**
   * Creates the Java directories
   */
  private void createJavaDirectories() {
    projectGenerator.createDirectory(BASE_DIRECTORY, projectName);
    String[] directories = {"src", "src/main", "src/main/java", "src/test", "src/test/java"};
    for (String directory : directories) {
      projectGenerator.createDirectory(BASE_DIRECTORY + "/" + projectName, directory);
    }
  }

  /**
   * Creates the Java files.
   */
  private void createJavaFiles() {
    String[] files = {"README.md", ".gitignore", "build.gradle", "src/main/java/App.java", "src/test/java/AppTest.java"};
    for (String file : files) {
      projectGenerator.createFileWithContent(BASE_DIRECTORY + "/" + projectName, file, "// Automatic file creation by ezproj.");
    }
  }
}