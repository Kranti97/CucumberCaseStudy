Feature: CaseStudy for login in TestMe App

Scenario Outline: Login in TestMe

Given user must be in login page
When user enters "<username>" and "<password>" 
And user should click on login button
Then user must be in the home page

Examples:
|username||password|
|Lalitha||password123|