Feature: Delete user
Scenario: delete a user when the admin is logged in
Given the admin is already logged in  
When delete a user with useremail "user4@gmail.com" 
Then I will found the user with useremail as "user4@gmail.com" 


Scenario: delete a user when the admin is not logged in
Given the admin not logged in
When I try to delte a user with useremail "user7@gmail.com" 
Then I can't found the user with  a useremail "user7#gmail.com"