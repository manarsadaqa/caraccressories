Feature: Send order email 

  Scenario: order complete
    When order is complete with produtname "vehicle engine" and price 1000
    Then Send email
