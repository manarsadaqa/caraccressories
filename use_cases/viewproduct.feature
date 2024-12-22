Feature: View product product

Scenario: view product when the customer is logged in
Given the customer is already logged in  
When the customer choose view product 
Then the product list is print in the screen 
