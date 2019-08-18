Feature: In order to perform activities on the page. page has to load sucessfully
         with its all  contents and elements.
  
Scenario: In order to perform activities on https://openweathermap.org portal. 
    Given User navigates to openweathermap website
    When page loaded completely user validates homepage title
    Then User perform all the activities
    Then Close the browser
   