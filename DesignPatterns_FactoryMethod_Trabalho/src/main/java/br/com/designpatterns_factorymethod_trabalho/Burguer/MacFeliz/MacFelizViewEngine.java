package br.com.designpatterns_factorymethod_trabalho.Burguer.MacFeliz;

import java.util.Map;
import br.com.designpatterns_factorymethod_ex.Burguer.ViewBurguer;

public class MacFelizViewEngine implements ViewBurguer{

    private String[] vetorMacFeliz = {"Carne Angus", "Cheddar", "Molho Especial"}; 
    
    public String montarHamburger(String burguerName) {
        StringBuilder builder = new StringBuilder();
        builder.append("Burguer Vegano: ");
        
        for (String item : vetorMacFeliz) {
            builder.append(item).append(", ");
        }

        if (vetorMacFeliz.length > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }

        return builder.toString();
    }


    
}
