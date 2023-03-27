package Prototype.xmas;

import java.util.List;

public class CardMailer {

    public void sendCards(List<Card> cards ) {
        cards.stream()
                .forEach(c -> System.out.println(
                        String.format("Card %s will be sent out to address: %s | body: %s",
                                c.hashCode(),
                                c.getRecipientAddress(),
                                c
                        )
                ));

    }
}
