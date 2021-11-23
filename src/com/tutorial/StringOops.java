public class StringOops {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = console.nextString();
        process(name);
    }

    public static void process(String[] args) {
        System.out.println("name");
        if (name == Whitaker) {
            System.out.println("You must be really awesome.");
        }
        replace("a", "e");
        toUppercase(name);
        name.substring(0, 3);
        System.out.println(name + " has " + name.length + " letters");
    }
}