package br.com.designpatterns_observer_trabalho;

import java.util.Arrays;

public class DesignPatterns_Observer_Trabalho {

   public static void main(String[] args) {
        Stock acao1 = new Stock("Coca-Cola", 150f);
        Stock acao2 = new Stock("Sukita", 400f);

        StatusBar statusBar = new StatusBar(Arrays.asList(acao1, acao2));
        StockListView stockListView = new StockListView(Arrays.asList(acao1, acao2));

        acao1.setPreco(200f);
        acao2.setPreco(400f);
    }
   
}
