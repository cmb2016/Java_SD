package onlineshop;

/**
 * Created by CMB on 02/11/2016.
 */


public abstract class Stock implements IStock {
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
    public Stock(String name, Date date){
        this.name = name;
        this.releaseDate = date;
    }

    //Setters & Getters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calcDownloadSize();
    
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
