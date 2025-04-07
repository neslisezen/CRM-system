FROM openjdk:21-jdk
ARG JAR_FILE=target/customer-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} customer-service.jar
ENTRYPOINT ["java", "-jar", "/customer-service.jar"]