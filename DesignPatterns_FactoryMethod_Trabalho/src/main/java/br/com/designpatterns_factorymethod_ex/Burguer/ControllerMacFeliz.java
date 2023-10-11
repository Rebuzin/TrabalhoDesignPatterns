package br.com.designpatterns_factorymethod_ex.Burguer;

import java.util.Map;

public class ControllerMacFeliz {

public void montarHamburger(String burguerName) {
       ViewBurguer engine = createViewEngine();
        String html = engine.montarHamburger(burguerName);
        System.out.println(html);
    }

    protected ViewBurguer createViewEngine(){
    return new MacFelizViewEngine();
    }
    
}
