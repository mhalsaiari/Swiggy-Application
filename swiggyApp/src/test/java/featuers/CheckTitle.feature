
Feature: Check Website Title
  
  Scenario: Open website and check title
    Given I am on main page
    When I get the title of the page
    Then I validate title as 'Order food online from India\'s best food delivery service. Order from restaurants near you'
    
