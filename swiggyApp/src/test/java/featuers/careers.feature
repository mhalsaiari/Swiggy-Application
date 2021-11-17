
Feature: Careers Page Test
  
  Scenario: Search Careers
    Given I am on careers page
    When I get title of the page
    Then I validate the title as 'SwiggyCareer'  
 	@career
  Scenario Outline: Search Careers
    Given I am on careers page
    When I enter job name '<job>'
    And  click search button


    Examples: 
      | job  |
      | developer | 
