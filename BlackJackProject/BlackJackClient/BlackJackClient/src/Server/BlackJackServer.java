package Server;

import java.io.*;
import java.net.*;
import java.util.concurrent.*;

/**
 * The server class that accepts client connection and handles multiple clients using threading.
 * The server listens for incoming client connections on the specified port.
 * When a client connects, the server creates a new thread to handle the game for that client.
 * The server uses an ExecutorService to manage the threads.
 *
 * @author bradley.collins
 */
public class BlackJackServer {
    private static final int PORT = 55555;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool(); //ExecutorService to manage threads, handling multiple clients

        //ensure the ServerSocket is closed properly
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Blackjack server started...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                executor.execute(new BlackJackGame(clientSocket)); //create a new thread for this client; start
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

