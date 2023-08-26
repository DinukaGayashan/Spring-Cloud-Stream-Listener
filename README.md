<h1 align="center">Spring Cloud Stream Listener</h1>
<p align="center">Kafka message listener using Spring Cloud Streams</p>

## Overview

Spring Cloud Stream is a framework for building highly scalable event-driven microservices connected with shared
messaging systems. The framework provides a flexible programming model built on already established and familiar Spring
idioms and best practices, including support for persistent pub/sub semantics, consumer groups, and stateful partitions.

Spring Cloud Stream simplifies event-driven microservices development by offering abstractions and tools for
messaging-based applications. It facilitates communication within distributed systems using messaging middleware such as
Apache Kafka or RabbitMQ. The framework's "binders" abstract away the interaction with message brokers, enabling
to concentrate on message production and consumption rather than broker-specific code. This abstraction
streamlines migration between different message brokers, as it often requires only dependency adjustments in the code.

## Design

Spring Cloud Streams consist of three main components;

1. Binder - The component that implements communication with a specific message broker. For example, there is a RabbitMQ
   Binder, a Kafka Binder, and so on.
2. Binding - The interface for sending and receiving messages. This component links the abstract channels in your code
   with
   a topic or queue that’s handled by the binder.
3. Message - The data structure used to communicate with the bindings between your code and your message broker. How
   this
   data is packaged and communicated over the message broker is determined by the binder.

<p align="center">
    <img src="https://tanzu.vmware.com/developer/guides/scs-what-is/images/scs-what-is-01.png#diagram" width="500px">
</p>

## Implementation

In this setup, two message consumers are employed: one for the "user" aspect and the other for "cryptocurrency." The
user service retrieves messages from a single channel, while the cryptocurrency service extracts messages from two
separate channels. These channels serve as conduits for serialized messages from their respective classes, with
automatic parsing of the transmitted objects.

As the implementation employs the Kafka binder, the channels correspond to Kafka topics. Switching to an alternative
messaging system necessitates just a few steps. Primarily, the binder dependency needs to be updated. Additionally, if
necessary, adjustments can be made to configurations such as the broker address and channel identifiers. This modular
approach allows for seamless migration to different messaging systems, enhancing flexibility and maintainability.

### References

* https://spring.io/projects/spring-cloud-stream
* https://tanzu.vmware.com/developer/guides/scs-what-is/

