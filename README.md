# Book-project

#### Rest service 


#### Run the project 
+ `mvn package`
+ `java -jar target/book-project-1.0-SNAPSHOT.jar`

curl -H "Content-Type: application/json" -X POST -d '{"id":"1","author":"Krochmalski", "title":"IDEA"}' http://localhost:8080/books

curl -s http://localhost:8080/api/v1/namespaces/default/services -XPOST -H 'Content-Type: application/json' -d@service.json

curl -s http://localhost:8080/apis/extensions/v1beta1/namespaces/default/deployments -XPOST -H 'Content-Type: application/json' -d@deployment.json

https://192.168.99.100:8443/api/v1/namespaces/default/pods curl http://localhost:8080/api/v1/namespaces/default/pods