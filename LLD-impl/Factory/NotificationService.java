package Factory;

public class NotificationService {
    NotificationFactory factory = new NotificationFactory();

    public void notifyUser(String type, String message){
        Notification notification = factory.acceptType(type);
        notification.send(message);
    }
}
