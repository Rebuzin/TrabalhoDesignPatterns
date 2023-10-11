package br.com.designpatterns_strategy_trabalho;


public class PaymentStorage {
    
    public void store(String dsPagamento, FormaPagamento formaPagamento) {
        formaPagamento.pagamento(dsPagamento);
    }
    
}
