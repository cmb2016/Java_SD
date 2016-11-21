/**
 * Created by CMB on 02/11/2016.
 */


public class Stock {
    private String name;
    private double price;
    private Date releaseDate;
    private int quantity;

    //User-defined constructor
    public Stock(String name, double price, Date releaseDate){
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    //overloaded constructor
    public Stock(int quantity){
        setQuantity(quantity);
    }

    //overloaded constructor
    public Stock(String name){
        this.name = name;
    }

    //Setters & Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", quantity=" + quantity +
                '}';
    }
}
