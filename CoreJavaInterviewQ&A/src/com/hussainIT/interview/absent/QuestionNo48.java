package com.hussainIT.interview.absent;
/* Q ---  in the microservice architecture which of the following statement about the branch microservice pattern are correct  
 * statement 1: the client can directly communicate with the service 2 one service can communication with 
 * one service at a time 3. the developer is allowed  
 *  to configure service calls dynamically
 * 
 * In the context of microservice architecture, the statements can be evaluated as follows:

The client can directly communicate with the service: This statement is generally correct. In microservice architecture, it's common for clients to directly communicate with individual services, especially when using patterns like API Gateway, where the gateway routes requests to the appropriate service.

One service can communicate with one service at a time: This statement is incorrect. In microservice architecture, services can communicate with multiple other services simultaneously, often through RESTful APIs, message brokers, or other forms of inter-service communication.

The developer is allowed to configure service calls dynamically: This statement is generally correct. In microservice architecture, developers often have the flexibility to configure and orchestrate service calls dynamically, especially when using service mesh, API gateways, or dynamic routing mechanisms.
 
 * 
 * Statement 1: Correct
Statement 2: Incorrect
Statement 3: Correct

*
*Alice is working on MongoDB. she mistakenly adds one document after deploying she realize that it  has terrible result which of the following command ? Dababase  {_id : objectId("50001"),title:MangoDB overview"} {_id:objectId("500002"),title :"Nosql overview"},objectId("50001"),title:MangoDB overview"} {_id:objectId("500003"),title :"tutorial point }, here the Nosql overview is the wrong document the valid command for  Nosql overview  a. db.mycol.removeALL({"title",NoSQLOverview"}) b.a. db.mycol.removeAt({"title",NoSQLOverview"}) c.
* a. db.mycol.remove({"title",NoSQLOverview"})  d.db.mycol.removeUp({"title",NoSQLOverview"})
* 
* To remove the document with the title "Nosql overview" in MongoDB, the correct command is:

c. db.mycol.remove({"title": "Nosql overview"})

Explanation:
The command db.mycol.remove({"title": "Nosql overview"}) will remove the document where the title field matches "Nosql overview".
The syntax for the remove method is db.collection.remove(query), where query is the condition that matches the documents to be removed.
Incorrect Options:
a. db.mycol.removeALL({"title",NoSQLOverview"}): This command is incorrect because removeALL is not a valid method, and the syntax for the query is also incorrect.
b. db.mycol.removeAt({"title",NoSQLOverview"}): This command is incorrect because removeAt is not a valid method in MongoDB.
d. db.mycol.removeUp({"title",NoSQLOverview"}): This command is incorrect because removeUp is not a valid method in MongoDB.
*
*
*Ben is working on an application using apache while working it he want to find out which of the following are core Api of kafka. 
*a Producer 2.Consumer 3.Connector 4 Stream 
*
*The core APIs of Apache Kafka are:

Producer API: Allows an application to publish streams of records to one or more Kafka topics.
Consumer API: Allows an application to subscribe to one or more topics and process the stream of records produced to them.
The Connector API and Streams API are also part of Kafka but are not considered core APIs:

Connector API: Used to build and run reusable producers or consumers that connect Kafka topics to existing applications or data systems.
Streams API: Allows building stream processing applications that process data in real-time.
So, the core APIs of Kafka are Producer API and Consumer API.

you are working with Junit for developing an app you are in the middle of coding and want to test only certain portion of the code which of the following is using to disable the unfinished codes while running ?  a. Annotating the unfinised code with @disable then running b. Using @Test code to eliminate unwanted codes while running ? c. Annotating with @gnore to disable unfinish codes 
d. Using @ignoreTest to disable unfinished codes
*
*The correct option is:

c. Annotating with @Ignore to disable unfinished code.

In JUnit, you can use the @Ignore annotation to temporarily disable a test method or a test class. This is useful when you want to skip running certain tests that are not yet complete or are causing issues. When a test is annotated with @Ignore, 
it will be skipped during the test run.

suppose you are working on developing spring boot application you want to use the spring cloud framework but the application needs to handle heavy traffic for this you have to implement load balancing 
from the above info which method is used to implement it in the spring cloud ?

Spring Cloud LoadBalancer:
This is the preferred method in recent Spring Cloud versions (starting with Spring Cloud Hoxton).
Spring Cloud LoadBalancer is a client-side load balancer that automatically distributes traffic across service instances.
You can use it in combination with other Spring Cloud components like Eureka for service discovery.
Example:


@LoadBalanced
@Bean
RestTemplate restTemplate() {
    return new RestTemplate();
}
The @LoadBalanced annotation on a RestTemplate bean automatically configures client-side load balancing.

2. Netflix Ribbon (Deprecated):
In older versions, you could use Netflix Ribbon as a load balancer.
Like Spring Cloud LoadBalancer, Ribbon worked with service discovery tools like Eureka.
Example:

@LoadBalanced
@Bean
RestTemplate restTemplate() {
    return new RestTemplate();
}
Summary: To implement load balancing in a Spring Boot application using Spring Cloud, you should use Spring Cloud LoadBalancer.

The correct option is:

b. Netflix Ribbon

However, this option is correct for older versions of Spring Cloud, where Netflix Ribbon was commonly used for load balancing. If you are using more recent versions of Spring Cloud, the preferred method is Spring Cloud LoadBalancer, but it is not listed as one of your options.

So, based on the options provided, Netflix Ribbon would be the correct choice.


Q in kafka bean crreated the following topic and it has one partition which of these statement about this scenario are correct.  topic bin/kafka-topic.sh --describe --zookeeper localhost:2181 --topic my-sample-topic topic:my-sample-topic  partitionCount:1 ReplicationFactor:3 configs Topic :my-sample-topic partition:0 leader:1 replicas:1,2,0 isr:1,2,0 Statement 1. the leader is the node that is responsible for all the reads and writes for the given partition where each node is leader partitions 2. replications are the list of nodes that replicate the log for the partition irrespective of whether they are leader or they 3. isr is the set of in the in-sync replicas that represent 
a set of the replicas that are currently inactive

1. Statement 1: The leader is the node that is responsible for all the reads and writes for the given partition where each node is leader partitions.

Correct: In Kafka, the leader for a partition is responsible for handling all read and write requests for that partition. The leader is chosen from among the replicas, and only one replica acts as the leader at any given time.
2. Statement 2: Replications are the list of nodes that replicate the log for the partition irrespective of whether they are leader or not.

Correct: In Kafka, the replicas are the set of brokers that store copies of the partition's log. This includes the leader as well as the followers. The followers replicate the leader's log.
3. Statement 3: ISR is the set of in-sync replicas that represent a set of the replicas that are currently inactive.

Incorrect: ISR (In-Sync Replicas) is actually the set of replicas that are currently up-to-date with the leader. These are active replicas that are in sync with the leader, meaning they have fully replicated the leader's log.
Summary:
Statement 1 is correct.
Statement 2 is correct.
Statement 3 is incorrect (since ISR represents active, not inactive, replicas).

you have uploaded a project on the git plateform now you have made some changes in some files of the project in the step you want to modifid file to be automatically detected added to an index and commited which of the following command you use to perform the mentioned function . 
a git commit -a b. git -a c. git commit d. git commit -add 

The correct command to use in this scenario is:

a. git commit -a

Explanation:

The -a option with git commit automatically stages (adds to the index) any modified and deleted files before committing, so you don't need to use git add separately.
This does not include untracked (new) files; you would still need to add those manually using git add.


you have uploaded a project on the git plateform now you have made some changes in some files of the project in the step you want to modifid file to be automatically detected added to an index and commited which of the following command you use to perform the mentioned function .
 a git commit -a b. git -a c. git commit d. git commit -add 

The correct answer is:
d. all of these

Explanation:

Performance: Scaling microservices can improve the overall performance of an application by allocating more resources to high-demand services.
Reuse: Although not directly related to scaling, the modular nature of microservices allows for reusing services across different applications or parts of the same application, which can be an indirect advantage of scalability.
Load Distribution: Scaling in a microservice architecture enables effective load distribution, as each service can be scaled independently to handle varying levels of demand.
Thus, all the options listed represent advantages related to scaling in a microservice architecture.

Alice is working on an application for her client and is required to use a NoSQL database she does not have much knowledge about it and she wants your help so help her determine which of the following are not properties of a nosql database a. CAP  theorem b . it prioritizes high performance, high availability and scalability.
 c. key-value pair storege column store doument store graph databases. d. data and its relationships are stored in separate table
 
The correct answer is:

d. data and its relationships are stored in separate tables

Explanation:

Option a (CAP theorem): The CAP theorem is relevant to NoSQL databases, as it explains the trade-offs between consistency, availability, and partition tolerance in distributed systems, which are characteristics often considered in NoSQL design.
Option b (It prioritizes high performance, high availability, and scalability): This is a key characteristic of NoSQL databases, as they are designed to handle large-scale data and provide high availability and performance.
Option c (Key-value pair storage, column store, document store, graph databases): These are common types of NoSQL databases, each designed for specific types of data and queries.
Option d (Data and its relationships are stored in separate tables): This is a characteristic of relational databases, not NoSQL databases. In NoSQL, data and relationships are often stored together in the same document, graph, or key-value structure, rather than being separated into tables.
Thus, option d is not a property of a NoSQL database.

Bob has created a new collection of shoes in MongoBD shell using the following code if he wants to find the color category of shoes whose qty field is greater then 20 and set it to black and red then which of the following functionality can he perform in this scenario ? code db.shoes.insertMany([ {type:"sneaker",qty:15,color:["black","red"],{uk:6,us:7,euro:40,footlength:26.3}}, {item:"high-tip",qty:30,color : ["grey"], size : {uk:10,us:11,euro,footlength: 29:3}}, {item : "chunk taylor",qty:25,color: ["gel","blue"],size:{uk:11,US:12,euro:45 ,footlength:30.4}} ])     db.shoes.update( {qty:{$gte:20}},{$set:{color: ["blank","red"]}}) 
 b db.shoes.findAndModify({qty:{$gte:20}},{$set:{color: ["blank","red"]}}  
 
 To update the color field for shoes whose qty is greater than 20, Bob can use the following functionality:

a. db.shoes.update( {qty:{$gte:20}},{$set:{color: ["black","red"]}}, {multi: true})

Explanation:

The update method in MongoDB allows you to update documents in a collection.
The query {qty:{$gte:20}} finds all documents where qty is greater than or equal to 20.
The $set operator updates the color field to ["black","red"].
The {multi: true} option is used to update all documents that match the query, not just the first one.
Why the other options are not correct:

Option b (db.shoes.findAndModify({qty:{$gte:20}},{$set:{color: ["black","red"]}})): findAndModify is used to find a document and modify it in one atomic operation, but it will only update one document, not all matching documents. Additionally, the syntax provided here is incorrect for findAndModify.
Thus, the correct approach is to use the update method with the {multi: true} option to ensure all matching documents are updated.

john is working on a project and he is required to use microservice now he wants to know about microservice help me to find which of the following statement are correct about mention context statement 1 : while desiging a microservice the developer should be specific about the focal point of the service. 2 each microservice should be an autonomous business unit of the entire application 3 . 
it is cheaper than SOA and it is used to maintain different server space for different business task  a . 1 and 2 b. 2 and 3 3.1 and 3 4.all of the  these

The correct answer is:

a. 1 and 2

Explanation:

Statement 1: While designing a microservice, the developer should be specific about the focal point of the service.

This is correct. Microservices are designed to perform a specific function or task within an application, often referred to as a "bounded context." Developers should be clear on what each microservice is responsible for to maintain separation of concerns.
Statement 2: Each microservice should be an autonomous business unit of the entire application.

This is correct. Microservices are independent, autonomous units that encapsulate specific business functionalities. They can be developed, deployed, and scaled independently, which is a key advantage of the microservice architecture.
Statement 3: It is cheaper than SOA and it is used to maintain different server space for different business tasks.

This is partially misleading. Microservices and SOA (Service-Oriented Architecture) have different use cases and complexities, and the cost comparison depends on the specific implementation. While microservices allow for different components to be deployed on different servers, the cost savings are not guaranteed and depend on factors like infrastructure, maintenance, and complexity. Therefore, this statement is not entirely accurate.
Given this analysis, statements 1 and 2 are correct, making option a. 1 and 2 the correct choice.


In Apache Airflow if Ben added a new container to an exiting multi-container application then what is the purpose of the --network option in he docker compose container a. the --network option allows the new container to create a new network b. the --network option allows the new container to be connected with the host network c. the network option allows the new container to be connected with an exiting network 
d. the --network option can be used to create an isolated container 

The correct answer is:

c. the --network option allows the new container to be connected with an existing network

Explanation:
The --network option in Docker Compose is used to specify which network a container should connect to when it starts.
Option c is correct because it explains that this option allows the new container to be connected to an existing network, which is often necessary when adding a new container to an existing multi-container application to ensure they can communicate with each other.
The other options are not accurate in the context of the --network option in Docker Compose:

Option a: The --network option does not create a new network; it connects the container to an existing one.
Option b: Connecting to the host network is done using --network host, but that's not the general purpose of the --network option in a multi-container setup.
Option d: The --network option is not specifically for creating isolated containers; rather, it connects containers to specified networks, which can be isolated or shared depending on the network configuration.
















































*
*
*/


public class QuestionNo48 {

	
}
