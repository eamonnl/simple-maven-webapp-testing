A module that demonstrates how to seperate integration and unit tests for a webapp

To launch the webapp using an embedded tomcat 6 server on port 8080:

mvn tomcat6:run

The API will be available at http://localhost:8080

To run tests:

mvn install -DskipUTs : Skips Unit tests
mvn install -DskipITs : Skips Integration tests
mvn install -DskipTests : Skips both Unit and Integration Tests

Note: The maven build-helper plugin will reserve a random port to Tomcat to use and pass 
this as an environment variable to the integration tests.
