# BlackJack Client-Server Application

This project is a simple BlackJack client-server application developed in Java. The client and server communicate using JSON for structured data exchange.

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Running the Server](#running-the-server)
- [Running the Client](#running-the-client)
- [Communication Protocol](#communication-protocol)
- [JSON Example](#json-example)
- [License](#license)

## Features

- **Client-Server Architecture**: The project consists of a server that manages the game logic and a client that interacts with the user.
- **JSON Communication**: Client and server exchange data in JSON format.
- **Simple and Extensible**: The project is designed to be easily extensible, allowing additional features or game rules to be added with minimal effort.

## Project Structure

```plaintext
BlackJackClient/
├── .gitignore
├── BlackJackClient.iml
├── src/
│   ├── Cards/
│   │   ├── DeckOfCards.java
│   │   └── PlayingCard.java
│   ├── Players/
│   │   ├── Dealer.java
│   │   ├── Hand.java
│   │   └── Player.java
│   └── Server/
│       ├── BlackJackClient.java
│       ├── BlackJackClient2.java
│       ├── BlackJackGame.java
│       └── BlackJackServer.java
└── .idea/
    ├── misc.xml
    ├── modules.xml
    ├── uiDesigner.xml
    └── workspace.xml
```

## Getting Started

### Prerequisites

- **Java Development Kit (JDK) 8 or higher**: Make sure you have the JDK installed on your machine.
- **json-simple Library**: Download and include the [json-simple](https://repo1.maven.org/maven2/com/googlecode/json-simple/json-simple/1.1.1/) library in your project.

### Running the Server

1. Compile the server code:

    ```bash
    javac src/Server/BlackJackServer.java
    ```

2. Run the server:

    ```bash
    java src/Server/BlackJackServer
    ```

### Running the Client

1. Compile the client code:

    ```bash
    javac src/Server/BlackJackClient.java
    ```

2. Run the client:

    ```bash
    java src/Server/BlackJackClient
    ```

### Communication Protocol

The client and server communicate using JSON objects. Each message sent by the client or server is a JSON object string. The server processes the JSON object and sends back a JSON response.

### JSON Example

Here's an example of a JSON message that might be sent by the client:

```json
{
  "action": "play",
  "data": "Hit"
}
```

And an example response from the server:

```json
{
  "result": "Card dealt",
  "card": {
    "rank": "Ace",
    "suit": "Spades"
```
  }
}
