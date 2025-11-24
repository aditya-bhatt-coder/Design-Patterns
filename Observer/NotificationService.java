import java.util.ArrayList;

public class NotificationService {
    ArrayList<Subscriber> subscriberList;

    public NotificationService() {
        this.subscriberList = new ArrayList<Subscriber>();
    }

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public void notifySubscribers(){
        subscriberList.forEach(listener -> listener.update());
    }
}