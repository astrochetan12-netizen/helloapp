public class HelloAPP {git checkout -b feature/UC6-substring-method

    public static void main(String[] args) {

        // Default greeting if no arguments are provided
        if (args.length == 0) {

            System.out.println("Hello, World!");

        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing comma and space using substring()
            String names = "";

            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Display greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}