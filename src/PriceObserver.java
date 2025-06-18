public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            System.out.println("[PriceObserver] Order > $200 → Applying $20 discount.");
            order.setTotalPrice(order.getTotalPrice() - 20);
        }
    }
}
