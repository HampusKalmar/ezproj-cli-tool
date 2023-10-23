# Test specification

### Introduction
The goal with this document is to specify the test cases for the cli-tool. The test cases are based
on the issues that can be found on my GitHub page.

### Before you start
Download the zip and install the cli-tool as described in the **readme.md** file.

# Test cases

## Test case 1.0: Test version command.
### Test steps:
1. Open up the terminal
2. Type in the command 'ezproj --version' and 'ezproj -h'.

Expected result: The version of the cli-tool should be printed out in the terminal.

## Test case 2.0: Test help command.
### Test steps:
1. Open up the terminal
2. Type in the command 'ezproj --help' and 'ezproj -h'.

Expected result: The help menu should be printed out in the terminal.

## Test case 3.0: Create Java project.
### Test steps:
1. Open up the terminal
2. Go to a directory where you want to create the project.
3. Type in the command 'ezproj -t java -n <project name>' or 'ezproj --type java --name <project name>'.

Expected result: A new Java project should be created with a top directory with the given name.

## Test case 4.0: Create JavaScript project.
### Test steps:
1. Open up the terminal
2. Go to a directory where you want to create the project.
3. Type in the command 'ezproj -t javascript -n <project name>' or 'ezproj --type javascript --name <project name>'.

Expected result: A new JavaScript project should be created with a top directory with the given name.

## Test case 5.0: Error handling.
### Test steps:
1. Open up the terminal
2. Go to a directory where you want to create the project.
3. Type in the command 'ezproj -t java --name <project name>' or 'ezproj --type java -n <project name>'.

Expected result: A project should NOT be created because mixing long-form arguments and short-form arguments is not allowed.

## Test case 6.0: System independent.
### Test case 6.1 Windows
1. Try and install the distribution.zip on a Windows system.
2. Try and create a project using Windows Powershell.

Expected result: The cli-tool should create a project.

### Test case 6.2 macOS
1. Try and install the distribution.zip on a macOS system.
2. Try and create a project using the terminal.

Expected result: The cli-tool should create a project.

### Test case 6.3 Linux
1. Try and install the distribution.zip on a Linux system.
2. Try and create a project using the terminal.

Expected result: The cli-tool should create a project.