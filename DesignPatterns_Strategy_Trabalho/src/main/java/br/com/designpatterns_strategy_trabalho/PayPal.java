package br.com.designpatterns_strategy_trabalho;

public class PayPal implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
        
        System.out.println("Forma Pagamento: Selecionou PayPal");
        
    }
    
    
    
}
