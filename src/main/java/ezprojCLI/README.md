# ezprojCLI

## About

The two classes are using 'picocli' to create a command line interface (CLI) for the user. The user can create a new project with the given name and type. The project will be created in the current directory. The class 'EzprojCommand' is setting up the CLI and the class 'EzProj' contains the main method where the program is executed.

## Features
### EzprojCommand
1. Purpose: Create a command line interface (CLI) for the user.
2. Structure:

- ezproj The top-level command for the ezproj CLI
- -t, --type <type>  The type of project to create. (java, javascript)
- -n, --name <name>  The name of the project to create.
- -h, --help         Show this help message and exit.
- -v, --version      Print version information and exit.

### EzProj
Contains the main method where the program is executed.

## Dependencies
Both classes are using 'picocli' to create a command line interface (CLI) for the user.
