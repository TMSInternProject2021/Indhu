@LoginFeature
Feature: LoginFeature
  Background:
  User navigates to TMS Login page
    Given I am on TMS Login page
  Scenario: Login to TMS with correct credentials
    When I enter username as "tmsadmin"
    And I enter password as "Test@2020"
    And I click on Login
    Then I am on Application selector page
    When I click on Enter to TMS
    Then Hub selector page is displayed
    When choose HUB NAME as "TMS Hub"
    And I click on settings
    Then Navigates to settings page
    When I choose linehaul details from settings
    Then I am on Linehaul details page

    When I click on Add new connection
    Then Add new connection pop-up displayed
    When I pass hubname as "Ce" to Origin Hub field
    And I choose "Cepher Hub" from drop-down of Origin hub field
    When I pass hubname as "TMS" to Destination Hub field
    And I choose "TMS Hub" from drop-down of Destination hub field
    When I click on DateField
    And I choose date as "22/01/2021"
    When I click on Repeat frequency field
    And I choose "Weekly" from drop-down
    When I enter Start Time as "18:00"
    When I enter Transit Time as "360:35"
    When I click on VehicleType Field
    And I choose "4-wheeler"
    Then I click On save

    When I click on Edit Action
    And I edit the Repeat frequency field

    Then Edit is sucessfully done the existing connection

    When I click on


