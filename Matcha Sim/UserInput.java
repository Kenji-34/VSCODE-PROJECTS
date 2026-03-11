import java.util.Scanner;
public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner){
        this.scanner = scanner;
    }

    public String getString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public int getInt(String prompt){
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Try Again, Please input a valid number");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    
}
