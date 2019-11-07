FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=q1.jar

ADD ${JAR_FILE} q1.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/q1.jar"]