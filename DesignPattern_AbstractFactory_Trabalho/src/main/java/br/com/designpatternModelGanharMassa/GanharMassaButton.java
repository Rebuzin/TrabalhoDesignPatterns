package br.com.designpatternModelGanharMassa;

import br.com.designpatternInterface.Button;


public class GanharMassaButton implements Button {

    @Override
    public void render() {
        System.out.println("GANHAR MASSA");
    }
    
}
