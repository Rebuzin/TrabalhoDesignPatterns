package br.com.designpatterns_factorymethod_trabalho;

import br.com.designpatterns_factorymethod_trabalho.Burguer.MacFeliz.MacFelizController;
import br.com.designpatterns_factorymethod_ex.Burguer.ControllerMacFeliz;
import java.util.HashMap;
import java.util.Map;

public class BurguerController extends ControllerMacFeliz{

public void listProducts(){
    
       String nome = "Hamburguer MacFeliz";
       
        montarHamburger(nome);
   
    }
    
}
