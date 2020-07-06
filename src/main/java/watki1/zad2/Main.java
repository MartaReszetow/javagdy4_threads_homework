package watki1.zad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HelloWorldShouter helloWorldShouter = new HelloWorldShouter();
        Thread thread = new Thread(helloWorldShouter);

        thread.start();

        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            command = scanner.nextLine();
            helloWorldShouter.setAdditionalText(command);
        } while (command.equals("quit"));


    }
}
