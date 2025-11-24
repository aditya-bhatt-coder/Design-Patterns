public class Main {
    public static void main(String[] args){
        NotificationService notificationService = new NotificationService();

        EmailSubscriber emailSubscriber = new EmailSubscriber();
        PushMessageSubscriber pushMessageSubscriber = new PushMessageSubscriber();

        notificationService.subscribe(emailSubscriber);
        notificationService.subscribe(pushMessageSubscriber);

        notificationService.notifySubscribers();

        notificationService.unsubscribe(emailSubscriber);

        notificationService.notifySubscribers();
    }
}