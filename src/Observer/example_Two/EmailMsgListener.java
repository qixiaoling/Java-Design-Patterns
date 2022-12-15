package Observer.example_Two;

public class EmailMsgListener {
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    public void update(){
        //actually send the mail
    }
}
