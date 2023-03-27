package Prototype.xmas;

import java.util.List;
import java.util.stream.Collectors;

public class MainAppPrototype
{
    static List<String> cardReceivers = List.of(
            "bill@mail.com",
            "charlie@mail.com",
            "fred@mail.com",
            "george@mail.com",
            "percy@mail.com",
            "ronald@mail.com",
            "ginny@mail.com",
            "hermione@mail.com"
    );
    public static void main( String[] args )
    {
        CardTemplateVintage xmasCardVintage = new CardTemplateVintage()
                .setFolding(false)
                .setImageURL("https://www.publicdomainpictures.net/pictures/240000/nahled/snowman-christmas-card.jpg")
                .setHasFrontText(true)
                .setFrontText("Merry Christmas")
                .setInsideText("Best Wishes for you and your Family")
                .setFooterText(" From Potter Family ")
                .setStamp(new VintageStamp());

        final List<Card> cardsToSend = cardReceivers.stream()
                .map(rx -> xmasCardVintage.clone().setRecipientAddress(rx))
                .collect(Collectors.toList());

        CardMailer mailer = new CardMailer();
                mailer.sendCards(cardsToSend);

        CardTemplateModern xmasCardModern = new CardTemplateModern()
                .setFolding(true)
                .setImageURL("https://www.publicdomainpictures.net/pictures/240000/nahled/snowman-christmas-card.jpg")
                .setHasFrontText(false)
                .setFrontText("Merry Christmas")
                .setInsideText("Best Wishes for you and your Family")
                .setFooterText(" From Potter Family ");

    }

    //Question remains: How to pass in a paramter in the VintageStamp?
}
