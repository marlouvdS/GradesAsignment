package BlackJackOpdracht3;

public class Card {
    private String value;
    private String color;
    private String icon;
    private int points;



    public Card (String value, String icon) {
        this.value = value;
        this.icon = icon;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}
