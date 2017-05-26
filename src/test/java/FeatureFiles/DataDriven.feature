@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Facebook Login using DataDriven
    Given I open Facebook Url
    When I enter username  and password present in excel "<row_index>"for Datadriven
    Then I should be able to login and see login page

    Examples: 
      | row_index |
      |         1 |
      |         2 |
