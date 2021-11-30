# Design

## Assumptions

To use the ToDoPerfect application, users are expected to have an Android device with internet access, and have recent versions of Android(from Android 6.0; API Level 23), older versions will not support certain API functions and may result in unexpected errors.

## Constraints

The application will run based on Android platforms(Version 6.1 and later), and the backend will be using Amazon Web Services S3 structure and lambda functions. Performance requirements for this application are minimal, and users are expected to be capable of reading in English, since English is the only supported language.

## Architectual Design

The backend of the ToDoPerfect project was built using S3 structure and lambda functions, and uses Gradle as the build tool. The frontend uses Kotlin as the language. It is hosted on Amazon Web Services S3 and also uses AWS Cognito for email verification.

## Conceptual View

<img src="https://s6.jpg.cm/2021/11/30/LRL3ti.png" width="800" alt="Icon">

-------------------------------------------------------------------------------------------------------------------------------------------------------------

## Class Diagram

<img src="https://s6.jpg.cm/2021/11/30/LRW6Pu.png" width="800" alt="Icon">

