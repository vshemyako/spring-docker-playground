FROM openjdk:8

VOLUME /tmp
ADD maven/docker-0.0.1-SNAPSHOT.jar docker-playground.jar
RUN sh -c 'touch /docker-playground.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-playground.jar"]
EXPOSE 8080