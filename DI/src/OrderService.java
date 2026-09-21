public class OrderService {
    NotificationService notification;
    public OrderService(NotificationService notification){
        this.notification = notification;
    }
    public void PlaceOrder(){
        System.out.println("order placed");
        notification.SendNotification();
    }
}
