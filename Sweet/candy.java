package Sweet;

public class candy extends sweet{
    private String brand;

    public candy(String name, double price, double weight, String brand) {
        super(name, price, weight);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "candy {" + super.toString()+ "brand = " + brand + " " + '}';
    }
}
