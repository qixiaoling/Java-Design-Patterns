package Observer.postOffice;

public class TestObserver {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        Person Chris = new Person("Chris");
        Person John = new Person("John");
        Mail m = new Mail("John", "Dundee", "You 've got a secret lover");

        postOffice.attach(Chris);
        postOffice.attach(John);

        postOffice.addMail(m);


    }
}
