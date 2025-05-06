public class OrderService {
    private final OrderRepository orderRepo;

    public OrderService(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order placeOrder(Order order) {
        if (!"APPROVED".equals(order.getMealPlan().getStatus())) {
            throw new IllegalStateException("Only approved meal plans can be ordered.");
        }
        order.setStatus("PLACED");
        return orderRepo.save(order);
    }

    public void cancelOrder(String orderId) {
        Order order = orderRepo.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        order.setStatus("CANCELED");
        orderRepo.save(order);
    }
}
