
Feature: Feature to test login functionality
    
    Scenario Outline: Check login successful with valid credentials
        Given browser is opened
        And user is on login page
        When user enters valid <username> and <password>
        And clicks on login button
        Then user is navigated to home page

    Examples: 
      | username  | password  |
      | student | Password123 |
      
