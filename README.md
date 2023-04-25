# Spring Boot WebSocket Chat Application

how to use WebSocket API with Spring Boot and build a simple group chat application at the end.
WebSocket is a communication protocol that makes it possible to establish a two-way communication channel between a server and a client.

WebSocket works by first establishing a regular HTTP connection with the server and then upgrading it to a bidirectional websocket connection by sending an Upgrade header.

WebSocket is supported in most modern web browsers and for browsers that don’t support it, we have libraries that provide fallbacks to other techniques like comet and long-polling.

But  WebSocket is just a communication protocol. It doesn’t define things like - 
How to send a message only to users who are subscribed to a particular topic, or how to send a message to a particular user. We need STOMP for these functionalities.
## Requirements

1. Java - 1.8.x
2. Maven - 3.x.x

## Usage

**1. Clone the application**

```bash
git clone https://github.com/callicoder/spring-boot-websocket-chat-demo.git
```

**2. Build and run the app using maven**

```bash
cd spring-boot-websocket-chat
mvn package
java -jar target/websocket-demo-1.0.0-SNAPSHOT.jar
```

Alternatively, you can run the app directly without packaging it like so -

```bash
mvn spring-boot:run
```

You can just type in your name and start chatting with others. If no one is available in the chat room, then you can open the app in two tabs, login with different usernames and start sending messages.