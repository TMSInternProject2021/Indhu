@LoginToTMSFeature
  Feature: Login to TMS
    Scenario:User logs in
      Given User with valid login credentials
      When user logs into tms application
      And user enters to tms
      And user selects hub
      Then user lands on TMS home page
      And user selects settings and moves to linehaul details page