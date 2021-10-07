# Helidon MP Bare

Helidon MP sample app using Okta services

More info about Helidon you can find on [Helidon.io](http://helidon.io)

## Build and run

With JDK11+
```bash
mvn package
java -jar target/helidon.jar
```

## Exercise the application
As you setup your authentication following the [article](https://developer.okta.com/blog/2020/01/09/java-rest-api-showdown) just run:
```
curl -H "Authorization: Bearer $TOKEN" http://localhost:8080/hello
Hello, e@mail.net!
```
