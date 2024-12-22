Feature: SignUp 
Scenario: Add a user when the users is logged in
Given the usear is already logged in  
When  I try to add a user with username "manar" and email 'manar@gmail.com' and password 'manar' and userlevel 'ADMIN' and userphone 12345 and useraddress "jenin"
Then I will add it with email 'manar@gmail.com'


Scenario: Add a user when the user is not logged in
Given the usear not logged in
When I try to add a user with a username "manar" and email 'manar11@gmail.com' and password 'manar' and userlevel 'ADMIN' and userphone 12345 and useraddress "jenin"
Then I can't found the user with email "manar11@gmail.com"