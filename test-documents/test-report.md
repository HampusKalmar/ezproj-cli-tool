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

## Test case 4.0: Create JavaScript project.

### Result: 

| Test        | UC1  |
|-------------|------|
| TC4.0       | 1/OK |
| COVERAGE & SUCCESS | 1/OK |


### Conclusion:
The test case passed. A new JavaScript project was created with a top directory with the given name.

## Test case 5.0: Error handling.

### Result:

| Test        | UC1  |
|-------------|------|
| TC5.0       | 1/FAIL |
| COVERAGE & SUCCESS | 0/FAIL 

### Conclusion:
The test case failed. A project was created even though mixing long-form arguments and short-form arguments is not allowed.

## Test case 6.0: System independent.

### Result:

| Test        | UC1  |
|-------------|------|
| TC6.1       | 1/OK |
| TC6.2       | 0/FAIL |
| TC6.3       | 1/OK |
| COVERAGE & SUCCESS | 2/OK |

### Conclusion:
The test case passed on Windows and Linux but failed on macOS. The cli-tool was able to create a project on Windows and Linux but not on macOS. I did not have time to investigate why it did not work on macOS.

