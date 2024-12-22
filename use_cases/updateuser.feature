Feature: Update user
Scenario: update a user when admin is logged in
Given admin is already logged in  
When update a user with a  with username "manar" and email 'user5@gmail.com' and password 'manar' and userlevel 'ADMIN' and userphone 12345 and useraddress "jenin" and oldemail "user5@gmail.com"
Then I will found the user with a  useremail 'user5@gmail.com'


Scenario: update a user when admin is not logged in
Given admin not logged in
When I try to update a user with a  with username "manar" and email 'mmm@gmail.com' and password 'manar' and userlevel 'ADMIN' and userphone 12345 and useraddress "jenin" oldemail "mmm@gmail.com"
Then I cant found the product with a useremail 'mmm@gmail.com'