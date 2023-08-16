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
@Release1.0
Feature: HomePage Menu links
As a end user, I should be able to use all menu links in homepage.

@Regression @Smoke @Sanity
Scenario Outline: Positive homepage menu links test (other than Saved link)
Given end user is in homepage
When click on link "<link>"
Then user should be take to specific link "<link>" page

Examples:
|link|
|Motors|
|Electronics|
|Collectibles|