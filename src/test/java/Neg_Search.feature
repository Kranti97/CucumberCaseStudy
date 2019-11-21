Feature: Case Study for negative search

Scenario: Negative Search

Given User has to register in TestMe App
When User searches for a particular product like "headphone"
And try to proceed payment without adding any item in the cart
Then TestMeApp dosen't display cart icon