package Factory;

public class WhatsappNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("This is a whatsapp notification send:"+message);
    }
}
