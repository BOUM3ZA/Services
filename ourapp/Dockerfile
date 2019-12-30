FROM maven:2.5.1-jdk-8-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM gcr.io/distroless/java  
COPY --from=build /usr/src/app/target/ourapp-1.0.0-SNAPSHOT.jar /usr/app/ourapp-1.0.0-SNAPSHOT.jar  
EXPOSE 8080  
ENTRYPOINT ["java","-jar","/usr/app/ourapp-1.0.0-SNAPSHOT.jar"]  
