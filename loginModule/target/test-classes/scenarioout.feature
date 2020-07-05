Feature: To test functionality of facebook


Scenario Outline: To test login functionality of facebook

Given user launches the url "https://www.facebook.com"
When user inputs the credentials "<UserName>" "<Password>"
And user clicks login
Then user verifies the login page

Examples:
|UserName|Password|
|Thulasi|123456|
|Rose|45673|
|Lily|4567t3|
