# CS 3300: TodoPerfect by Team 03 - Placeholder

Yukun Song, Jiali Chen, Qifan Yang, Parnav Kandarpa, and Sam Sanders

**Origional GitHub repository is here (with private access): [Origional GitHub Repo](https://github.com/Spark-RTG/TodoPerfect3300)**

<img src="https://s6.jpg.cm/2021/11/30/LPDjUU.png" width="200" alt="Icon">

## Introduction

TodoPerfect is an Android Application used for creating and synchronising To-Do tasks among devices. It is login required and a valid email will be used for sign-up; the tasks created will include a Name, Description (optional), Due date, and other features such as Importance (optional), Expected time Cost (optional). The importance of tasks will be highlighted through colors accordingly so that users are able to easily distinguish tasks and their priorities, and notifications will be posted prior to the due time.

## Technologies

**Front-end:** the project is implemented using Kotlin as the language, Android Studio as the IDE, and Gradle as the build tool.

**Back-end:** the project is developed using S3 structure and lambda functions, which are hosted on Amazon Web Services (AWS) with the corresponding NoSQL DynamoDB database.

**Testing:** the project utilizes JUnit as the framework for repeatable tests. (Kotlin and Java share the interpreter, so they can both use JUnit).

## Team Contribution

**Yukun Song:** Android application development and testing

**Jiali Chen:** RESTful API for Login and Signup queries and testing

**Qifan Yang:** RESTful API for account database, documentation, and testing

**Pranav Kandarpa:** Connecting the backend and the frontend part

**Sam Sanders:** Documentation and testing

## Definitions and Acronyms

- **AWS** - Amazon Web Services
- **API** - Application programming interface, a type of software interface, offering a service to other pieces of software
- **NoSQL** - Not only SQL
- **IDE** - Integrated Development Environment
- **GUI** - Graphical user interface, a user interface that allows users to interact with electronic devices through graphical icons and audio indicator
- **Test #** - Test Case Number / Identifier
- **Requirement** - Requirement that the test cases are validating (number / identifier) 
- **Action** - Action to perform or input to produce Expected Result Result expected when action is complete 
- **Actual Result** - What was actually seen 
- **P / F** - Pass / Fail indicator. “P” = Pass. “F” = Fail 
- **Notes** - Additional notes, error messages, or other information about the test. 

## Project Report

- [**Planning**](docs/planning.html)
- [**Requirement**](docs/requirement.html)
- [**Design**](docs/design.html)
- [**Testing**](docs/testing.html)
- [**Final Product**](docs/finalProduct.html)

## How to run this application?

To run this application, you can directly install the apk file in the ./app/release folder, or run the application on a virtual machine (or physical device) in Android studio.

To run the tests, you need to run the file ./app/src/androidTest/java/com.example.todoperfect/ActivityTestSuite, which is a compilation of all the tests.

The backend code is stored in the ./app/src/backend folder. This is just for displayment, not for real use.
