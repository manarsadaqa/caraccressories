Feature: Add product
Scenario: Add a product when the admin is logged in
Given the admin is already logged in with email 'manar@gmail.com' and password 'manar'
When add a product with productid 1 and  productname "vehicle engine" and productdescription 'strong vehicle engine' and productcategorie 'interior' and productprice 1000 and productimage 'C:\\Users\\lenovo\\Desktop\\manar\\4th year\\first\\software\\proj\\vehicle_engine.jpg' and productavailability 'valied' 
Then I will found the product with product id 1


Scenario: Add a product when the admin is not logged in
Given the admin not logged in
When I try to add a product with productid 4 and productname "vehicle engine" and productdescription 'strong vehicle engine' and productcategorie 'interior' and productprice 1000 and productimage 'C:\\Users\\lenovo\\Desktop\\manar\\4th year\\first\\software\\proj\\vehicle_engine.jpg' and productavailability 'valied'
Then I can't found the product with product id 4