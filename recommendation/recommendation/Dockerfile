FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} recommendation-client-web-application.jar

CMD ["java",  "-jar", "/recommendation-client-web-application.jar"]
