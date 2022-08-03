public class NotificationService {
    public static void main(String[] agrs){
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

    }
}
