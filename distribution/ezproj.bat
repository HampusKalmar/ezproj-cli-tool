@echo off
set SCRIPT_DIR=%~dp0
echo Running from: "%SCRIPT_DIR%"
echo Executing command: java -jar "%SCRIPT_DIR%ezproj-all.jar" %*
java -jar "%SCRIPT_DIR%ezproj-all.jar" %*