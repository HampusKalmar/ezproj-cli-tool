# ezproj cli tool

## Version 1.0.0
    Check the version by running the following command in your terminal:
    ezproj -v
    Or using the long-form arguments:
    ezproj --version

## Quick help
    If you need any help once you have ezproj installed, run the following command: 
    ezproj -h
    Or using the long-form arguments: 
    ezproj --help

## Setup

To start using the ezproj CLI tool, follow these setup instructions:

### Download and Extract:

Download the latest release from the GitHub releases page. Look for the distribution.zip file attached to the most recent release.
Once downloaded, extract the contents of the distribution.zip to a location of your choice on your computer.

### Configure the System Path:

In order to run ezproj from any location in your terminal, you need to add its location to the system's PATH.

### For Windows users:

    Right-click on This PC or Computer on the desktop or in File Explorer.
    Choose Properties.
    Click on Advanced system settings.
    Click on the Environment Variables button.
    Under System Variables, scroll until you find the Path variable, then click on it and choose Edit.
    Click on New and then paste the path to where you extracted the distribution.zip contents.
    Click on OK to close all the windows.

### For macOS and Linux users:

    Open your terminal.
    Edit the .bashrc file (or the appropriate profile file for your shell, e.g., .zshrc for Zsh) 
    with a text editor of your choice. For example: nano ~/.bashrc.
    Add the following line at the end of the file: export PATH=$PATH:/path_to_the_extracted_folder
    Save and close the text editor.
    Run source ~/.bashrc (or source ~/.zshrc for Zsh) to update the current terminal session.

## Usage

### Java:
    Run the following command: 
    ezproj -t java -n My-Java-Project
    Or using the long-form arguments:
    ezproj --type java --name My-Java-Project


### JavaScript:
    Run the following command: 
    ezproj -t javascript -n My-Java-Project
    Or using the long-form arguments:
    ezproj --type javascript --name My-Java-Project
