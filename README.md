# CT417-SE3-assigment-1A

## Assigment Detail

You have been asked to build a student registration system for a university. To ensure code reusability and separation of concerns you have been asked to build the system in the following way.

A. Create a Java project using Maven (Maven project). The project should
contain the following classes and each class should have suitable accessor
and mutator methods:
1. A student class should contain information such as (Name, Age, DOB, ID, Username etc.).
2. A specific method (getUsername) will generate the student’s username by concatenating
their Name and Age. Write a simple unit test using JUnit to make sure this works as
expected.
3. A module class which should contain information such as (Module Name, ID (CT417), List of
students).
4. A course programme class (Course Name (CS & IT or ECE etc), List of modules, Academic
Start date and End dates). Start and end dates should use Joda Time classes, which
should be added as a project dependency. The class must also have suitable accessor and
mutator methods.
5. The project should be packaged into a JAR file. This JAR needs to be pushed to a (global) repository so that it can be added as a dependency in additional projects automatically.

B. Finally you must create an account using Shippable which will act
as the CI server. You will also need to specify a .yml file to automate
the build.