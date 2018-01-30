#FROM jeanblanchard/java:8
#MAINTAINER hiennguyen
#


#
#FROM openjdk:8-jdk-alpine
#MAINTAINER hiennguyen
#LABEL description="My project"
#VOLUME /tmp
##ARG JAR_FILE
##ADD ${JAR_FILE} app.jar
##ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#COPY target/book-0.0.1.jar book-0.0.1.jar
#CMD java -jar book-0.0.1.jar
#EXPOSE 8082
#

#FROM java:8
#RUN apt-get update
#RUN apt-get install -y maven
#WORKDIR /Users/hien/Desktop/Book-project
#COPY pom.xml /app/pom.xml
#COPY src /app/src
#RUN ["mvn", "package"]
#CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java","-jar", "target/ book-0.0.1.jar"]