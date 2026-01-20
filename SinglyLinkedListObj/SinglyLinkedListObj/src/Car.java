public class Car {
    private String id;
    private String name;
    private int color;
    private double price;

    public Car(){}
    
    public Car(String id, String name, int color, double price) {
        this.id = id;
        this.name = name;
        this.color = color;
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

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + '}';
    }
}
