# Conference Application
A Spring Boot application with websockets using SockJs.

## Tech Stack
\- Java  
\- Spring Boot  
\- Maven  

## Prerequisites
\- JDK 21  
\- Maven 3.9\+

## Build
```mvn clean install```

## Run
```
mvn spring-boot:run
```
Or:
```
java -jar target/app.jar
```

Use the file `test-chat.html` in `Socket Test` folder to test the websocket connection.

## Configuration
Set properties in `src/main/resources/application.properties` or use environment variables:
```properties
server.port=8080
```

## Packaging
```bash
mvn clean package
```

## Project Structure (example)
```
src
 └─ main
     ├─ java
     └─ resources
```