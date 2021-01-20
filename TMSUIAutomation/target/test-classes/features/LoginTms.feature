@LoginTmsfeature
  Feature: Login to TMS
    Background:
      Given User should be on home page
      And User is provided with valid credentials
      When user logs in
      Then user selects to enter to tms
      And user should select the hub
      And user should select settings
      And user should select linehaul details
      Then user lands on linehaul details page