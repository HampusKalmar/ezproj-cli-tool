# ezproj cli tool

## About 
'ezproj' is a command line interface tool that provides the user to simply generate a Java or JavaScript project
with the neccessary files and directorys to start with. Read more about how to set up 'ezproj' and how to use it
down below.

## Version 1.0.0
Check the version by running the following command in your terminal:
```bash
    ezproj -v
```
Or using the long-form arguments:
```bash
    ezproj --version
```

## Quick help
If you need any help once you have ezproj installed, run the following command: 
```bash
    ezproj -h
```
Or using the long-form arguments:
```bash
    ezproj --help
```

## Setup

To start using the ezproj CLI tool, follow these setup instructions:

### Download and Extract:

Download the latest release from the GitHub releases page. Look for the distribution.zip file attached to the most recent release.
Once downloaded, extract the contents of the distribution.zip to a location of your choice on your computer.

### Configure the System Path:

In order to run ezproj from any location in your terminal, you need to add its location to the system's PATH.

### For Windows users:
    1. Right-click on This PC or Computer on the desktop or in File Explorer.
    2. Choose Properties.
    3. Click on Advanced system settings.
    4. Click on the Environment Variables button.
    5. Under System Variables, scroll until you find the Path variable, then click on it and choose Edit.
    6. Click on New and then paste the path to where you extracted the distribution.zip contents.
    7. Click on OK to close all the windows.

### For macOS and Linux users:
    1. After downloading the distribution.zip, extract it to your preferred location.
    2. Open your terminal.
    3. Edit shell profile:
```bash
nano ~/.bashrc
or
nano ~/.zshrc
```
    4. At the end of the file, add the following line:
```bash
export PATH=$PATH:/path_to_the_extracted_folder
```
    5. Save and exit.
    6. Apply the changes to the current session:
```bash
source ~/.bashrc
or
source ~/.zshrc
```

## Usage

### Java:
    Run the following command: 
    ezproj -t java -n My-Java-Project
    Or using the long-form arguments:
    ezproj --type java --name My-Java-Project


### JavaScript:
    Run the following command: 
    ezproj -t javascript -n My-JavaScript-Project
    Or using the long-form arguments:
    ezproj --type javascript --name My-JavaScript-Project
