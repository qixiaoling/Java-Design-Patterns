package Prototype.xmas;

public class CardTemplateVintage implements Card {

    private boolean folding;
    private String imageURL;
    private boolean hasFrontText;
    private String frontText;
    private String insideText;
    private String footerText;
    private String recipientAddress;

    private VintageStamp stamp;

    public CardTemplateVintage() {
        this.stamp = new VintageStamp();//deep copy, every copy will have its own stamp object.
        //this.stamp = vintage.stamp; shallow copy, stamp is for all the copies.
    }

    @Override
    public CardTemplateVintage clone() {
        CardTemplateVintage clone = new CardTemplateVintage()
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

    public boolean isHasFrontText() {
        return hasFrontText;
    }

    public VintageStamp getStamp() {
        return stamp;
    }

    public CardTemplateVintage setStamp(VintageStamp stamp) {
        this.stamp = stamp;
        return this;
    }

    public CardTemplateVintage setFolding(final boolean folding) {
        this.folding = folding;
        return this;
    }

    public CardTemplateVintage setImageURL(final String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public CardTemplateVintage setFrontText(final String frontText) {
        this.frontText = frontText;
        return this;
    }

    public CardTemplateVintage setHasFrontText(final boolean hasFrontText) {
        this.hasFrontText = hasFrontText;
        return this;
    }

    public CardTemplateVintage setInsideText(final String insideText) {
        this.insideText = insideText;
        return this;
    }

    public CardTemplateVintage setFooterText(final String footerText) {
        this.footerText = footerText;
        return this;
    }

    public CardTemplateVintage setRecipientAddress(final String recipientAddress) {
        this.recipientAddress = recipientAddress;
        return this;
    }

    @Override
    public String toString() {
        return "CardTemplateVintage{" +
                "folding=" + folding +
                ", imageURL='" + imageURL + '\'' +
                ", hasFrontText=" + hasFrontText +
                ", frontText='" + frontText + '\'' +
                ", insideText='" + insideText + '\'' +
                ", footerText='" + footerText + '\'' +
                ", recipientAddress='" + recipientAddress + '\'' +
                ", stamp=" + stamp +
                '}';
    }
}
