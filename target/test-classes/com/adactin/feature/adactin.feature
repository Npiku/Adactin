Feature: Testing Adactin Application End to End process
@loginpage
Scenario Outline: Verify that User is able to login the application

Given User lanuch the application

When user enters the valid username "<username>"
And user enther the Valid Passord "<password>"
And user is able to click the login Button
Then user verify the homepaage navigate to search hotel

Examples:
|username|password|
|AAA|111|
|ppp|222|
|Nithyaprakash|prakash12|

@hotelpage
Scenario: Verify that User is lands on search Hotel page

When user enters the valid location 
And user enther the Valid Hotels 
And user enther the Valid Room Type 
And user enther the Valid Number of Rooms 
And user enther the Valid Adults per room
And user enther the Valid Childrens per room
And user is able to click the search Button
Then user verify the search Hotel navigate to Select hotel

Scenario: Verify that User is lands on Select Hotel page

When user select the Radio Button
And user is able to click the Continue Button
Then user verify the Select hotel navigate to Book a hotel page

Scenario: Verify that User is lands on Book a Hotel page

When user enter the valid First Name
And user enter the valid Last Name
And user enter the valid Billing Address
And user enter the valid Use 16 digit Credit Card No
And user enter the valid Credit Card Type
And user enter the valid Expiry Date
And user enter the valid CVV Number
And user is able to click the Booknow Button
Then user verify the Book a Hotel page navigate to Booking conformation page

Scenario: Verify that User is lands on Booking conformation page

When user is able to click the logout Button 
Then user verify the Booking conformation page navigate to home page



 