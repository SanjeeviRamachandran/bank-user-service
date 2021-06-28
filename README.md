# Spring-boot Banking
Example project demonstrating the use of Java and Spring-boot to build a microservice to be used by an online bank

## Running locally
```
./mvnw clean package
java -jar target/bank-user-service-0.0.1.jar
```

## Running on Docker
```
docker build -t "spring-boot:bank-user-service" .
docker run -p 8080:8080 spring-boot:bank-user-service
```
