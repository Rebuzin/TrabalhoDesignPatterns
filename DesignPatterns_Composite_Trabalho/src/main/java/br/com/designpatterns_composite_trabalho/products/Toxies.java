
package br.com.designpatterns_composite_trabalho.products;

public class Toxies extends Product {

    public Toxies(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
    
}
