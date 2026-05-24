public class Pizza {

    private int basePrice;
    private int pizzaPrice;
    private String pizzaType;

    private String customerName;
    private String mobileNumber;

    private int extraCheesePrice = 100;
    private int extraToppingPrice = 200;
    private int bagPack = 20;

    private boolean extraCheeseAdded = false;
    private boolean extraToppingAdded = false;
    private boolean takeawaySelected = false;

    public Pizza(String pizzaType) {

        this.pizzaType = pizzaType;

        if (pizzaType.equalsIgnoreCase("v")) {
            this.pizzaPrice = 200;
        } else {
            this.pizzaPrice = 300;
        }
    }
    public void userDetails(String customerName, String mobileNumber){
        this.customerName=customerName;
        this.mobileNumber=mobileNumber;
    }

    public void addExtraCheese() {

        extraCheeseAdded = true;
        this.basePrice += extraCheesePrice;
    }

    public void addExtraTopping() {

        extraToppingAdded = true;
        this.basePrice += extraToppingPrice;
    }

    public void addTakeawayCharge() {

        takeawaySelected = true;
        this.basePrice += bagPack;
    }

    public void printBill() {

        System.out.println("----- PIZZA BILL -----");
        System.out.println("Customer Name: "+ customerName);
        System.out.println("Customer Mobile Number: "+ mobileNumber);

        System.out.println("Pizza Type : " + pizzaType);

        if (extraCheeseAdded) {
            System.out.println("Extra Cheese : " + extraCheesePrice);
        }

        if (extraToppingAdded) {
            System.out.println("Extra Topping : " + extraToppingPrice);
        }

        if (takeawaySelected) {
            System.out.println("Bag Charge : " + bagPack);
        }
        System.out.println("Pizza Price " + pizzaPrice);
    
        System.out.println("Total Bill : " + (basePrice + pizzaPrice));
    }
}