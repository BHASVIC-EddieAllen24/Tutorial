import java.util.Scanner;

class UserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. How old are you?", name);
        int age = Integer.parseInt(scanner.nextLine());

        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.printf("%d is an excellent age to start programming. What language do you prefer?", age);
        String language = scanner.nextLine();
        System.out.printf("%s is a very popular programming language.", language);

        scanner.close();

    }
}
