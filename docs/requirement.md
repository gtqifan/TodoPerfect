# Requirement

## User Requirement

### Software Interfaces

- **Kotlin**, Kotlin, Version 1.6.0. The system must use Kotlin as the programming language because it is the official language for Android applications and highly compatible with a series of Java frameworks and libraries, making testing easier. Also, it is relatively easy to adopt Kotlin and the development process is relatively easy and fast. 

- **Android Studio**, Android Studio, Version 4.2.2. The system must use Android Studio for Android application development. It is the official IDE for Android applications, integrating multiple tools for function development and compatibility testing. In this project, Android Studio would provide functionalities of UI design, function development, and compatibility testing.

- **Amazon Web Services**, AWS, Latest Version, NoSQL DynamoDB Database & Amazon Cognito. The system must use AWS for user management and task data storage. AWS will provide cloud storage and a series API for the Android application to add, modify, or delete user profiles, or retrieve tasks information from the NoSQL DynamoDB database. Amazon Cognito would verify if the user-entered email address is usable by sending verification code to the email address.

- **JUnit**, JUnit, Version 4.12. The system can use JUnit for automated unit testing. Although the application and backend logic can be tested manually, automated testing with JUnit is fast and more reliable. In the application development process, we can easily identify where the code goes wrong and immediately fix the problem. In this project, JUnit is utilized in both frontend and backend testing. For frontend, button press and a series of user interactions are tested, and for backend, adding, modifying, and deleting tasks are tested. 

### User Interface

The Android application consists of a series of GUI for users to interact with the backend functions. Users will first start with the login/sign up page where users can register a new account with their email address and password information with verification code that is sent to their email address, or login to an existing account. All inputs will be collected by textboxes and buttons. Only after users have logged in, the main functional page (task list) that is associated with the user account can be accessed and displayed on the screen. The main page consists of a GUI that lists all tasks entries with the due date and priority (color noted). Users can also add or modify task entries on the main page on the top. In the focus mode, a timer will be displayed at the center, and users can pause the timer or finish this task by using the two buttons below the timer. 

### Product Functions

The TodoPerfect Android application provides functionalities like:

- Sign-up with username and password
- Secure account information storage
- Verify email address
- Account management, only signed-in account can use the task functions
- Add, modify, and delete task entries
- Display task entities in due-date order or priority
- Display timer to let users focus on the task
- Push notifications to user’s phone

### User Characteristics

The TodoPerfect Android application is open to the public and expects no technical expertise for users. The target users are those who need an organized schedule or tend to forget tasks and due dates. Users should know basic usage of phone applications and have experience of accessing other applications such as Instagram and YouTube which also come with sign-up/sign-in features. The UI will be as simple as possible, avoiding any excessive and unnecessary operations for using the application. 

### Assumptions and Dependencies

To access the TodoPerfect Android application, users are expected to have internet access. They are also expected to use the latest version of Android operating systems that supports libraries used in the project. 

### Apportioning of Requirements

As the task list might be long and with many unimportant entries, it is nice to have a filter to remove the entries that are not with high priority. Tasks can also be refreshed and synchronized on multiple ends with the same account. The application can also remember user login status so there is no need to login every time users access the application. 
    
## System Requirements

### Functional Requirements

- The system shall allow users to log in.
- The system shall not allow users without an account to access the application.
- The system shall allow users to create a new account.
- The system shall securely store and retrieve passwords using AWS NoSQL database.
- The system shall verify user-entered email address is usable with Amazon Cognito.
- The system shall connect to AWS and verify user information. 
- The system shall retrieve task entries along with related information from AWS database.
- The system shall display a list of tasks associated with the account. 
- The system shall update the UI with a list of tasks from the database.
- The system shall allow users to add, modify, and delete tasks. 
- The system shall start a timer for the tasks. 
- The system shall push notifications prior to the due date.
- The system should allow users to order their task lists with more ordering criterias. 
- The system may let users stay logged in.
- The system may provide filters for users to choose important tasks.
- The system may force users to stay in the focus mode. 

### Non-Functional Requirements

#### Software Quality Attributes

- The system shall hash or salt users’ passwords.
- The system shall display the information in a clearly structured GUI.
- The system should adapt to different screen sizes and Android versions.
- The system should provide stable access except for maintenance.

#### Other Non-functional Requirements

- The system should return task entries accurately.
- The system may be free to access with a registered account. 

[**Back to Index Page**](https://gtqifan.github.io/TodoPerfect/)