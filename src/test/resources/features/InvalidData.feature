#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: To validate the error message with invalid data
  

  @tag1
  Scenario: To test the add customer page with invalid data
    Given the user directs to add customer page
    
    When the user enters invalid data in the fields
    |guru|prasad|test@gmail.com|chennai|60258|
    |123 |@&1   |abi|test@gmail.com|guru|
    
    
    Then the user should see error message
    

 
