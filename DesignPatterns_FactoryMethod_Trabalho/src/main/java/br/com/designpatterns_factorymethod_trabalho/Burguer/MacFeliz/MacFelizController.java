package br.com.designpatterns_factorymethod_trabalho.Burguer.MacFeliz;

import br.com.designpatterns_factorymethod_ex.Burguer.ControllerMacFeliz;
import br.com.designpatterns_factorymethod_ex.Burguer.ViewBurguer;

public class MacFelizController extends ControllerMacFeliz{


    @Override
    protected ViewBurguer createViewEngine(){
    return new MacFelizViewEngine();
    }
    
}
