package Factory;

public class NotificationFactory {
    public Notification acceptType(String type){
        switch (type) {
            case "EMAIL":
                return new EmailNotification();
            case "WHATSAPP":
                return new WhatsappNotification();
            case "SMS":
               return new SmsNotification();
            default:
                throw new IllegalArgumentException("Unsupported notification type");                
        }
    }
}
