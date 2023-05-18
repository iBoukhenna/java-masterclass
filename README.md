# Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)
## Working with Streams - The Basics
### Examples
### Exercises
### Running on the command line

This example project is a [Maven](https://maven.apache.org/) project. Apache Maven is a very widely used project management tool for Java projects. Most Java IDEs, such as IntelliJ
IDEA and Eclipse, understand Maven projects, so it should be easy to open the project in your Java IDE.

If you want or need to work with the project in a terminal window or in the Windows command prompt or PowerShell, then you can use the following commands to compile the code and
run the unit tests. The unit tests will check if you've successfully solved the exercises.

In the terminal, Windows command prompt or PowerShell, first use the `cd` command to go to the directory where you've unzipped this project. Then use one of the following commands:

On Windows:

    mvnw.cmd clean package

On macOS or Linux:

    ./mvnw clean package

These commands will download Apache Maven if you haven't already have it installed, and then run Maven to compile the code and run the unit tests.

If everything compiles without errors and all the tests succeed, the command will finish with a message that says "BUILD SUCCESS".

To compile the code without running the unit tests, add the `-DskipTests` option:

On Windows:

    mvnw.cmd clean package -DskipTests

On macOS or Linux:

    ./mvnw clean package -DskipTests
