Feature: assesment
@obss
  Scenario:
    Given User is on main page
    When User clicks on magnifier button
    Then User is able too see search box and enter "automation"
    Then User selects first result
    And User verifies page title