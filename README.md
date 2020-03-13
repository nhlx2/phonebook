#What does this do?

This is a REST api to a phonebook application.  It uses Spring Data REST to enable its hypermedia powered API
which makes for a very succinct and discoverable API.  It is a mere handful of mostly short Java classes that
take full advantage of what dependency injection containers (.i.e, Spring) have to offer.  Not a single
controller had to be written.  This API is to be consumed by a separate companion ReactJS clientside/frontend
app which makes use of the Hypermedia capabilities of this API server and is to be installed separately.

This installing uses the in-memory H2 relational database for ease of testing. However other database (like
PostgreSQL, as shown) can be configured.  Please note that specifically with PostgreSQL you will have to
create the actual tables and sequences needed by the database.

##Installing depencies and running the app

This is a maven based application, which can be installed and run by issuing the following command in the
current directory.

`./mvnw spring-boot:run`

Or

`mvn spring-boot:run`

This will ultimately launch an API server listening on http://localhost:8080







