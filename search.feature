Feature: Google Searching
  As a web surfer, I want to search Google, so that I can learn new things.
  
  Scenario: Simple Google search
    Given a web browser is on the Google page
    When the search phrase "<searchdata>" is entered
    Then results are shown
    
    Examples:
    |searchdata|
    |Roses|
    |TV|
    |Cat|
    |Dog|