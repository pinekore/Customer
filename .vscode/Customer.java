public class Customer {
    public void makePayment(double amount, int paymentMethod){ 
    while (true) {
        System.out.println("Please choose a payment method from 1-5:");
        System.out.println("1: Credit");
        System.out.println("2: Debit");
        System.out.println("3: PayLah");
        System.out.println("4: PayNow");
        System.out.println("5: Apple Pay");
        paymentMethod = scanner.nextLine();
        switch (paymentMethod) {
            case 1:
                System.out.println("You have paid" + amount + "with your Credit Card, thank you!");
                return;
            case 2:
                System.out.println("You have paid" + amount + "with your Debit Card, thank you!");
                return;
            case 3:
                System.out.println("You have paid" + amount + "with PayLah, thank you!");
                return;
            case 4:
                System.out.println("You have paid" + amount + "with PayNow, thank you!");
                return;
            case 5:
                System.out.println("You have paid" + amount + "with Apple Pay, thank you!");
                return;
            default:
                System.out.println("Please try again! Enter a number from 1 to 5, corresponding to your preferred payment method.");
        }
    }
    }
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double amount = price;
    scanner.nextLine();

    makePayment(amount);
}