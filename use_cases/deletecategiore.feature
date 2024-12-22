Feature: Delete categiore
Scenario: delete a product when the admin is logged in
Given the admin is already logged in  
When delete a product with productcategiore "Electronic"
Then I will found the product with productcategiore as "Electronic"


Scenario: delete a product when the admin is not logged in
Given the admin not logged in
When I try to delete a product with productcategiore "Electr" 
Then I can't found the product with  a productcategiore "Electr" 