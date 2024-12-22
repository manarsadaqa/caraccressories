Feature: userLogin

Scenario: Login with valid email and  password
Given there is already email 'manar@gmail.com' and password 'manar' 
When the user try to login with email 'manar@gmail.com' and password 'manar'
Then the user will login

Scenario: Login with valid email wrong password
Given there is already email 'manar@gmail.com' and password 'manar' 
When the user try to login with email 'manar@gmail.com' and password '12345'
Then the user will not login


