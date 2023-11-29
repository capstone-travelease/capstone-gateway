FROM openjdk:21

VOLUME /tmp

COPY target/*.jar gateway-0.0.1-SNAPSHOT.jar

EXPOSE 3634
ENTRYPOINT ["java","-jar","/gateway-0.0.1-SNAPSHOT.jar"]