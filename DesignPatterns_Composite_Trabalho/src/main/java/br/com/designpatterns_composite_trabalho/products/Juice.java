package br.com.designpatterns_composite_trabalho.products;

public class Juice extends Product{

    public Juice(String title, double price) {
        super(title, price);
    }

  
    
    
    @Override
    public double calculatePrice() {
    return getPrice();
    }
    
}
