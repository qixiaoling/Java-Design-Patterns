package Observer.komtEen_basic;

public class Bakery {

 private final NotificationService notificationService;

    public Bakery() {
        notificationService = new NotificationService();
    }

    public NotificationService getService() {
        return notificationService;
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers();
    }

    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        bakery.getService().subscribe(new CarrotCakeListener("Ko Nijn"));
        bakery.newItemPromotion();
    }
}
