Feature: Make purchases product
Scenario: purchase a product when the admin is logged in
Given the customer is already logged in with email 'sama@gmail.com' and password 'sama'  
When purchase a product with product id 11
Then I will found the product with product id as 11


Scenario: purchase a product when the admin is not logged in
Given the admin not logged in
When I try to purchase a product with product id 15
Then I can't found the product with  a product id 15