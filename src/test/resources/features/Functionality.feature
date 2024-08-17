Feature: Verify functionalities of AbhiBus
  Scenario:user able to search for Bus
    Given user opens website
    Then verify user lands on website
    When user enters from and to station
    And user set date
    And click on search button
    Then verify user is on search result page

  Scenario: user is displayed with error message when to and from station are left blank
      Given user opens website
      Then verify user lands on website
      When user clicks on search button without entering to and from station
      Then verify error message is displayed

  Scenario: swap button for to and from station in book bus tickets validation
    Given user opens website
    Then verify user lands on website
    When user clicks on swap button
    Then verify the to and from station places are swapped

    Scenario: validation of today button in book bus tickets
      Given user opens website
      Then verify user lands on website
      When user clicks on today
      Then verify todays date is displayed

  Scenario: tomorrow button in book bus tickets validation
    Given user opens website
    Then verify user lands on website
    When user clicks on tomorrow
    Then verify tomorrows date is displayed




