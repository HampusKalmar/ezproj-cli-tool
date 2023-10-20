# Test specification

### Introduction

### Before you start
Download the zip and install the cli-tool as described in the readme.md file.

# Test cases

## Test case 1: Test version command.
### Test steps:
1. Open up the terminal
2. Type in the command 'ezproj --version' and 'ezproj -h'.

Expected result: The version of the cli-tool should be printed out in the terminal.

## Test case 2: Test help command.
### Test steps:
1. Open up the terminal
2. Type in the command 'ezproj --help' and 'ezproj -h'.

Expected result: The help menu should be printed out in the terminal.

## Test case 3: Create Java project.
### Test steps:
1. Open up the terminal
2. Go to a directory where you want to create the project.
3. Type in the command 'ezproj -t java -n <project name>' or 'ezproj --type java --name <project name>'.

Expected result: A new Java project should be created with a top directory with the given name.

## Test case 4: Create JavaScript project.
### Test steps:
1. Open up the terminal
2. Go to a directory where you want to create the project.
3. Type in the command 'ezproj -t javascript -n <project name>' or 'ezproj --type javascript --name <project name>'.

Expected result: A new JavaScript project should be created with a top directory with the given name.

## Test case 5: Error handling.
### Test steps:
1. Open up the terminal
2. Go to a directory where you want to create the project.
3. Type in the command 'ezproj -t java --name <project name>' or 'ezproj --type java -n <project name>'.

Expected result: A project should NOT be created because mixing long-form arguments and short-form arguments is not allowed.