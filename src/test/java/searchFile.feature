Feature: Case Study for positive and negative search

Background: Positive and negative search

Given User must be in login page
Then User should enter valid credentials

Scenario: Positive Search

When user enters first four letters "head"
And  selects the products
And clicks on find details 
Then add the item to cart

Scenario: Negative Search

When user searches for a particular product like "headphones"
And try to proceed payment without adding item in the cart
Then TestMe App dosen't display cart icon  