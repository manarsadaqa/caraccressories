Feature: Delete product
Scenario: delete a product when the admin is logged in
Given the admin is already logged in  
When delete a product with productid 1 
Then I will found the product with productid as 1


Scenario: delete a product when the admin is not logged in
Given the admin not logged in
When I try to delte a product with productid 7 
Then I can't found the product with  a productid 7