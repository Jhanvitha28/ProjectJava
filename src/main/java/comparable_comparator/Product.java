package comparable_comparator;
import java.util.*;

class Product implements Comparable<Product> {
    private double weight;
    private double price;
    private int id;

    // Constructor
    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    // Getters and setters

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Implementing the Comparable interface
    @Override
    public int compareTo(Product otherProduct) {
        // Compare based on price
        return Double.compare(this.price, otherProduct.price);
    }

    // toString method to represent the object as a string
    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        // Creating a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(2.5, 20.0, 1));
        products.add(new Product(1.8, 15.0, 2));
        products.add(new Product(3.0, 25.0, 3));

        // Sorting the list using Collections.sort() which uses compareTo
        Collections.sort(products);

        // Displaying the sorted list
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
