Feature: test login functionality

@smoketest
Scenario: test login

Given user goes to login page
When user provides username and password
And user clicks on login button
Then user is navigated to homepage