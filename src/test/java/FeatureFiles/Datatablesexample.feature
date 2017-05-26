@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Facebook Login
    Given I open FB Url
    When I enter username  and password for Datatables
      | username  | samay barik |
      | password  | simant |
      | country   | India  |
      | education | Btech  |
    Then I should be able to login
