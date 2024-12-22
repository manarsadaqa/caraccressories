Feature: Log out
Scenario: : Log out 
Given there is already email 'manar@gmail.com' and password 'manar' 
When the user try to logout 
Then the user will logout
