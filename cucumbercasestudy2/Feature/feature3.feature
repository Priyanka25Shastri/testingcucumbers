Feature: search engine
Scenario: searching products in testme app using login credentials
Given user logs in 
When he enters search word head in search box
And clicks on find details
And clicks on add to cart,cart icon,checkout,proceed to pay
And selects hdfc bank and clicks on continue
And enters username and password
And enters trans password
Then purchase the product
    


