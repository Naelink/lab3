public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getCount() > 5) {
            System.out.println("[QuantityObserver] More than 5 items → Free shipping.");
            order.setShippingCost(0.0);
        } else {
            order.setShippingCost(10.0);
        }
    }
}
