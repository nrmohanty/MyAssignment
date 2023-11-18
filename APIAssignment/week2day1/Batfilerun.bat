cd C:\Users\nm34448\TestLeaf\week2day1\NewManAPIRequest
newman run  Week2Day1.postman_collection.json  -e QA.postman_environment.json -g "My Workspace.postman_globals.json" -d TestData.csv  -r htmlextra
