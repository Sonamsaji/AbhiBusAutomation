Feature: user opens website
  Scenario: verify user opens website
    Given user opens website
    Then verify user lands on website


  Scenario: User applies for a job
    Given user opens website
    When user clicks on the Careers icon in the footer
    Then verify user is on the Careers page
    And user clicks any job title
    Then verify user is on the job description page
    And user clicks the "I'm interested" button
    And fills in the required details and clicks Next
    And fills in the notice period details and clicks Submit
    Then verify the application is submitted
