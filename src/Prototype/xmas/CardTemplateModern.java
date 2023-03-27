package Prototype.xmas;

public class CardTemplateModern implements Card {

    private boolean folding;
    private String imageURL;
    private boolean hasFrontText;
    private String frontText;
    private String insideText;
    private String footerText;
    private String recipientAddress;

    @Override
    public CardTemplateModern clone() {
        CardTemplateModern clone = new CardTemplateModern()
                .setFolding(folding)
                .setImageURL(imageURL)
                .setHasFrontText(hasFrontText)
                .setFrontText(frontText)
                .setInsideText(insideText)
                .setFooterText(footerText)
                .setRecipientAddress(recipientAddress);
        return clone;
    }

    @Override
    public boolean isFolding() {
        return folding;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }

    @Override
    public String getFrontText() {
        return frontText;
    }

    public boolean hasFrontText() {
        return hasFrontText;
    }

    public String getInsideText() {
        return insideText;
    }

    @Override
    public String getFooterText() {
        return footerText;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }


    public CardTemplateModern setFolding(final boolean folding) {
        this.folding = folding;
        return this;
    }

    public CardTemplateModern setImageURL(final String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public CardTemplateModern setFrontText(final String frontText) {
        this.frontText = frontText;
        return this;
    }

    public CardTemplateModern setHasFrontText(final boolean hasFrontText) {
        this.hasFrontText = hasFrontText;
        return this;
    }

    public CardTemplateModern setInsideText(final String insideText) {
        this.insideText = insideText;
        return this;
    }

    public CardTemplateModern setFooterText(final String footerText) {
        this.footerText = footerText;
        return this;
    }

    public CardTemplateModern setRecipientAddress(final String recipientAddress) {
        this.recipientAddress = recipientAddress;
        return this;
    }

    @Override
    public String toString() {
        return "{\"Card\":{" + "   "
                + "   \"folding\":\"" + folding + "\""
                + ",  \"hasFrontText\":\"" + hasFrontText + "\""
                + ",  \"frontText\":\"" + frontText + "\""
                + ",  \"insideText\":\"" + insideText + "\""
                + ",  \"footerText\":\"" + footerText + "\""
                + ",  \"imageURL\":\"" + imageURL + "\""
                + ",  \"recipientAddress\":\"" + recipientAddress + "\"" + "}}";
    }
}
