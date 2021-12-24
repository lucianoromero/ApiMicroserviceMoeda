#
# Build stage
#
FROM maven:3.6.0-jdk-8-alpine AS build 
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -DskipTests -f /home/app/pom.xml clean package 

#
# Package stage
#
FROM openjdk:8-jdk-oraclelinux7
COPY --from=build /home/app/target/ApiMicroserviceMoeda-0.0.1-SNAPSHOT.jar /usr/local/lib/ApiMicroserviceMoeda-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/ApiMicroserviceMoeda-0.0.1-SNAPSHOT.jar"]