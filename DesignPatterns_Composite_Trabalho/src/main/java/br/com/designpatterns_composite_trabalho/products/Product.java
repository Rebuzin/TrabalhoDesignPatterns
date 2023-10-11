package br.com.designpatterns_composite_trabalho.products;

import br.com.designpatterns_composite_trabalho.Box;
import lombok.Data;

@Data
public abstract class Product implements Box {
    
    protected final String title;
    protected final double price;
    
}
