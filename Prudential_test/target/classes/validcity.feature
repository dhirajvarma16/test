Feature: In order to perform activities on the page. page has to load sucessfully
         with its all  contents and elements.
         
Scenario: In order to verify the city valid name on openweathermap website. 
    Given User navigates to openweathermap website
    When page loaded completely and user validates homepage title
    Then User enters valid city name
    Then User should get the city messege
    
    
    