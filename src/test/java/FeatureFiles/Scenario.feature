@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Facebook Login using Scenario
    Given I open FB Url
    When I enter username as "<username>" and password as "<password>"
    Then I should be able to login

    Examples: 
      | username | password |
      | samay    | simant   |
      | meetha   | pan      |
