import java.util.Comparator;

public class Product {
    private String id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ". " +
                "\t" + name +
                "\t" + price;
    }
}

class AscendingSortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2){
        if (p1.getPrice() > p2.getPrice()){
            return 1;
        } else if (p1.getPrice() < p2.getPrice()){
            return -1;
        } else {
            return 0;
        }
    }
}

class DescendingSortByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2){
        if (p1.getPrice() > p2.getPrice()){
            return -1;
        } else if (p1.getPrice() < p2.getPrice()){
            return 1;
        } else {
            return 0;
        }
    }
}
