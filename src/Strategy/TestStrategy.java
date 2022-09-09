package Strategy;

public class TestStrategy {
    //first: all we need to do is to swap out our strageties,each stragety has complely set of rules
    //second: as far as Credit Card is concerned, it just knows the stragety we pass in, the context of it stays the same, the only changes is the stragtegy.
    //third: it eliminated all that if-else in Credit Card class.
    public static void main(String[] args) {
        //Credit Card
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: "+ amexCard.isValid());

        //Visa Card
        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4539589763663402");
        visaCard.setDate("05/2018");
        visaCard.setCvv("324");

        System.out.println("Is Visa valid: " + visaCard.isValid());


    }
}
