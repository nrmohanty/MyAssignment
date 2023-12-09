Feature: Incident Management

Background:
Given set the Endpoint
And Set the Auth

Scenario: Create Issue
When Create issue with string body '{"fields":{"project":{"key":"RES"},"summary":"create issue in RA project","description":"Creating of an issue using project keys and issue type names using the REST API","issuetype":{"name":"Bug"}}}'
Then validate response code as 201


Scenario: Update issue
When update issue with string body '{"fields":{"description":"Bug creation Using REST API for testing"}}'
Then validate response code as 204

Scenario: Delete issue
When Delete the issue
Then validate response code as 204

Scenario Outline: Create Issue with Multiple data
When Create issue with multiple data string body '{"fields":{"project":{"key":"RES"},"summary":"<summary>","description":"<description>","issuetype":{"name":"Bug"}}}'
Then validate response code as 201
Examples:
|summary|description|
|create issue in RA project|Creating of an issue using project keys and issue type names using the REST API|
|create issue in RA Nihar multiple data project|Creating of an issue using Nihar project keys and issue type names using the REST API|


