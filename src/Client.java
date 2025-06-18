public class Client {
    public static void main(String[] args) {
        Order order = new Order();

        // Attach observers
        order.attach(new PriceObserver());
        order.attach(new QuantityObserver());

        // Add items
        order.addItem(40.0);
        order.addItem(45.0);
        order.addItem(30.0);
        order.addItem(50.0);
        order.addItem(35.0);
        order.addItem(25.0);

        System.out.println("\n--- Final Order Summary ---");
        System.out.println(order);
    }
}
