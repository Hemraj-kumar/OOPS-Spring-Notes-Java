package Factory;

public class EmailNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("This is a email notification send : "+message);
    }
    
}
