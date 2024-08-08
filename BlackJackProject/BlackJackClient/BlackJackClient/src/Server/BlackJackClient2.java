package Server;

import org.json.JSONObject;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * The (duplicate) client class that connects to the server and interacts with the user through the console.
 * This client connects to the Blackjack server at a specified address and port, and reads responses from the
 * server and sends user inputs back to the server.
 * This client handles the communication in a loop until the server closes the connection or the user decides to quit.
 * Duplicate client running alongside initial client from the server allows multiple instances of the game at once.
 *
 * @author bradley.collins
 */
public class BlackJackClient2 {
    private static final String serverAddress = "localhost";
    private static final int portNumber = 55555;

    public static void main(String[] args) {
        try (Socket socket = new Socket(serverAddress, portNumber);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner stdIn = new Scanner(System.in)) {

            String serverResponse;
            while ((serverResponse = in.readLine()) != null) {
                JSONObject responseJson = new JSONObject(serverResponse);
                System.out.println(responseJson.getString("message"));

                if (responseJson.getBoolean("expectsInput")) {
                    String userInput = stdIn.nextLine();
                    JSONObject requestJson = new JSONObject();
                    requestJson.put("input", userInput);
                    out.println(requestJson.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}