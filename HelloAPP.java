public class HelloAPP {
    public static void main(String[] args) {

        String name;

        // Check if argument is given
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}