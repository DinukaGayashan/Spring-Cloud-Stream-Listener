<h1 align="center">Spring Cloud Stream Listener</h1>
<p align="center">Kafka message listener using Spring Cloud Streams</p>

## Overview

Spring Cloud Stream is a framework for building highly scalable event-driven microservices connected with shared
messaging systems. The framework provides a flexible programming model built on already established and familiar Spring
idioms and best practices, including support for persistent pub/sub semantics, consumer groups, and stateful partitions.

It simplifies the development of event-driven microservices by providing abstractions and tools for building
messaging-based applications. It focuses on enabling communication between various parts of a distributed system through
a messaging middleware like Apache Kafka, RabbitMQ, or others.

The components that abstract away the communication with message brokers, referred to as “binders,” allow developers to
focus on code that emits and consumes messages without having to write code for a specific broker. Because of this, that
also means migrating from one message broker to another can be as simple as the dependencies of the code.

## Design

Spring Cloud Streams consist of three main components;

1. Binder - The component that implements communication with a specific message broker. For example, there is a RabbitMQ
Binder, a Kafka Binder, and so on.
2. Binding - The interface for sending and receiving messages. This component links the abstract channels in your code with
a topic or queue that’s handled by the binder.
3. Message - The data structure used to communicate with the bindings between your code and your message broker. How this
data is packaged and communicated over the message broker is determined by the binder.

<p align="center">
    <img src="https://tanzu.vmware.com/developer/guides/scs-what-is/images/scs-what-is-01.png#diagram" width="500px">
</p>



### References

* https://spring.io/projects/spring-cloud-stream
* https://tanzu.vmware.com/developer/guides/scs-what-is/

