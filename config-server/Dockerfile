FROM openjdk:8-jdk-alpine
COPY config-server-0.0.1-SNAPSHOT.jar app.jar
VOLUME /tmp
EXPOSE 18888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]