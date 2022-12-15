package Observer.example_Two;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public void newItemPromotion(){
        notificationService.notifyCustomer();
    }

    public NotificationService getService() {
        return notificationService;
    }
}
