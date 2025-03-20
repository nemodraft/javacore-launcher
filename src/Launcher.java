import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("Launcher debug has began on version: v0.0");

        Scanner scanner = new Scanner(System.in);
        String keyCheck = scanner.nextLine();

        switch (keyCheck) {

            case "Key":
                System.out.print("Correct key: Access granted");
                break;
            default:
                System.out.print("Unknown key: Failed to identify your key");
        }

    }

}