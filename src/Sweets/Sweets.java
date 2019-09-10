package Sweets;

public abstract class Sweets {
    public  String title;
    public double weight;
    public double price;

    public Sweets(String title, double weight, double price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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

    @Override
    public String toString() {
        return  title + " весом " + weight + " кг " + " по цене " + price + " рублей";
    }
}

