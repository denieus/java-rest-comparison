# Java REST API Showdown: A Comparison Among The Best Frameworks In The Market

This example shows how to use Okta's Authentication API with Java integrating with Kafka.

Please read [Java REST API Showdown: A Comparison Among The Best Frameworks In The Market](https://developer.okta.com/blog/2020/01/09/java-rest-api-showdown) for a tutorial that shows you how to build each application.

**Prerequisites:** 

* [Java 11](https://adoptopenjdk.net/)

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Help](#help)
* [Links](#links)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/oktadeveloper/okta-java-rest-api-comparison-example.git
```

This will get a copy of the project locally. There are three folders: `micronaut`, `quarkus`, and `spring-boot`. 

### Create a Free Okta Developer Account

If you don't have one, [create an Okta Developer account](https://developer.okta.com/signup/). After you've completed the setup process, log in to your account and navigate to copy the `Org URL` in from the top right corner of the page, it will look something like: `https://dev-123456.okta.com`.

Paste the value of `{yourOktaDomain}` into the following files:

* `micronaut/src/main/resources/application.yml`
* `quarkus/src/main/resources/application.properties`
* `spring-boot/src/main/resources/application.properties`

### Start the application

To start each application you can use the commands below:

* Micronaut: `./mvnw compile exec:exec`
* Quarkus: `./mvnw compile quarkus:dev`
* Spring Boot: `./mvnw spring-boot:run`

## Links

This example uses the following libraries provided by Okta:

* [Okta Spring Boot Starter](https://github.com/okta/okta-spring-boot)

## Help

Please post any questions as comments on the [blog post](https://developer.okta.com/blog/2020/01/09/java-rest-api-showdown), or visit our [Okta Developer Forums](https://devforum.okta.com/). 

## License

Apache 2.0, see [LICENSE](LICENSE).
