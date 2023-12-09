Feature: Incident Management

Background:
Given set the Endpoint
And Set the Auth

Scenario: Get AllIncidents
When get All incidents
Then validate response code as 200

Scenario: Create Incident
When Create incident with string body '{"short_description": "Laptop","description": "service laptop"}'
Then validate response code as 201

Scenario Outline: Create Incdeints with Multiple files
When Create incident with file "<fileName>"
Then validate response code as 201
Examples:
|fileName|
|Incident1.json|
|Incident2.json|


Scenario Outline: Create Incdeints with Multiple data
When Create incident with data '<short_description>' and '<description>
Then validate response code as 201
Examples:
|fileName|
|Incident1.json|
|Incident2.json|



Scenario: Update incident
When update incident with string body '{"short_description": "Mobile","description": "service Mobile"}'
Then validate response code as 200

Scenario: Delete Incident
When Delete the incident
Then validate response code as 204




