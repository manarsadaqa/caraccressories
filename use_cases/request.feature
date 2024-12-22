Feature: Make request installation

Scenario: request installation when the customer is logged in
Given the customer is logged in with email 'sama@gmail.com' and pass 'sama'  
When customer request installation with requestid 1, and reqinstallername "ali" , and  productid 9 , reqproductname "car maicrophone" and  reqcostumername "sama" and day "Sunday" and month "14-April" and hour 12
Then the request installation it will be add  