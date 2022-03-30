package factory;

public class Vehicle extends Product{
    private int qty;
    private double price;


    void calcTotal(int price , int qty){
        this.price=price;
        this.qty=qty;
        System.out.println("The total price is" + " " + this.price * this.qty );
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }






}