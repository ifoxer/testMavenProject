package Sweet;

public class cake extends sweet {
    private String color;

    public cake(String name, double price, double weight, String color) {
        super(name, price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "cake {" + super.toString() + "color = " + color + " " + '}';
    }
}
