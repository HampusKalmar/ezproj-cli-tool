# Test report for ezproj

## Introduction 

This report is based on the test cases that can be found in the test-specification.md file.

## Test Environment 
**Operation System:** Windows 11

**Terminal:** Windows PowerShell

**openJDK version:** 11.0.16.1

**ezproj version:** 1.0.0

### Comment
In all of the test cases, the cli-tool was installed and used on a Windows 11 system except for test case **6.2** and **6.3**, where the cli-tool was installed and used on macOS and Linux (ubuntu).

## Test case 1.0: Test version command.

### Result:

| Test        | UC1  |
|-------------|------|
| TC1.0       | 1/OK |
| COVERAGE & SUCCESS | 1/OK |

### Conclusion:
The test case passed. The version of the cli-tool was printed out in the terminal.

## Test case 2.0: Test help command.

### Result:

| Test        | UC1  |
|-------------|------|
| TC2.0       | 1/OK |
| COVERAGE & SUCCESS | 1/OK |

### Conclusion:
The test case passed. The help menu was printed out in the terminal.

## Test case 3.0: Create Java project.

### Result:

| Test        | UC1  |
|-------------|------|
| TC3.0       | 1/OK |
| COVERAGE & SUCCESS | 1/OK |

### Conclusion:
The test case passed. A new Java project was created with a top directory with the given name.
