import java.util.*;

// Enum
enum FoodCategory {
    DRINK, MAIN_COURSE, DESSERT
}

// Interface
interface Orderable {
    void placeOrder();
}

// Abstract class
abstract class FoodItem implements Orderable {
    protected String name;
    protected double price;
    protected FoodCategory category;

    public FoodItem(String name, double price, FoodCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayInfo() {
        System.out.println(name + " - " + category + " - $" + price);
    }

    // abstract method already from interface
    public abstract void placeOrder();
}

// Subclass 1
class Pizza extends FoodItem {
    public Pizza(String name, double price) {
        super(name, price, FoodCategory.MAIN_COURSE);
    }

    @Override
    public void placeOrder() {
        System.out.println("🍕 Your pizza \"" + name + "\" is being baked!");
    }
}

// Subclass 2
class Juice extends FoodItem {
    public Juice(String name, double price) {
        super(name, price, FoodCategory.DRINK);
    }

    @Override
    public void placeOrder() {
        System.out.println("🥤 Your juice \"" + name + "\" is being prepared!");
    }
}

// Subclass 3
class Cake extends FoodItem {
    public Cake(String name, double price) {
        super(name, price, FoodCategory.DESSERT);
    }

    @Override
    public void placeOrder() {
        System.out.println("🍰 Your cake \"" + name + "\" is being decorated!");
    }
}

// Main app
public class FoodOrderingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create menu list
        List<FoodItem> menu = new ArrayList<>();
        menu.add(new Pizza("Margherita", 8.99));
        menu.add(new Pizza("Pepperoni", 9.99));
        menu.add(new Juice("Mango Juice", 3.49));
        menu.add(new Juice("Apple Juice", 2.99));
        menu.add(new Cake("Chocolate Cake", 5.99));

        System.out.println("🍴 Welcome to Silent Exit Restaurant 🍴");
        System.out.println("Here is our menu:\n");

        for (int i = 0; i < menu.size(); i++) {
            System.out.print((i + 1) + ". ");
            menu.get(i).displayInfo();
        }

        System.out.print("\nEnter the number of the food you want to order: ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > menu.size()) {
            System.out.println("❌ Invalid choice!");
        } else {
            FoodItem selectedItem = menu.get(choice - 1);
            System.out.println("\nYou ordered: " + selectedItem.name);
            selectedItem.placeOrder();
            System.out.println("✅ Order placed successfully!");
        }

        sc.close();
    }
}
