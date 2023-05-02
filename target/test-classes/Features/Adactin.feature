Feature:Validation Of LoginPage in Adactin Web Application
Scenario:TC-01-Validation Of LoginPage With Valid Credentials
Given User is on LoginPage
When User Enters Valid UserName and Password
And User Clicks On Login Button
Then User Verifies HomePage is Displayed
When User Select Prefered Location
When User Select Prefered Hotel
When User Select Prefered Room_Type
When User Select No of Rooms
When User Select Check in Date
When User Select Check Out Date
When User Select No of Adults Per Room
When User Select No of Children Per Room
Then User Clicks Search Button
And User Click the Radio Button
Then User Click the Continue Button
When User Enters the First Name
When User Enters the Last Name
When User Enters the Address
When User Enters the Card Number
When User Select the Card Type
When User Enters the Exp Month
When User Enters the Exp Year
When User Enters the Cvv Number
Then User Click the BookNow Button
And User Prints the Order Id


Scenario Outline:TC-02 Validation of Login Page With InValid Credentials
When User Enters Invalid "<UserName>" and "<Password>"
And User Click Login Button

Examples:
|UserName|Password|
|santhanam123|greens@123|
