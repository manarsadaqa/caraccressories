Feature: Update product
Scenario: update a product when admin is logged in
Given admin is already logged in  
When update a product with a productid 40 and a productname 'vehicle engine1' and a productdescription 'strong vehicle engine' and productcategorie 'interior' and productprice 1000 and productimage 'C:\\Users\\lenovo\\Desktop\\manar\\4th year\\first\\software\\proj\\vehicle_engine.jpg' and productavailability 'valied' and oldproductid 3
Then I will found the product with a  productid 3


Scenario: update a product when admin is not logged in
Given admin not logged in
When I try to update a product witha  productid 8 and productname 'vehicle engine' and productdescription 'strong vehicle engine' and productcategorie 'interior' and productprice 1000 and productimage 'C:\\Users\\lenovo\\Desktop\\manar\\4th year\\first\\software\\proj\\vehicle_engine.jpg' and productavailability 'valied' and oldproductid 8
Then I can't found the product with a productid 8