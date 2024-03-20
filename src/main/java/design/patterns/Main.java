package design.patterns;

import design.patterns.networks.Facebook;
import design.patterns.networks.Network;
import design.patterns.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("Input username: ");
        String username = reader.readLine();
        System.out.println("Input password: ");
        String password = reader.readLine();

        System.out.println("Input message: ");
        String message = reader.readLine();

        System.out.println("""
                Choose social network fro posting message.
                1 - Facebook
                2 - Twitter
                """);
        int choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            network = new Facebook(username, password);
        } else if (choice == 2) {
            network = new Twitter(username, password);
        }
        network.post(message);
    }
}