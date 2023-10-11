package br.com.designpatternModelPerderPeso;

import br.com.designpatternInterface.Button;


public class PerderPesoButton implements Button {

    @Override
    public void render() {
    
        System.out.println("PERDER PESO");
        
    }
    
}
