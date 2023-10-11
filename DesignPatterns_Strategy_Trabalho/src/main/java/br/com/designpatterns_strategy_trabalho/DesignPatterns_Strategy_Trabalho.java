
package br.com.designpatterns_strategy_trabalho;

public class DesignPatterns_Strategy_Trabalho {

    public static void main(String[] args) {
        
        PaymentStorage paymentStorage = new PaymentStorage();
        
        paymentStorage.store("Selecionado:", new FormaPagamentoAleatoria());
        paymentStorage.store("Selecionado: ", new Dinheiro());
        paymentStorage.store("Selecionado: ", new PayPal());
        paymentStorage.store("Selecionado: ", new Bitcoin());
        
    }
}
