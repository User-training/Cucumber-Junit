
Feature: Login Features
This feature includes scenario that would validate the following feature.
1)I want to login as admin
2)Login as inia.amrutha
3)Login with negative data

Background: 
Given I am able to navigate on to the login page

@Login 
Scenario: Login as Admin
When I enter the username as "Admin"
And  I enter Password as "admin123"
And  I click on Login button
Then I should see username as "Welcome Hansika"

Scenario: Login as india.amrutha
When I enter the username as "Admin"
And  I enter Password as "admin123"
And  I click on Login button
Then I should see username as "Welcome Nikhil"

@InvalidLogin 
Scenario: Login with negative data
When I enter the username as "amrutha"
And  I enter Password as "Amrutha"
And  I click on Login button
Then I should see error message as "Invalid Credentials"