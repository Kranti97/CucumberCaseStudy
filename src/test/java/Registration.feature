Feature: CaseStudy for registration in TestMe App

Scenario: Registration 

Given User must be on the registration page
When User enter "Kranti" as the username
And  enter "Lalitha" as the first name
And enter "Paul" as last name
And enter "password123" as the password
And enter "password123" as the confirm password
And select female in gender
And enter "accenture@gmail.com" in emailaddress
And enter "9090904444" as mobile number
And enter "07/14/98" as date of birth
And enter "Chennai,Tamil Nadu" as address
And user should select a security question
And enter "Black" as answer
And User should click on register button
Then User should be redirected to the login page