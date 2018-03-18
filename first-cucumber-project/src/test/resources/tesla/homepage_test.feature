Feature: Tesla home page

  Scenario: Model S link
    Given I am on the home page
    When I click on the model S link
    Then Model S home page should be displayed
		And I close the browser 
		
  Scenario: Roadster link
    Given I am on the home page
    When I click on Roadster link
    Then Roadster home page should be displayed
		And I close the browser 	
		# If any step is failed, following will not work
		
		