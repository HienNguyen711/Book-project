FROM jeanblanchard/java:8
COPY target/book-0.0.1.jar book-0.0.1.jar
CMD java -jar book-0.0.1.jar
EXPOSE 8082

