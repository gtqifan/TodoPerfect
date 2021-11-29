# Final Product Showcase

## Login Page

<img src="https://s6.jpg.cm/2021/11/30/LPDsh4.jpg" width="200" alt="Login Page">

Users will be directed to the login page as they start the TodoPerfect Application for the first time. If users have an existing account, they can enter their email and password to login to their account. The backend will verify if the password is correct. Otherwise, a new user account will be created on the sign-up page. 

### Wrong Password Entered

<img src="https://s6.jpg.cm/2021/11/30/LPDwcT.jpg" width="200" alt="Wrong Password">

User-entered password will be salted and then sent to the backend for verification. If the return value indicates the entered password does not match the stored password, a message of “Incorrect username or password” will pop-up.

## Sign-Up Page

<img src="https://s6.jpg.cm/2021/11/30/LPDowE.jpg" width="200" alt="Sign-Up Page">

New users will be directed to this page for sign-up. By creating a new user account, password needs to be confirmed and email needs to be verified. User passwords should be in compliance with our requirement (in the pop-up window). For email verification, we used AWS built-in service called Amazon Cognito to send verification code to the user-entered email address. 

### Functions

<img src="https://s6.jpg.cm/2021/11/30/LPD4xQ.jpg" width="200" alt="Verification Code">

An email containing verification code will be sent to the email entered and a notification window will pop up if two passwords entered don’t match. 

## User Profile Page

<img src="https://s6.jpg.cm/2021/11/30/LPDflh.jpg" width="200" alt="Profile Page">

This is the user profile page where users can see their current account, enable notification for tasks, or log out of their accounts. 

## Main Page

<img src="https://s6.jpg.cm/2021/11/30/LPDgES.jpg" width="200" alt="Main Page">

On the main page, users can see their tasks associate with their accounts. The task name is displayed at the center, and the due date is on the left, and the Importance of tasks will be highlighted through colored frames. The task list is arranged according to the due date. Tasks can also be modified or deleted from the task list. A random inspirational phrase will be displayed at the top. 
Tasks are not locally stored - they are stored on a server and users can access them from any device with the same account. 

### Star a Task

<img src="https://s6.jpg.cm/2021/11/30/LPDzjW.jpg" width="200" alt="Star a Task">

A task can be starred and it will be displayed above all non-starred tasks. 

## Task Creation/Edit Page

<img src="https://s6.jpg.cm/2021/11/30/LPD2n2.jpg" width="200" alt="Edit Page">

On the task creation page, users can put in the Subject (Name), Description, Importance, Due Time, and Expected Time Cost accordingly. All features can be updated after creation based on the user’s preferences. 

## The Magical Green Button - Focus Mode

<img src="https://s6.jpg.cm/2021/11/30/LPD3tH.jpg" width="200" alt="Focus Mode">

Remember the little green button displayed on the right side of the task entry? By clicking on the start button, a timer with the same expected time cost will be initiated. In the future, we are considering forcing users to stay on the timer page and meanwhile our TodoPerfect app will block all other applications. 

## Timer Page 

<img src="https://s6.jpg.cm/2021/11/30/LPDC0L.jpg" width="200" alt="Timer Page">

As the timer goes off, users can ask for more time (10 minutes) to complete their task by clicking the “MORE TIME” button in the pop-up window. 

## Notification

<img src="https://s6.jpg.cm/2021/11/30/LPDhIf.jpg" width="200" alt="Notification">

After notification function is enabled, users will receive notifications multiple times before the due time. The frequency of notification will be determined based on the task importance, and the time separation between each notification will be set to the estimated time cost in the task setting.
