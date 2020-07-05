Feature: To test functionality of facebook

@Facebook_a
Scenario: To test login functionality of facebook

Given user launches the url "https://www.facebook.com"
When user inputs the credentials "Thulasi" "123456"
And user clicks login
Then user verifies the login page

@Facebook_b
Scenario: To test login functionality of facebook

Given user launches the url "https://www.facebook.com"
When user inputs the credentials "Rose" "12456"
And user clicks login
Then user verifies the login page

