#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Search functionality
As a end user, I should be able to search for products.

#Scenario: Positive search funtionality test by clicking search button
#Given end user is in homepage
#When enters a valid product search textbox
#And clicks search button
#Then user should be taken to search result page
#And should see available products
#
#Scenario: Positive search funtionality test by hitting Enter key
#Given end user is in homepage
#When enters a valid product search textbox
#And hits Enter key
#Then user should be taken to search result page
#And should see available products
#
#Scenario: Negative search funtionality test by clicking search button
#Given end user is in homepage
#When enters a invalid product search textbox
#And clicks search button
#Then should see no result found error message should be displayed
#
#Scenario: Positive search funtionality test by hitting Enter key
#Given end user is in homepage
#When enters a invalid product search textbox
#And hits Enter key
#Then should see no result found error message should be displayed

Scenario Outline: Positive search funtionality test by Data Driven
Given end user is in homepage
When enters a valid product "<validProduct>" search textbox
And clicks search button
Then user should be taken to valid product "<validProduct>" search result page
And should see available products

Examples:
|validProduct|
|samsung|
|apple|
|pixel|
|surface pro|
|lg|
|macbook|

Scenario Outline: Negative search funtionality test by Data Driven
Given end user is in homepage
When enters a invalid product "<invalidProduct>" search textbox
And clicks search button
Then user should be taken to invalid product "<invalidProduct>" search result page
And should see available products
Then should see no result found error message should be displayed

Examples:
|invalidProduct|
|329805723097590ujskdjflksdfjvnlksdvnlksdnvlksdvn|
|329805723097599ujskdjflksdfjvnlksdvnlksdnvlksdvn|

