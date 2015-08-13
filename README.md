## Automated web tests using Serenity and Maven

Run the tests :

Specify test class to run and url (optional: qa9 used by default ):

mvn clean integration-test serenity:aggregate -Dtest.name=SearchTest -Durl=http://qa9.goeuro.int

The reports will be generated in `\target\site\serenity`.
