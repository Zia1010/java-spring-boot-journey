interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SmsNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}

class NotificationService {
    public void sendNotification(Notifier notifier, String message) {
        notifier.send(message);
    }
}

class Notifications {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notifier email = new EmailNotifier();
        Notifier sms = new SmsNotifier();
        Notifier push = new PushNotifier();

        service.sendNotification(email, "Hello via Email!");
        service.sendNotification(sms, "Hello via SMS!");
        service.sendNotification(push, "Hello via Push!");
    }
}
