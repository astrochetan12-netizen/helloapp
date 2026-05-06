public class HelloAPPgit checkout -b feature/UC7-string-join {

    public static void main(String[] args) {

        String names = "World";

        // If arguments are provided
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}