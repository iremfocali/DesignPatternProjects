package SecondOne;

import SecondOne.Model.Product;

import java.util.ArrayList;

public class Cart {
    private Shopping sproduct;
    public Cart(Shopping sproduct) {
        this.sproduct = sproduct;
    }
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }
    public double getTotalPrice(){
        return sproduct.calculatePrice(products);
    }
}
