Feature: Amazon login feature

 # As a user I want to have a search functionality in
 #Google so that i can search something on internet
  @amazon
  Scenario: Verify Login functionality on amazon page
    When User on amazon home page
    And User clicks login
    And User types email
   # And User presses continue
    And User types password
    And User hover mouse
    And User clicks your orders
    And User clicks menu
    And User scrolls down
    And User sign out
    #And User clicks sign out
    #And User should see search result display
