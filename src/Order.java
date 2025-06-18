import java.util.List;

public class Order {
    private List<OrderObserver> observers;
    private double totalPrice;
    private int itemCount;
    private double shippingCost;

    public void attach(OrderObserver observer) {
        // signature only
    }

    public void detach(OrderObserver observer) {
        // signature only
    }

    public void addItem(double price) {
        // signature only
    }

    private void notifyObservers() {
        // signature only
    }

    public double getTotalPrice() {
        return 0;
    }

    public int getCount() {
        return 0;
    }

    public double getShippingCost() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
