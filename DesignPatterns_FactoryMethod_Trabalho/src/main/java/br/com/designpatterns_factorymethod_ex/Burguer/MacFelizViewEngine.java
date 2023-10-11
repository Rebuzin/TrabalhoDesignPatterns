package br.com.designpatterns_factorymethod_ex.Burguer;

import java.util.Map;

public class MacFelizViewEngine implements ViewBurguer{

    String[] vetorMacTriste = {"Carne de Soja", "Alface", "Tofu"};
    
    public String montarHamburger(String burguerName) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hamburguer Vegano: ");
        
        for (String item : vetorMacTriste) {
            builder.append(item).append(", ");
        }

        if (vetorMacTriste.length > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }

        return builder.toString();
    }



    
}
