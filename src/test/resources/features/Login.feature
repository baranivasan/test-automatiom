@Login

Feature: Login into Automation Excercise

Scenario: To open automation excercise application and sign up

Given user launch automation excercise
Then user click on login/sign
And user enters username and password to registration
Then user verify the successful registration in application 


Scenario Outline: Login into automation excercise with <scenariotype>

Given user launch automation excercise
Then user click on login/sign Link
Then user enter <username> and <password> password
And user verify <message>

Examples:
|scenariotype|username|password|message|
|valid username and password| user|user|Login Success|
|valid username and invalid password| user|user|Login failed|
|invalid username and valid password| user|user|Login failed|

