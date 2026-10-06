public class Hello {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("WELCOME TO DEVOPS ENGINEER " + name);
        } else {
            System.out.println("Name not given");
        }
    }
}
