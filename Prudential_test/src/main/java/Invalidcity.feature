Feature: In order to perform activities on the page. page has to load sucessfully
         with its all  contents and elements.
         
Scenario: In order to verify the city invalid name on openweathermap website. 
    Given User navigates to openweathermap website
    When page loaded completely and user validates homepage title
    Then User enters invalid city name
    Then User should get  not found messege
    
    
    