Feature: Moves to cart without adding to cart

Scenario: The one where the user moves to cart without adding any item in it
Given Alex has registered to TestMeApp
When Alex searches a particular product like headphones
And Try to proceed to payment without adding any element to the cart
Then Test me doesn't display the cart icon