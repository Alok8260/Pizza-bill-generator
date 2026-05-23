import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pizza Type (V/NV): ");
        String pizzaType = sc.nextLine();

        Pizza pizza = new Pizza(pizzaType);

        System.out.print("Do you want extra cheese? (yes/no): ");
        String cheese = sc.nextLine();

        if (cheese.equalsIgnoreCase("yes")) {
            pizza.addExtraCheese();
        }

        System.out.print("Do you want extra topping? (yes/no): ");
        String topping = sc.nextLine();

        if (topping.equalsIgnoreCase("yes")) {
            pizza.addExtraTopping();
        }

        System.out.print("Is it takeaway? (yes/no): ");
        String takeaway = sc.nextLine();

        if (takeaway.equalsIgnoreCase("yes")) {
            pizza.addTakeawayCharge();
        }

        pizza.printBill();

        sc.close();
    }
}