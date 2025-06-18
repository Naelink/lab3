import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private final String id;
    private final List<OrderObserver> observers = new ArrayList<>();
    private double totalPrice = 0.0;
    private int itemCount = 0;
    private double shippingCost = 10.0;

    public Order() {
        this.id = UUID.randomUUID().toString(); // unique order ID
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void addItem(double price) {
        totalPrice += price;
        itemCount++;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double newTotal) {
        this.totalPrice = newTotal;
    }

    public int getCount() {
        return itemCount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double newCost) {
        this.shippingCost = newCost;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order #" + id +
                "\nItems: " + itemCount +
                "\nTotal Price: $" + totalPrice +
                "\nShipping: $" + shippingCost +
                "\nFinal Total: $" + (totalPrice + shippingCost);
    }
}
