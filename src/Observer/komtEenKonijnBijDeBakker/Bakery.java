package Observer.komtEenKonijnBijDeBakker;

public class Bakery {

    private final NotificationService notificationService;

    public Bakery() {
        this.notificationService = new NotificationService();
    }
    public void newItemPromotion(){
        notificationService.notifyCustomers(Event.NEW_ITEM);
    }
    public void salePromotion(){
        notificationService.notifyCustomers(Event.SALE);
    }

    public NotificationService getService(){
        return notificationService;
    }

    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        bakery.getService().subscribe(Event.NEW_ITEM, new CarrotCakeListener("Ko Nijn"));
        bakery.getService().subscribe(Event.NEW_ITEM, new FishCakeListener("Kit-Kat"));
        bakery.getService().subscribe(Event.SALE, new FishCakeListener("Mr.Cheapskate"));

        bakery.newItemPromotion();
        System.out.println("==========================================");

        bakery.salePromotion();
        System.out.println("==========================================");

    }
}
