import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Welcome to Bubble Cafe: ");
        
        Scanner scanner = new Scanner(System.in);
        UserInput input = new UserInput(scanner);

        String name = input.getString("Enter your name:");
        int age = input.getInt("Enter your age:");

        Inventory inventory = new Inventory();
        Item order_1 = new Item("Royal Milk Tea", 11.00, 2);
        inventory.addItem(order_1);
        inventory.displayInventory();
        System.out.println("Name: " + name + " \nAge: " + age);

    }
}
