Feature: Search product
Scenario: : Searching for a substring of the name
Given there is a product with name "vehicl door"
When I search with "vehicl door"
Then 1 product should have been found with name "vehicl door"
