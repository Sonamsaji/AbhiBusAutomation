Feature: Website Functionality

  Background:
    Given user opens website
    Then verify user lands on website

#  covers navigating to the job description page.
  Scenario: User navigates to the job description page
    When user clicks on the Careers icon in the footer
    Then verify user is on the Careers page
    And user clicks on any job title
    Then verify user is on the job description page

#  focuses on the job application process after landing on the job description page.
  Scenario: User applies for a job
    When user clicks on the Careers icon in the footer
    Then verify user is on the Careers page
    And user clicks on any job title
    Then verify user is on the job description page
    When user clicks the I'm interested button
    And fills in the required details and clicks Next
    And fills in the notice period details and clicks Submit
    Then verify the application is submitted

#  introduces an additional action: referring a friend for the job, which is commonly available on job portals.
  Scenario: User refers a friend for a job
    When user clicks on the Careers icon in the footer
    Then verify user is on the Careers page
    And user clicks on any job title
    Then verify user is on the job description page
    Given user is on the job description page
    When user clicks the "Refer a Friend" button
    And enters the friend's details
    And clicks Submit
    Then verify the referral is submitted successfully

#  Add scenario to validate cancel ticket functionality with invalid data
  Scenario: Validate cancel ticket with invalid data
    When the user clicks on the Quick Links icon in the footer
    And the user clicks on the "Cancel Booking" option
    Then verify the user is on the Cancel Booking page
    And the user enters an invalid "booking.id" and "mobile.number"
    Then verify an appropriate error message is displayed to the user

#  chatbot box loads successfully when accessed from the Cancel Booking page.
  Scenario: Validate chatbot functionality on the Cancel Booking page
    When the user clicks on the Quick Links icon in the footer
    And the user clicks on the "Cancel Booking" option
    Then verify the user is on the Cancel Booking page
    When the user clicks the chatbot icon
    Then verify the chatbot box loads successfully

#  Scenario verifies that clicking the dropdown symbol for a specific FAQ item results in the symbol being in the active or expanded state.
  Scenario: Validate FAQ item expansion on the FAQ page
    When the user clicks on the FAQ icon in the footer
    Then verify user lands on FAQ page
    When the user clicks the keydown symbol for a specific FAQ item
    Then keydown symbol should be in the active or expanded state

#  Scenario checks that the correct confirmation message is displayed after clicking the "Copy Code" icon on an offer detail page.
  Scenario: Apply discount offer on bus ticket booking
    When the user clicks on "Offers" from the navigation menu
    And the user selects any offer option
    Then verify the offer details are displayed
    And the user clicks "View Details" for the selected offer
    And clicks the "Copy Code" icon
    Then verify the message is displayed

#  Scenario checks that a list of trains is displayed when searching without filters.
  Scenario: Search for trains without applying filters
    When the user clicks on "Trains" from the navigation menu
    Then verify the user is on the Train Ticket Booking page
    And the user clicks the search button
    Then verify a list of trains is displayed

#  Scenario checks that a filtered list of trains is displayed when filters are applied.
  Scenario: Search for trains and apply filters
    When the user clicks on "Trains" from the navigation menu
    Then verify the user is on the Train Ticket Booking page
    And the user clicks the search button
    Then verify a list of trains is displayed
    And the user applies some filters
    Then verify the filtered list of trains is displayed

#  Scenario checks that all filters are reset to default when the "Reset All" button is clicked.
  Scenario: Search for trains, apply filters, and reset filters
    When the user clicks on "Trains" from the navigation menu
    Then verify the user is on the Train Ticket Booking page
    And the user clicks the search button
    Then verify a list of trains is displayed
    And the user applies some filters
    Then verify the filtered list of trains is displayed
    And the user clicks the "Reset All" button
    Then verify all filters are reset










