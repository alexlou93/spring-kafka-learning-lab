A simple Spring Boot application demonstrating how to produce and consume messages using **Apache Kafka**.  
This project runs locally with **Zookeeper** and **Kafka broker**, and exposes REST endpoints to publish both
plain text and JSON messages.

---

## 🚀 Features

- Kafka Producer using `KafkaTemplate`
- Kafka Consumer using `@KafkaListener`
- Produces messages via REST API
  - Send plain string messages
  - Send JSON payload (`User` model)
- Topic created programmatically with `NewTopic` bean
- Runs locally — no external infrastructure needed

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Apache Kafka (local)
- Maven
