@TmsFeature
  Background:User logs in
    Given User with valid login credentials
    When user logs into tms application
    And user selects hub
    And user enters to tms
    Then user lands on TMS home page
    And user selects settings and moves to linehaul details page

  @AddNewConnection @Positive
  Scenario:Add new connection
    Given User should be on linehaul details page
    When user clicks add new connection
    And user fills all details to create an new connection and clicks on save
    Then validate if new connection is created

  @CreateAndEditConnection @Positive
  Scenario:Create and edit the connection
    Given User should be on linehaul details page
    When user clicks edit icon for particular connection
    And user edit the fields and clicks on save
    Then validate if the connection has been edited

  @DeleteConnection @Positive
  Scenario:Delete the connection
    Given User should be on linehaul details page
    When user clicks delete icon for particular connection
    Then user can undo the deleted connection
    And validate if the connection has been restored
    When undo operation is not performed
    Then validate if the connection has been deleted

  @SortByOriginHub @Positive
  Scenario:Sort by Origin hub
    Given User should be on linehaul details page
    When user click on downarrow
    Then validate if the list is sorted in descending order

  @SearchByOriginHub @Positive
  Scenario:Search by origin hub
    Given User should be on linehaul details page
    When user clicks on Origin hub
    And choose the hub to be searched
    Then validate if search results are found

  @MandatoryErrorMessage @Negative
  Scenario:Mandatory error message for create linehaul connection
    Given User should be on Add new connection pop-up
    When user enters invalid data and clicks on save
    Then validate if mandatory error message is thrown

  @PageCountAndDataCount
  Scenario:Verify pageCount and dataCount are equal
    Given User should be on linehaul details page
    And search operation is performed
    When user counts number of entries
    And total count is displayed
    Then validate if both page count and data count are equal



