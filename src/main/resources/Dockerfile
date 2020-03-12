FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8000
ADD  mybatis_plus-1.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=prod","-c"]
