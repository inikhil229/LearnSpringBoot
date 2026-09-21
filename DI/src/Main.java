public class Main {
    static void main(String[] args) {
    NotificationService notification = new SmsNotificationService();
    OrderService orderService = new OrderService(notification);
    orderService.PlaceOrder();
    }
}