package Factory;

public class SmsNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("This is a sms notification send: "+message);
    }
    
}
